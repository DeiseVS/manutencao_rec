package Lampadas;

import Commands.Command;
import Commands.CompositeCommand;

public class AcenderCommand implements Command{
	
	private Lampada lampada;
	
	public AcenderCommand(Lampada lamp){
		super(); 
		this.lampada = lamp;
	}
	
	public void execute() {
		lampada.acender();
	}
	
	public void unexecute() {
		lampada.apagar();
	}

	public boolean executed() {
		// TODO Auto-generated method stub
		return false;
	}

	public Command getPrevious() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrevious(Command c) {
		// TODO Auto-generated method stub
		
	}

	public Command getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNext(Command c) {
		// TODO Auto-generated method stub
		
	}

	public CompositeCommand getCompositeCommand() {
		// TODO Auto-generated method stub
		return null;
	}

}
