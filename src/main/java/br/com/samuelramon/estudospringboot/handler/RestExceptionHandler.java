package br.com.samuelramon.estudospringboot.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import br.com.samuelramon.estudospringboot.exception.InvalidJwtAuthenticationException;
import br.com.samuelramon.estudospringboot.exception.VehicleNotFoundException;
import lombok.extern.slf4j.Slf4j;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.status;

@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

	@ExceptionHandler(value = {VehicleNotFoundException.class})
	public ResponseEntity<?> vehicleNotFound(VehicleNotFoundException ex, WebRequest request) {
		log.debug("Handling VehicleNotFoundException ...");
		return notFound().build();
	}
	
	public ResponseEntity<?> invalidJwtAuthentication(InvalidJwtAuthenticationException ex, WebRequest request) {
		log.debug("Handling InvalidJwtAuthenticationException ...");
		return status(UNAUTHORIZED).build();
	}
}
