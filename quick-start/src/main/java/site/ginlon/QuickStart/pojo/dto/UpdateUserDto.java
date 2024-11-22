package site.ginlon.QuickStart.pojo.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UpdateUserDto {

  @NotNull(message = "用户ID不能为空")
  private Integer userId;

  @NotBlank(message = "用户名不能为空")
  private String username;

  @Length(min = 6, max = 18, message = "密码长度必须在6到18个字符之间")
  private String password;

  @Email(message = "邮箱格式不正确")
  private String email;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
