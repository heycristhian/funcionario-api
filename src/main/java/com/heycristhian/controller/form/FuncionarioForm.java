package com.heycristhian.controller.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.heycristhian.model.Cargo;
import com.heycristhian.model.Funcionario;
import com.heycristhian.repository.CargoRepository;

public class FuncionarioForm {

	private String nome;	
	private String cpf;	
	private LocalDate dataNascimento;	
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Funcionario converter(CargoRepository repository) {
		Cargo cargo = repository.findByDescricao(this.descricaoCargo);
		return new Funcionario(this.nome, this.cpf, this.dataNascimento, cargo);
	}

}
