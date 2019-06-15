package br.com.samuelramon.estudospringboot.form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleForm {

	@SuppressWarnings("unused")
	private String name;
}
