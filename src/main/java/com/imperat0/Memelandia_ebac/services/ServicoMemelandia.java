package com.imperat0.Memelandia_ebac.services;

import com.imperat0.Memelandia_ebac.entities.CategoriaMeme;
import com.imperat0.Memelandia_ebac.entities.Meme;
import com.imperat0.Memelandia_ebac.entities.Usuario;
import com.imperat0.Memelandia_ebac.repositories.RepositorioCategoriaMeme;
import com.imperat0.Memelandia_ebac.repositories.RepositorioMeme;
import com.imperat0.Memelandia_ebac.repositories.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoMemelandia {
    @Autowired
    private RepositorioMeme repositorioMeme;

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario novoUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public List<Usuario> listaTodosUsuarios() {
        return repositorioUsuario.findAll();
    }

    public Meme novoMeme(Meme meme) {
        return repositorioMeme.save(meme);
    }

    public List<Meme> listaTodosMemes() {
        return repositorioMeme.findAll();
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
