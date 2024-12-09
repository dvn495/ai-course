package com.landingpage.landingpageapp.controller;

import com.landingpage.landingpageapp.model.Registro;
import com.landingpage.landingpageapp.repository.RegistroRepository;
import com.landingpage.landingpageapp.service.RegistroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/register")
public class RegistroController {

    private final RegistroRepository registroRepository;


    private final RegistroService registroService;

    @Autowired
    public RegistroController(RegistroRepository registroRepository, RegistroService registroService){
        this.registroRepository = registroRepository;
        this.registroService = registroService;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Registro registro) {
        registroService.save(registro);
        return ResponseEntity.ok("Registro creado exitosamente");
    }

    @GetMapping
    public List<Registro> findAll(){
        return registroRepository.findAll();
    }




}
