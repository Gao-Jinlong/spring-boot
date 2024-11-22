package site.ginlon.QuickStart.pojo.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDto {
  private Integer userId;

  private String username;

  private String password;

  private String email;

  public Integer getUserId() {
    return userId;
  }

  @NotBlank(message = "用户名不能为空")
  public String getUsername() {
    return username;
  }

  @NotBlank(message = "密码不能为空")
  @Length(min = 6, max = 18, message = "密码长度必须在6到18个字符之间")
  public String getPassword() {
    return password;
  }

  @NotBlank(message = "邮箱不能为空")
  @Email(message = "邮箱格式不正确")
  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "UserDto [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + "]";
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
