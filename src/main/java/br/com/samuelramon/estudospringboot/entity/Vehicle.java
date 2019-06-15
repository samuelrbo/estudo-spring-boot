package br.com.samuelramon.estudospringboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.samuelramon.estudospringboot.domain.AbstractAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Vehicle extends AbstractAuditableEntity<User, Long> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9037054065824975930L;

	@Column
	private String name;
}
