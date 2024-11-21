package site.ginlon.QuickStart.service;

import site.ginlon.QuickStart.pojo.User;
import site.ginlon.QuickStart.pojo.dto.UserDto;

public interface IUserService {

  /**
   * 注册用户
   *
   * @param user
   * @return
   */
  public User register(UserDto userDto);
}
