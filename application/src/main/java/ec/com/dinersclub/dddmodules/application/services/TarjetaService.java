package ec.com.dinersclub.dddmodules.application.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateTarjetaCommand;
import ec.com.dinersclub.dddmodules.application.grpc.MutinyTarjetaGrpc;
import ec.com.dinersclub.dddmodules.application.grpc.TarjetaRequest;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped  
public class TarjetaService {

	@Inject
    @GrpcService("tarjeta")                     
	MutinyTarjetaGrpc.MutinyTarjetaStub grpc;
	
	public void createTarjetaCommand(CreateTarjetaCommand command) {
		grpc.createTarjetaCommand(TarjetaRequest.newBuilder().setId(command.getId().toString()).setNombre(command.getNombre()).build()).await().indefinitely();
		}
	
}
