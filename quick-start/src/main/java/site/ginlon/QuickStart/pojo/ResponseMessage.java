package site.ginlon.QuickStart.pojo;

import org.springframework.http.HttpStatus;

public class ResponseMessage<T> {
  public static <T> ResponseMessage<T> success(T data) {
    return new ResponseMessage<>(HttpStatus.OK.value(), "success", data);
  }

  private String message;
  private Integer code;

  private T data;

  public ResponseMessage(Integer code, String message, T data) {
    this.message = message;
    this.code = code;
    this.data = data;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public Integer getCode() {
    return code;
  }

  public T getData() {
    return data;
  }

}
