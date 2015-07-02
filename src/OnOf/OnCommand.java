package OnOf;

import Commands.CommandImpl;
import Commands.CompositeCommand;

public class OnCommand extends CommandImpl  {
    
	private boolean lastState;
	private OnOff receiver;
	
	protected void handleExecute() {
		this.lastState = receiver.isOn();
		receiver.on();
	}
	
	protected void handleUnExecute() {
		if ( this.lastState ==  false)
		receiver.off();
	}

	public OnCommand(OnOff receiver) {
		super();
		this.receiver = receiver;
	}

	public CompositeCommand getCompositeCommand() {
		return null;//retorna null se nao for um composite.
	}	

}
