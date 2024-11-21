package site.ginlon.QuickStart.pojo.dto;

public class UserDto {
  private Integer userId;

  private String username;

  private String password;

  private String email;

  public Integer getUserId() {
    return userId;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

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
