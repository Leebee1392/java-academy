package org.example.controllers;

import io.swagger.annotations.Api;
import org.example.services.RolesService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Api(value = "Roles API")
@Path("/api/roles")
public class RolesController {
    RolesService rolesService;

    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRoles() {
        try {
            return Response.ok().entity(rolesService.getAllRoles()).build();
        } catch (SQLException e) {
            return Response.serverError().build();
        }
    }
}
