package br.com.samuelramon.estudospringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samuelramon.estudospringboot.entity.Veiculo;
import br.com.samuelramon.estudospringboot.repository.VeiculoRepository;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

import java.util.List;

@RestController
@RequestMapping("/v1/veiculos")
public class VeiculoController {

	private VeiculoRepository veiculos;
	
	public VeiculoController(VeiculoRepository veiculos) {
		this.veiculos = veiculos;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Veiculo>> all() {
		return ok(this.veiculos.findAll());
	}
	
	public ResponseEntity<Veiculo> save(@RequestBody VeiculoForm form) {
		
	}
}
