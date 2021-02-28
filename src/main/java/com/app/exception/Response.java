package com.app.exception;

import org.springframework.http.HttpStatus;

public class Response<T> {
	private Boolean isSuccess = Boolean.TRUE;
	private Boolean responseStatus;
	private String message = "";
	private HttpStatus status;
	private T data;
	

	public Response() {
		super();
	}

	public Response(Boolean isSuccess, String message, HttpStatus status) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
		this.status = status;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Boolean getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(Boolean responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	

}
