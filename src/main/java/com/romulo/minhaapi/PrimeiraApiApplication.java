package com.romulo.minhaapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.romulo.minhaapi.domain.Usuario;
import com.romulo.minhaapi.repositories.UsuarioRepository;

@SpringBootApplication
public class PrimeiraApiApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiraApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Romulo silva", "Romulo", "123"); //instancia do usuario
		Usuario u2 = new Usuario(null, "Maria", "silva", "123");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
	}

}
