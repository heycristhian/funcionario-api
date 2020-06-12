package com.heycristhian.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.heycristhian.controller.dto.FuncionarioDto;
import com.heycristhian.controller.form.FuncionarioForm;
import com.heycristhian.model.Funcionario;
import com.heycristhian.repository.CargoRepository;
import com.heycristhian.repository.FuncionarioRepository;

@RestController
@CrossOrigin
@RequestMapping("service/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Autowired
	private CargoRepository cargoRepository;

	@GetMapping
	@Transactional
	public List<FuncionarioDto> hello(String consulta) {
		List<Funcionario> funcionarios;
		if (consulta == null) {
			funcionarios = funcionarioRepository.findAll();
		} else {
			funcionarios = funcionarioRepository.findByNome(consulta);
		}

		return FuncionarioDto.converter(funcionarios);
	}

	@PostMapping
	@Transactional
	public ResponseEntity<FuncionarioDto> inserirFuncionario(@RequestBody FuncionarioForm funcionarioForm, UriComponentsBuilder uriBuilder) {
		Funcionario funcionario = funcionarioForm.converter(cargoRepository);
		funcionarioRepository.save(funcionario);
		
		URI uri = uriBuilder.path("/totvs-service/funcionarios/{id}").buildAndExpand(funcionario.getId()).toUri();
		return ResponseEntity.created(uri).body(new FuncionarioDto(funcionario));
	}
}
