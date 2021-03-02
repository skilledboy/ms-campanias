package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateTarjetaCommand;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class TarjetaCommandServiceImpl implements ITarjetaCommandService{
	
	@Inject
	IRepository repository;
	
	private Random r =new Random();
	
	
	public void createTarjetaCommand(CreateTarjetaCommand command) {
		Date fecha = new Date();
		
		String random = r.nextInt(9999)+" "+r.nextInt(999999)+" "+r.nextInt(9999);
		repository.createTarjeta(new Tarjeta(command.getId(),command.getNombre(),random, fecha.toString()));
		
    }
	
	public void removeTarjetaCommand(UUID id) {
		repository.deleteTarjeta(id);
		
    }
	
}
