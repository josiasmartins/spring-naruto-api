package com.josiasmartins.apinaruto.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.josiasmartins.apinaruto.domain.DTOs.CharacterDTO;
import com.josiasmartins.apinaruto.domain.entity.Character;
import com.josiasmartins.apinaruto.services.Impl.CharacterServiceImp;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @Autowired
    private CharacterServiceImp characterServiceImp;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Character save(@RequestBody @Valid CharacterDTO request) {
      return characterServiceImp.create(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Character> getAll() {
      return characterServiceImp.listAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Character getId(@PathVariable("id") Long id) {
      return characterServiceImp.getById(id)
        .map(charact -> charact)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Cliente não encontrado"
        ));
    }

}
