package com.heycristhian.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.heycristhian.model.Funcionario;

public class FuncionarioDto {

	private Long id;
	private String nome;
	private CargoDto cargo;
	private String cpf;
	private LocalDate dataNascimento;

	public FuncionarioDto(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.cargo = new CargoDto(funcionario.getCargo());
		this.cpf = funcionario.getCpf();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public CargoDto getCargo() {
		return cargo;
	}

	public String getCpf() { return cpf; }

	public static List<FuncionarioDto> converter(List<Funcionario> funcionarios) {
		return funcionarios.stream().map(FuncionarioDto::new).collect(Collectors.toList());
	}

}
