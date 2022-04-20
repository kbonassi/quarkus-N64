package com.acme.quarkusn64.services;

import com.acme.quarkusn64.entities.Genre;
import com.acme.quarkusn64.repositories.GenreRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GenreService {
    @Inject
    GenreRepository genreRepository;

    public List<Genre> listAll() {
        return genreRepository.listAll();
    }

    public Genre findById(Long id) {
        return genreRepository.findById(id);
    }
}
