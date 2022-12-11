package com.romulo.minhaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romulo.minhaapi.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{ //<Tipo da classe (usuario), Tipo do atributo identificador (Integer)>

}
 