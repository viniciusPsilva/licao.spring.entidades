package com.licao.spring.Entidades.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Entity
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
@Builder
@Getter
@Setter
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable=false)
	@Size(min = 1, max = 60)
	private String name;

	@Column(nullable=false)
	@Size(min = 1, max = 60)
	private String descricao;
	
	@Column(nullable = false)
	private BigDecimal valor;
	
	@Column(nullable = false,columnDefinition = "boolean default false")
	private boolean disponivel;
	
}
