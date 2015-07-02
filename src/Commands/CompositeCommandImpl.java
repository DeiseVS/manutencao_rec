package Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class CompositeCommandImpl extends CommandImpl implements CompositeCommand {

	private List<Command> children ; //declara uma lista do tipo command "composite" 
	
	
	
	
	public CompositeCommandImpl() {
		super();
		this.children = new ArrayList<Command>(); //"instancia a lista//
	}

	public CompositeCommand getCompositeCommand() {
		
		return this; //vai retorna ela mesma se for composite command, se nao retorna null//
	}

	public void add(Command child) {
		if(child != null){
			if (this.children.contains(child))
				throw new RuntimeException	("comando ja contain na lista");	
			else
				this.children.add(child) ;
		}
		else
			throw new RuntimeException ("command nao pode ser null"); 
	}

	public void remove(Command child) { 
	           children.remove(child);  	
			}
		
		
		
	
	

	public Iterator<Command> getchildren() {
		
		return  this.children.iterator(); //retorna a lista de command//
	}

	public int size() {
		
		return this.children.size();
	}

	@Override
	public void handleExecute() {  
		Iterator<Command> allChildren = this.getchildren();	
		while (allChildren.hasNext()){
			Command c;
			c = allChildren.next();
			c.execute();
			
		}
		
	}

	@Override
	protected void handleUnExecute() { 
		ListIterator<Command> allChildren =  this.children.listIterator(this.children.size()); // no listIterator tem q definir o local de partida para comessar//
		while (allChildren.hasPrevious()){
			Command c;
			c = allChildren.previous();
			c.unexecute();
		
	}
	
}

	
}