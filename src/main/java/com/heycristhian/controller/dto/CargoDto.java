package com.heycristhian.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.heycristhian.model.Cargo;

public class CargoDto {

	private Long id;
	private String descricao;

	public CargoDto(Cargo cargo) {
		this.descricao = cargo.getDescricao();
		this.id = cargo.getId();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public static List<CargoDto> converter(List<Cargo> cargos) {
		return cargos.stream().map(CargoDto::new).collect(Collectors.toList());
	}

}
