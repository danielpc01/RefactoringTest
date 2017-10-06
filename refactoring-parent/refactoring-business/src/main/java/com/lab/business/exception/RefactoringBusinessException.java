package com.lab.business.exception;
/***
 * 
 * @author Daniel Pena Cueva
 *
 */
public class RefactoringBusinessException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;
	private String message;
	private Exception rootCause;

	public RefactoringBusinessException(String message) {

		super(message);
		this.message = message;
	}

	public RefactoringBusinessException(String code, String message) {

		super(message);
		this.code = code;
		this.message = message;
	}

	public RefactoringBusinessException(Exception rootCause) {

		this.rootCause = rootCause;
		this.message = rootCause.getMessage();
	}

	public RefactoringBusinessException(String message, Exception rootCause) {

		super(message, rootCause);
		this.message = message;
		this.rootCause = rootCause;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getRootCause() {
		return rootCause;
	}

	public void setRootCause(Exception rootCause) {
		this.rootCause = rootCause;
	}
}
