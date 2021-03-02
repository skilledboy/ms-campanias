package ec.com.dinersclub.dddmodules.application.rest;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateTarjetaCommand;
import ec.com.dinersclub.dddmodules.application.services.TarjetaService;


@Path("/grpc")
public class GrpcResource {
	
	@Inject
    TarjetaService client;


    @POST
    @Path("tarjetas")
    public Response add(@Valid CreateTarjetaCommand command) {
    	client.createTarjetaCommand(command);
    	return Response.status(201).build();
    }
    
}