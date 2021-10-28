package com.example.viaCep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.viaCep.model.Cep;
import com.example.viaCep.repository.CepRepository;

@RestController
@RequestMapping("/api")
public class CepController {
	
	@Autowired
	public CepRepository CepRepository;
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public Cep findById(@PathVariable("id") Integer id) {
		return this.CepRepository.findById(id);
		
	}
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public List<Cep> findAll() {
		 List<Cep> cep = this.CepRepository.findAll();
		 return cep;
	}
	@RequestMapping(value = "/cep/{cep}", method = RequestMethod.GET, produces = "application/json")
	public Cep findByNumeroCep(@PathVariable("cep") String cep) {
		return this.CepRepository.findByCep(cep);
		
	}
}

