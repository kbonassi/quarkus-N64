package com.acme.quarkusn64.resources;

import com.acme.quarkusn64.entities.Studio;
import com.acme.quarkusn64.services.StudioService;
import org.jboss.resteasy.reactive.RestPath;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/studios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudioResource {

    @Inject
    StudioService studioService;

    @GET
    public Response getAllStudios() {
        List<Studio> studios = studioService.listAll();
        return Response.ok(studios).build();
    }

    @GET
    @Path("/{id}")
    public Response getStudio(@RestPath Long id) {
        Studio studio = studioService.findById(id);
        if (studio != null) {
            return Response.ok(studio).build();
        } else {
            return Response.noContent().build();
        }
    }
}
