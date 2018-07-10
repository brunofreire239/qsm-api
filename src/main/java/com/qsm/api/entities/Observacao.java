package com.qsm.api.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="observacao")
public class Observacao implements Serializable{
	
	private static final long serialVersionUID = 6880727368740915667L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name="nome_criador")
	private String nomeCriador;
	
	@Column
	private String texto;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id")
//	private Usuario usuario;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomeCriador() {
		return nomeCriador;
	}


	public void setNomeCriador(String nomeCriador) {
		this.nomeCriador = nomeCriador;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}	
//	
}
