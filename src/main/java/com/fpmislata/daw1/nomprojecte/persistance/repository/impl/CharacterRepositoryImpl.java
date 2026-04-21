package com.fpmislata.daw1.nomprojecte.persistance.repository.impl;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;
import com.fpmislata.daw1.nomprojecte.persistance.dao.CharacterDAO;
import com.fpmislata.daw1.nomprojecte.persistance.repository.CharacterRepository;

import java.util.List;

public class CharacterRepositoryImpl implements CharacterRepository {
    private final CharacterDAO characterDAO;

    public CharacterRepositoryImpl(CharacterDAO characterDAO) {
        this.characterDAO = characterDAO;
    }

    @Override
    public Character findById(int id) {
        return characterDAO.findById(id);
    }

    @Override
    public List<Character> findAll() {
        return characterDAO.findAll();
    }
}
