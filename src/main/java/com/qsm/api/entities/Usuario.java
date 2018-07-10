package com.qsm.api.entities;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "user")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1685248114702591362L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(columnDefinition="tinyint(1) default 1")
	private boolean Enabled;

	// ENDEREÇO ----
	@Column
	private String andar;

	@Column
	private String apt;

	@Column
	private String bairro;

	@Column
	private String bloco;

	@Column
	private String city;

	@Column
	private String edificio;

	@Column
	private String numero;

	@Column
	private String obs;

	@Column
	private String rua;

	@Column
	private String state;

	// -------
	@Column
	private String name;

	@Column
	private String telefone;

	@Column
	private String valor;

	@Column
	private String email;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "operadora_id")
	private Operadora operadora;
	


//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "observacao_id") // Esta coluna está na tabela "observacao".
//	private List<Observacao> observacoes;


	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public boolean getEnabled() {
		return Enabled;
	}

	public void isEnabled(boolean enabled) {
		Enabled = enabled;
	}

	public void setEnabled(boolean enabled) {
		Enabled = enabled;
	}

//	public List<Observacao> getObservacoes() {
//		return observacoes;
//	}
//
//	public void setObservacoes(List<Observacao> observacoes) {
//		this.observacoes = observacoes;
//	}
}
