package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateSuscribirCampaniaCommand;
import ec.com.dinersclub.dddmodules.domain.model.SuscribirCampania;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class SuscribirCampaniaCommandServiceImpl implements ISuscribirCampaniaCommandService{
	
	@Inject
	IRepository suscribirCampaniaRepository;

	@Override
	public void createSuscribirCampaniaCommand(CreateSuscribirCampaniaCommand command) {
		suscribirCampaniaRepository.createSuscribirCampania(new SuscribirCampania(command.getId(), command.getIdComercio(), command.getIdCliente(), command.getIdCampania()) );
	}

}
