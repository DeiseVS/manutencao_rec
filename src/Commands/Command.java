package Commands;

public interface Command {

	public void execute();
	public void unexecute();
	public boolean executed();
	
	public Command getPrevious();
	public void setPrevious(Command c);
	public Command getNext();
	public void setNext(Command c);
    public CompositeCommand getCompositeCommand();
}

