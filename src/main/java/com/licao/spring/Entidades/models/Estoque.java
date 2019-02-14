package com.licao.spring.Entidades.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.licao.spring.Entidades.enuns.StatusEstoque;

@Entity
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private Produto produto;

	@Column(nullable = false)
	private int quantidade;

	@Column(nullable = false)
	private int quantidadeStatusOk;
	
	@Column(nullable = false)
	private int quantidadeStatusBaixo;
	
	@Column(nullable = false)
	private int quantidadeStatusAlto;

	@Enumerated(EnumType.STRING)
	private StatusEstoque status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeStatusOk() {
		return quantidadeStatusOk;
	}

	public void setQuantidadeStatusOk(int quantidadeStatusOk) {
		this.quantidadeStatusOk = quantidadeStatusOk;
	}

	public int getQuantidadeStatusBaixo() {
		return quantidadeStatusBaixo;
	}

	public void setQuantidadeStatusBaixo(int quantidadeStatusBaixo) {
		this.quantidadeStatusBaixo = quantidadeStatusBaixo;
	}

	public int getQuantidadeStatusAlto() {
		return quantidadeStatusAlto;
	}

	public void setQuantidadeStatusAlto(int quantidadeStatusAlto) {
		this.quantidadeStatusAlto = quantidadeStatusAlto;
	}

	public StatusEstoque getStatus() {
		return status;
	}

	public void setStatus(StatusEstoque status) {
		this.status = status;
	}
}
