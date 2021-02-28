/**
 * 
 */
package com.app.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class GlobalExceptionhandler extends ResponseEntityExceptionHandler {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@ExceptionHandler(CommonException.class)
	public Response<String> handleCommonException(CommonException e){
		log.error("Exception Occurred >>>{}",e);
		return new Response<>(e.getIsSuccess(), e.getMessage(), e.getStatus());
		
	}

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> handleNotFoundException(NotFoundException e){
		log.error("Exception Occurred >>>{}",e);
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<Object> handleBadRequestException(BadRequestException e){
		log.error("Exception Occurred >>>{}",e);
		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

	}
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public Response<String> handleSQLTransientConnectionException(Exception e){
		log.error("Handling Exception at global  >>>{}",e);
		return new Response<>(false, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

	
	@ExceptionHandler(IllegalStateException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public Response<String> illegalStateException(Exception e){
		log.error("Handling Exception at IllegalStateException  >>>{}",e);
		System.out.println("Handling Exception at IllegalStateException  >>>{}");
		return new Response<>(false, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
