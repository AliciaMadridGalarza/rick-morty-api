package com.fpmislata.daw1.nomprojecte.persistance.repository;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;

import java.util.List;

public interface CharacterRepository {
    Character findById(int id);
    List<Character> findAll();
}
