package br.com.senac.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senac.aula.model.Mensagem;
import br.com.senac.aula.repository.MensagemRepository;

@RestController
@RequestMapping(path = "/mensagem")
public class MensagemController {

    @Autowired
    private MensagemRepository db;

    @GetMapping(path = "/")
    public List<Mensagem> listAll() {
        return db.findAll();
    }

    @PostMapping(path = "/")
    public Mensagem save(@RequestBody Mensagem mensagem) {
        return db.save(mensagem);
    }
    
}
