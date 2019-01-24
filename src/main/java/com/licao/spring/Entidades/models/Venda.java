package com.licao.spring.Entidades.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Item> itens = new ArrayList<>();

	@Column(nullable = false)
	private BigDecimal valor = new BigDecimal("0.0");

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Venda calcularValorTotal() {
		double total = this.getItens().stream().mapToDouble(item -> item.calcularvalorTotal().doubleValue()).sum();
		this.setValor(new BigDecimal(total));
		
		return this;
	}

}
