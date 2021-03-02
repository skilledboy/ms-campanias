package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateCampaniaCommand;

public interface ICampaniaCommandService {
	
	void createCampaniaCommand(CreateCampaniaCommand command);

}
