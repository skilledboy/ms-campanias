package ec.com.dinersclub.dddmodules.application.rest;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.ICampaniaCommandService;
import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateCampaniaCommand;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.CampaniaQuery;
import ec.com.dinersclub.dddmodules.application.services.CampaniaService;

@Path("/campanias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CampaniaResource {
	
	@Inject
	CampaniaService cliente;
	
	@Inject
	ICampaniaCommandService writeService;

    @GET
    @Path("{id}")
    public List<CampaniaQuery> verificarCampaniaClinte(@PathParam(value = "id") String id) {
        return cliente.verificarClienteCampania(id);
    }
    
    @POST
    public Response add(@Valid CreateCampaniaCommand command) {
    	writeService.createCampaniaCommand(command);
    	return Response.status(201).build();
    }

}