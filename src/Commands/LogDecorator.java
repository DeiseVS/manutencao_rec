package Commands;

public class LogDecorator extends CommandDecorator {

	public LogDecorator(Command component) {
		super(component);	
	}
    
	
	public void execute() {
		super.execute();
		Command c = confereComponent(getComponent());
		System.out.println("executed:"+c.getClass().getName());
	   
	}
    
    
	public void unexecute() {
		super.unexecute();
		Command c = confereComponent(getComponent());
		System.out.println("unexecuted:"+c.getClass().getName());
	}
	
	private Command confereComponent(Command c){
		if (c instanceof CommandDecorator)
			return confereComponent(((CommandDecorator) c).getComponent());
		else 
			return c;
	}
	
}
