package com.fpmislata.daw1.nomprojecte.common.ioc;

import com.fpmislata.daw1.nomprojecte.domain.service.CharacterService;
import com.fpmislata.daw1.nomprojecte.domain.service.impl.CharacterServiceImpl;
import com.fpmislata.daw1.nomprojecte.persistance.dao.CharacterDAO;
import com.fpmislata.daw1.nomprojecte.persistance.dao.impl.CharacterDAOImpl;
import com.fpmislata.daw1.nomprojecte.persistance.repository.CharacterRepository;
import com.fpmislata.daw1.nomprojecte.persistance.repository.impl.CharacterRepositoryImpl;

public class CharacterIoC {
    private static CharacterService service;
    private static CharacterRepository repository;
    private static CharacterDAO dao;

    public static CharacterService createService(){
        if (service == null) {
            CharacterRepository repository = createRepository();
            service = new CharacterServiceImpl(repository);
        }
        return service;
    }

    public static CharacterRepository createRepository(){
        if (repository == null) {
            CharacterDAO dao = createDao();
            repository = new CharacterRepositoryImpl(dao);
        }
        return repository;
    }

    public static CharacterDAO createDao(){
        if (dao == null) {
            dao = new CharacterDAOImpl();
        }
        return dao;
    }
}
