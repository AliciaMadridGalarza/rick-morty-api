package com.fpmislata.daw1.nomprojecte.persistance.dao.impl;

import com.fpmislata.daw1.nomprojecte.domain.entity.Character;
import com.fpmislata.daw1.nomprojecte.persistance.dao.CharacterDAO;
import com.fpmislata.daw1.nomprojecte.persistance.database.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterDAOImplTest {
    private static CharacterDAO characterDAO;
    private static DatabaseConnection connection;

    @BeforeAll
    static void setup() throws SQLException {
        connection = DatabaseConnection.getInstance();
        characterDAO = new CharacterDAOImpl();

        connection.executeScript("sql/schema.sql");
        connection.executeScript("sql/data.sql");
        connection.setAutoCommit(false);
    }

    @AfterEach
    void rollback() throws SQLException {
        connection.rollback();
    }

    @Nested
    class FindByIdTests {
        @Test
        void givenExistingId_shouldReturnCharachter() {
            // Ararnge
            Character expected = new Character(1, "Morty", "Alive", "Human");

            // Act
            Character actual = characterDAO.findById(1);

            // Assert
            assertEquals(expected, actual);
        }

        @Test
        void givenNonExistingId_shouldReturnNull() {
            // Act
            Character actual = characterDAO.findById(-1);

            // Assert
            assertNull(actual);
        }
    }
}