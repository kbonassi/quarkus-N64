package com.acme.quarkusn64.services;

import com.acme.quarkusn64.entities.Game;
import com.acme.quarkusn64.repositories.GameRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GameService {
    @Inject
    GameRepository gameRepository;

    public List<Game> listAll() {
        return gameRepository.listAll();
    }

    public Game findById(Long id) {
        return gameRepository.findById(id);
    }
}
