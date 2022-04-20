package com.acme.quarkusn64.resources;

import com.acme.quarkusn64.entities.Game;
import com.acme.quarkusn64.services.GameService;
import org.jboss.resteasy.reactive.RestPath;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/games")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GameResource {

    @Inject
    GameService gameService;

    @GET
    public Response getAllGames() {
        List<Game> games = gameService.listAll();
        return Response.ok(games).build();
    }

    @GET
    @Path("/{id}")
    public Response getGame(@RestPath Long id) {
        Game game = gameService.findById(id);
        if (game != null) {
            return Response.ok(game).build();
        } else {
            return Response.noContent().build();
        }
    }
}
