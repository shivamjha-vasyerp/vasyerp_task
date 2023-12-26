package com.example.task6.dto;


public class ResponseDto {
	private int status;
	private Object data;
	private String message;

	public ResponseDto(int status, Object data, String message) {
		super();
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public ResponseDto() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseDto [status=" + status + ", data=" + data + ", message=" + message + "]";
	}
}
