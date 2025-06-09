package com.imperat0.Memelandia_ebac.controllers;

import com.imperat0.Memelandia_ebac.entities.Meme;
import com.imperat0.Memelandia_ebac.services.ServicoMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @GetMapping
    public List<Meme> buscaMemes() {
        return servicoMeme.listaTodosMemes();
    }

    @PostMapping
    public Meme novoMeme(@RequestBody Meme meme) {
        return servicoMeme.novoMeme(meme);
    }
}
