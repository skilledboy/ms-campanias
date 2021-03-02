package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateCampaniaCommand;
import ec.com.dinersclub.dddmodules.domain.model.Campania;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class CampaniaCommandServiceImpl implements ICampaniaCommandService{
	
	@Inject
	IRepository campaniaRepository;

	@Override
	public void createCampaniaCommand(CreateCampaniaCommand command) {
		campaniaRepository.createCampania(new Campania(command.getId(), command.getName(), command.getFechaInicio(),command.getFechaFin(), command.getMonto(), command.getEstado(),
				command.getListRangoCampania()));
	}

}
