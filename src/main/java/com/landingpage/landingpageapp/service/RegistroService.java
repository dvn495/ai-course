package com.landingpage.landingpageapp.service;

import com.landingpage.landingpageapp.model.Registro;
import com.landingpage.landingpageapp.repository.RegistroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@Service
public class RegistroService {

    private final RegistroRepository registroRepository;

    public Registro save(Registro registro){

        registro.setDate_creation(LocalDateTime.now());
        return  registroRepository.save(registro);
    }
}
