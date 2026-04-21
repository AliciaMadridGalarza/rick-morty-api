package com.fpmislata.daw1.nomprojecte.controller;

import com.fpmislata.daw1.nomprojecte.common.ioc.CharacterIoC;
import com.fpmislata.daw1.nomprojecte.domain.entity.Character;
import com.fpmislata.daw1.nomprojecte.domain.service.CharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
    private CharacterService service = CharacterIoC.createService();

    @GetMapping("/character")
    public ResponseEntity<List<Character>> getList() {
        List<Character> list = service.findAll();
        if (list == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/character/{id}")
    public ResponseEntity<Character> getCharacter(@PathVariable("id") int id) {
        Character character = service.findById(id);
        if (character == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(character);
    }
}
