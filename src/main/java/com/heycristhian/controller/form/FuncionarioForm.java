package com.heycristhian.controller.form;

import com.heycristhian.model.Cargo;
import com.heycristhian.model.Funcionario;
import com.heycristhian.repository.CargoRepository;

import java.time.LocalDate;

public class FuncionarioForm {

	private Long id;
	private String nome;
	private String cpf;	
	private String descricaoCargo;

	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario converter(CargoRepository repository) {
		Cargo cargo = repository.findByDescricao(this.descricaoCargo);
		return new Funcionario(this.id, this.nome, this.cpf, cargo);
	}

	@Override
	public String toString() {
		return "FuncionarioForm{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", descricaoCargo='" + descricaoCargo + '\'' +
				'}';
	}
}
