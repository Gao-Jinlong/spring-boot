package site.ginlon.QuickStart.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.ginlon.QuickStart.pojo.User;
import site.ginlon.QuickStart.pojo.dto.UserDto;
import site.ginlon.QuickStart.repository.UserRepository;

@Service
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User register(UserDto userDto) {

    User userPojo = new User();

    BeanUtils.copyProperties(userDto, userPojo);

    return userRepository.save(userPojo);
  }
}
