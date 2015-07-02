package Commands;

public abstract class CommandImpl implements Command{
	
	private boolean executed = false;
	private Command previous;
	private Command next;
	
	protected CommandImpl(){
		this.executed = false;
		this.previous = null;
		this.next = null;
	}
	
	public final void execute(){ // executa o commmand
		if(this.executed()){
			throw new RuntimeException("Command ja executado");
		}
		this.handleExecute();
		this.executed = true;
	}
	
	protected abstract void handleExecute();
	
	public final void unexecute(){ // desfaz o commad
		if(!this.executed()){
			throw new RuntimeException("Command ja desfeito");
		}
		this.handleUnExecute();
		this.executed = false;
	}
	
	protected abstract void handleUnExecute();

	
	public boolean executed() {
		return this.executed;
	}

	
	public Command getPrevious() {
		return this.previous;
	}

	
	public void setPrevious(Command c) {
		this.previous = c;
	}

	
	public Command getNext() {
		return this.next;
	}

	
	public void setNext(Command c) {
		this.next = c;
	}
	
	public CompositeCommand getCompositeCommand(){
		return null;
	}
	
}
