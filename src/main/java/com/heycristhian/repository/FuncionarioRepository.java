package com.heycristhian.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heycristhian.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	List<Funcionario> findByNome(String consulta);

}
