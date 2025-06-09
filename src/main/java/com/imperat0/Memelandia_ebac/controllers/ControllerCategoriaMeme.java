package com.imperat0.Memelandia_ebac.controllers;

import com.imperat0.Memelandia_ebac.entities.CategoriaMeme;
import com.imperat0.Memelandia_ebac.services.ServicoCategoriaMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class ControllerCategoriaMeme {

    @Autowired
    private ServicoCategoriaMeme servicoCategoriaMeme;

    @GetMapping
    public List<CategoriaMeme> buscaCategorias() {
        return servicoCategoriaMeme.listaTodasCategorias();
    }

    @PostMapping
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoCategoriaMeme.novaCategoriaMeme(categoriaMeme);
    }
}
