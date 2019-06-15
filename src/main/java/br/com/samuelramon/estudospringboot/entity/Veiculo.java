package br.com.samuelramon.estudospringboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="veiculos")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 364248230208067544L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
}
