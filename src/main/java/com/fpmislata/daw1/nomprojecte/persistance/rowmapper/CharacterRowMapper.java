package com.fpmislata.daw1.nomprojecte.persistance.rowmapper;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CharacterRowMapper extends RowMapper<Character> {
    @Override
    public Character mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String status = rs.getString("status");
        String species = rs.getString("species");

        return new Character(id, name, status, species);
    }
}
