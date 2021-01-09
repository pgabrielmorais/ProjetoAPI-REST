package com.pedro.projetozup.Controller;

import java.util.List;

import com.pedro.projetozup.model.Conta;
import com.pedro.projetozup.model.ContaRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/conta"})
public class ContaController {
    
    private ContaRepository repository;

    ContaController(ContaRepository contaRepository) {
        this.repository = contaRepository;
   }
   // métodos do CRUD aqui

   @GetMapping
    public List<Conta> findAll(){
        return repository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Conta> findById(@PathVariable Integer id){
        return repository.findById(id)
           .map(record -> ResponseEntity.ok().body(record))
           .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conta create(@RequestBody Conta conta){
       return repository.save(conta);
    }
}
