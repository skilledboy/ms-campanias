package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateSuscribirCampaniaCommand;

public interface ISuscribirCampaniaCommandService {
	
	void createSuscribirCampaniaCommand(CreateSuscribirCampaniaCommand command);

}
