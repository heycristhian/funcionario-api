package com.heycristhian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heycristhian.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long>{

	Cargo findByDescricao(String descricaoCargo);

}
