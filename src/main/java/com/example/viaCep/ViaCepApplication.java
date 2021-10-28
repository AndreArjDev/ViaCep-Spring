package com.example.viaCep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.viaCep.model.Cep;
import com.example.viaCep.repository.CepRepository;

@SpringBootApplication
public class ViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplication.class, args);
	}




@Bean
public CommandLineRunner demo(CepRepository repository) {
  return (args) -> {
    // save a few customers
    repository.save(new Cep("90010282", "Duque de Caxias","Centro", "Porto Alegre","RS","51"));
    repository.save(new Cep("90012283", "Fernando Machado", "Centro","Porto Alegre", "RS","51"));
};
}
}