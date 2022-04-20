package com.acme.quarkusn64.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Studio  extends PanacheEntity {

    public String developer;
    @JsonIgnore
    @OneToMany(mappedBy = "genre")
    public List<Game> games = new ArrayList<>();

}
