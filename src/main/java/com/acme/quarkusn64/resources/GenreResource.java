package com.acme.quarkusn64.resources;

import com.acme.quarkusn64.entities.Genre;
import com.acme.quarkusn64.services.GenreService;
import org.jboss.resteasy.reactive.RestPath;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/genres")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GenreResource {

    @Inject
    GenreService genreService;

    @GET
    public Response getAllGenres() {
        List<Genre> genres = genreService.listAll();
        return Response.ok(genres).build();
    }

    @GET
    @Path("/{id}")
    public Response getGenre(@RestPath Long id) {
        Genre genre = genreService.findById(id);
        if (genre != null) {
            return Response.ok(genre).build();
        } else {
            return Response.noContent().build();
        }
    }
}
