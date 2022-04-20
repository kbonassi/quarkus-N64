package com.acme.quarkusn64.services;

import com.acme.quarkusn64.entities.Studio;
import com.acme.quarkusn64.repositories.StudioRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StudioService {
    @Inject
    StudioRepository studioRepository;

    public List<Studio> listAll() {
        return studioRepository.listAll();
    }

    public Studio findById(Long id) {
        return studioRepository.findById(id);
    }
}
