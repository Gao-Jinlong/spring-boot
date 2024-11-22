package site.ginlon.QuickStart.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import site.ginlon.QuickStart.pojo.ResponseMessage;

@RestControllerAdvice
public class GloablExceptionHandler {

  Logger logger = LoggerFactory.getLogger(GloablExceptionHandler.class);

  @ExceptionHandler({ Exception.class })
  public ResponseMessage<String> handleException(Exception e) {
    logger.error(e.getMessage(), e);
    return ResponseMessage.error(e.getMessage());
  }
}
