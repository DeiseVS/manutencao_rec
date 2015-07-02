package Commands;


public class CommandProcessor {
	
private Command cursor;
	
	public CommandProcessor()
	{
		this.cursor = null;
	}
	
	public void doCommand(Command c)
	{
		if (c == null) 
			throw new NullPointerException("Command c must not be null");
		if (c.executed())
			throw new RuntimeException("Command c has already been executed.");
		
		if (this.cursor != null && this.cursor.executed())
		{
			this.cursor.setNext(c);
			c.setPrevious(this.cursor);
		}
		
		this.cursor = c;
		
		this.cursor.execute();
	}
	
	public void undoCommand()
	{
		if (this.cursor != null)
		{	
			if (this.cursor.executed()) this.cursor.unexecute();
			
			if (this.cursor.getPrevious() != null)
				this.cursor = this.cursor.getPrevious();
		}	
	}
	
	public void redoCommand()
	{
		
		if (this.cursor != null)
		{
			if (this.cursor.executed() && this.cursor.getNext() != null)
				this.cursor = this.cursor.getNext();
			
			if (!this.cursor.executed()) this.cursor.execute();
		}
	}
	
	
	public void reset()
	{
		this.cursor = null;
	}
	
	public int historySize()
	{
		int cont = 0;
		if (this.cursor != null)
		{
			cont = 1;
			Command aux = this.cursor.getNext();
			while (aux != null)
			{
				cont++;
				aux = aux.getNext();
			}
			
			aux = this.cursor.getPrevious();
			while (aux != null)
			{
				cont++;
				aux = aux.getPrevious();
			}
		}
		
		return cont;
	}
	
	public String history()
	{
		String result = "";
		if (this.cursor != null)
		{
			result += this.cursor.getClass().getName() + "\n";
			Command aux = this.cursor.getNext();
			while (aux != null)
			{
				result = result + "\n" + aux.getClass().getName();
				aux = aux.getNext();
			}
			
			aux = this.cursor.getPrevious();
			while (aux != null)
			{
				result = aux.getClass().getName() + "\n" + result + "\n"; 
				aux = aux.getPrevious();
			}
		}
		
		return result;
	}
}
