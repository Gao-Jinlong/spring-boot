package site.ginlon.QuickStart.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.ginlon.QuickStart.pojo.User;
import site.ginlon.QuickStart.pojo.dto.UpdateUserDto;
import site.ginlon.QuickStart.pojo.dto.UserDto;
import site.ginlon.QuickStart.repository.UserRepository;

@Service
public class UserService implements IUserService {

  @Override
  public void deleteUser(Integer userId) {
    userRepository.deleteById(userId);
  }

  @Override
  public User updateUser(UpdateUserDto updateUserDto) {
    User user = userRepository.findById(updateUserDto.getUserId())
        .orElseThrow(() -> new IllegalArgumentException("用户不存在"));

    BeanUtils.copyProperties(updateUserDto, user);

    return userRepository.save(user);
  }

  @Autowired
  private UserRepository userRepository;

  @Override
  public User register(UserDto userDto) {

    User userPojo = new User();

    BeanUtils.copyProperties(userDto, userPojo);

    return userRepository.save(userPojo);
  }

  @Override
  public User getUserById(Integer userId) {
    return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("用户不存在"));
  }

}
