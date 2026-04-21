package com.fpmislata.daw1.nomprojecte.persistance.dao;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;

import java.util.List;

public interface CharacterDAO {
    Character findById(int id);
    List<Character> findAll();
}
