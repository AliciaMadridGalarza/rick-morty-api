package com.fpmislata.daw1.nomprojecte.persistance.dao.impl;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;
import com.fpmislata.daw1.nomprojecte.persistance.dao.CharacterDAO;
import com.fpmislata.daw1.nomprojecte.persistance.database.DatabaseConnection;
import com.fpmislata.daw1.nomprojecte.persistance.rowmapper.CharacterRowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CharacterDAOImpl implements CharacterDAO {
    private final DatabaseConnection connection;
    private final CharacterRowMapper characterRowMapper;

    public CharacterDAOImpl() {
        this.connection = DatabaseConnection.getInstance();
        this.characterRowMapper = new CharacterRowMapper();
    }

    @Override
    public Character findById(int characterId) {
        String sql = "SELECT * FROM `character` WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, characterId);
            ResultSet rs = preparedStatement.executeQuery();

            if (!rs.next())
                return null;

            return characterRowMapper.mapRow(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Character> findAll() {
        String sql = "SELECT * FROM `character`";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet rs = preparedStatement.executeQuery();

            return characterRowMapper.map(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
