import java.util.ArrayList;

public class RemoveLastCommand extends UndoCommand {
	private ArrayList<String> sourceList;
	
	public RemoveLastCommand(ArrayList<String> lst) {
		this.sourceList = lst;
	}
	
	@Override
	public void execute() {
		// Your code here
        if (!sourceList.isEmpty()) {
            sourceList.remove(sourceList.size() - 1);
        }
	}
}
