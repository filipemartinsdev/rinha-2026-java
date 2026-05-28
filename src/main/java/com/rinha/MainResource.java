package com.rinha;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class MainResource {
    @GET @Path("/ready")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ready() {
        return Response.ok().build();
    }

    @POST @Path("/fraud-score")
    @Produces(MediaType.APPLICATION_JSON)
    public Response fraudScore() {
        return Response.ok().build();
    }
}
