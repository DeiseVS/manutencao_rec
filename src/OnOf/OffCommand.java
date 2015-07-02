package OnOf;

import Commands.CommandImpl;
import Commands.CompositeCommand;

public class OffCommand extends CommandImpl {
	
	private boolean lastState;
	
	private OnOff receiver;
	
	protected void handleExecute() {
		this.lastState = this.receiver.isOn();
		receiver.off();		
	}
	
	protected void handleUnExecute() {
		if (lastState == true)
		receiver.on();
	}

	public OffCommand(OnOff receiver) {
		super();
		this.receiver = receiver;
	}

	public CompositeCommand getCompositeCommand() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
