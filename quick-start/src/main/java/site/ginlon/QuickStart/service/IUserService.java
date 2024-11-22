package site.ginlon.QuickStart.service;

import site.ginlon.QuickStart.pojo.User;
import site.ginlon.QuickStart.pojo.dto.UpdateUserDto;
import site.ginlon.QuickStart.pojo.dto.UserDto;

public interface IUserService {

  /**
   * 注册用户
   *
   * @param user
   * @return
   */
  public User register(UserDto userDto);

  /**
   * 根据用户ID获取用户
   *
   * @param userId
   * @return
   */
  public User getUserById(Integer userId);

  /**
   * 修改用户信息
   *
   * @param username
   * @return
   */
  public User updateUser(UpdateUserDto updateUserDto);

  /**
   * 删除用户
   *
   * @param userId
   */
  public void deleteUser(Integer userId);
}
