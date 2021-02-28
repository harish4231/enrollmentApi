/**
 * 
 */
package com.app.exception;

import org.springframework.http.HttpStatus;


public class CommonException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Boolean isSuccess;

	private HttpStatus status;

	private String message;

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CommonException(Boolean isSuccess, HttpStatus status, String message) {
		super();
		this.isSuccess = isSuccess;
		this.status = status;
		this.message = message;
	}

	public CommonException() {
		super();
	}

}
