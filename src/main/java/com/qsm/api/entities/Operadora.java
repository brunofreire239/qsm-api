package com.qsm.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "operadora")
public class Operadora {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column
	private String name;

	@Column(columnDefinition="tinyint(1) default 1")
	private boolean Enabled;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Usuario> usuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
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


}
