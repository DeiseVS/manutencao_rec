package Commands;

public abstract class CommandDecorator implements Command{
	private Command component;
	
	public CommandDecorator(Command component ) {
		this.component = component;
	}
	
	public void execute(){
		component.execute();
	}
	public void unexecute(){
		component.unexecute();
	}
	protected Command getComponent(){
		return component;
	}

	public boolean executed() {
	    return	component.executed();
	
	}

	public Command getPrevious() {
		 return component.getPrevious();
	}

	public void setPrevious(Command c) {
		component.setPrevious(c);
		
	}

	public Command getNext() {
		
		return component.getNext();
	}

	public void setNext(Command c) {
		component.setNext(c);
		
	}

	public CompositeCommand getCompositeCommand() {
	
		return component.getCompositeCommand();
	}

}
