package com.example.viaCep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.viaCep.model.Cep;

@Repository
public interface CepRepository extends CrudRepository<Cep,Long>{
	List<Cep> findAll();
	Cep findById(long id);

	Cep findByCep(String cep);
}
