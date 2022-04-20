package com.acme.quarkusn64.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Game extends PanacheEntity {

    public String name;
    public Integer year;
    @ManyToOne
    @JoinColumn(name = "genre_id")
    public Genre genre;
    @ManyToOne
    @JoinColumn(name = "studio_id")
    public Studio studio;
}
