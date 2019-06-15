package br.com.samuelramon.estudospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuelramon.estudospringboot.entity.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
