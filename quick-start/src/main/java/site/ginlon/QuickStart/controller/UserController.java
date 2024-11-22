package site.ginlon.QuickStart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.ginlon.QuickStart.pojo.ResponseMessage;
import site.ginlon.QuickStart.pojo.User;
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

}
