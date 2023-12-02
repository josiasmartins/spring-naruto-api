package com.josiasmartins.apinaruto.services.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josiasmartins.apinaruto.domain.DTOs.CharacterDTO;
import com.josiasmartins.apinaruto.domain.entity.Character;
import com.josiasmartins.apinaruto.repository.CharacterRepository;

@Service
public class CharacterServiceImp {

    @Autowired
    private CharacterRepository characterRepository;

    @Transactional
    public Character create(CharacterDTO dto) {
        Character character = Character.builder()
            .name(dto.getName())
            .clan(dto.getClan())
            .elements(dto.getElements()).build();

        return characterRepository.save(character);
    }

    public List<Character> listAll() {
        return this.characterRepository.findAll();
    }

    public Optional<Character> getById(Long id) {
        return characterRepository.findById(id);
    }
     
}
