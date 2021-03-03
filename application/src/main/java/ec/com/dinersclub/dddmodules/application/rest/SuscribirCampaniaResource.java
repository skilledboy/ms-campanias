package ec.com.dinersclub.dddmodules.application.rest;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.ISuscribirCampaniaCommandService;
import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateSuscribirCampaniaCommand;

@Path("/suscribir-campanias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SuscribirCampaniaResource {
	
	@Inject
	ISuscribirCampaniaCommandService writeService;

    @POST
    public Response add(@Valid CreateSuscribirCampaniaCommand command) {
    	writeService.createSuscribirCampaniaCommand(command);
    	return Response.status(201).build();
    }

}