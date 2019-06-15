package br.com.samuelramon.estudospringboot.exception;

import org.springframework.security.core.AuthenticationException;

public class InvalidJwtAuthenticationException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5254873681595241097L;

	public InvalidJwtAuthenticationException(String e) {
		super(e);
	}
}
