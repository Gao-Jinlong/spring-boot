package site.ginlon.QuickStart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.ginlon.QuickStart.pojo.ResponseMessage;
import site.ginlon.QuickStart.pojo.User;
import site.ginlon.QuickStart.pojo.dto.UpdateUserDto;
import site.ginlon.QuickStart.pojo.dto.UserDto;
import site.ginlon.QuickStart.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private IUserService userService;

  @PostMapping
  public ResponseMessage<User> register(@Validated @RequestBody UserDto userDto) {
    System.out.println(userDto);
    return ResponseMessage.success(userService.register(userDto));
  }

  @GetMapping("/{userId}")
  public ResponseMessage<User> getUserById(@PathVariable Integer userId) {
    User userNew = userService.getUserById(userId);

    return ResponseMessage.success(userNew);
  }

  @PutMapping
  public ResponseMessage<User> updateUser(@Validated @RequestBody UpdateUserDto updateUserDto) {
    return ResponseMessage.success(userService.updateUser(updateUserDto));
  }

  @DeleteMapping("/{userId}")
  public ResponseMessage<String> deleteUser(@PathVariable Integer userId) {
    userService.deleteUser(userId);
    return ResponseMessage.success("删除成功");
  }

}
