package com.imperat0.Memelandia_ebac.repositories;

import com.imperat0.Memelandia_ebac.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
