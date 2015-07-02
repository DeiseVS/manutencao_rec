package Commands;

import java.util.Iterator;

public interface CompositeCommand extends Command {
	
public void add (Command child);
public void remove (Command child);
public Iterator<Command> getchildren();
public int size();


}
