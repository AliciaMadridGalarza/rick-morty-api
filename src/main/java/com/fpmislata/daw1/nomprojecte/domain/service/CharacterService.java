package com.fpmislata.daw1.nomprojecte.domain.service;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;

import java.util.List;

public interface CharacterService {
    Character findById(int id);
    List<Character> findAll();
}
