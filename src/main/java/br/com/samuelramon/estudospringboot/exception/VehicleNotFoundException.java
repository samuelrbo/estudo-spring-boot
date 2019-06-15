package br.com.samuelramon.estudospringboot.exception;

public class VehicleNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2596402936333564125L;

	public VehicleNotFoundException() {}
	
	public VehicleNotFoundException(Long vehicleId) {
		super("Vehicle: "+ vehicleId+" not found.");
	}
}
