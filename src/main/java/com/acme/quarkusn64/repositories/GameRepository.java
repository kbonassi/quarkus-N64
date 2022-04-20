package com.acme.quarkusn64.repositories;

import com.acme.quarkusn64.entities.Game;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameRepository implements PanacheRepository<Game> {
}
