package com.fpmislata.daw1.nomprojecte.domain.entity;

import java.util.Objects;

public class Character {
    private final int id;
    private String name;
    private String status;
    private String species;

    public Character(int id, String name, String status, String species) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id && Objects.equals(name, character.name) && Objects.equals(status, character.status) && Objects.equals(species, character.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, species);
    }
}
