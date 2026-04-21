package com.fpmislata.daw1.nomprojecte.domain.service.impl;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;
import com.fpmislata.daw1.nomprojecte.domain.service.CharacterService;
import com.fpmislata.daw1.nomprojecte.persistance.repository.CharacterRepository;

import java.util.List;

public class CharacterServiceImpl implements CharacterService {
    private final CharacterRepository repository;

    public CharacterServiceImpl(CharacterRepository repository) {
        this.repository = repository;
    }

    @Override
    public Character findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Character> findAll() {
        return repository.findAll();
    }
}
