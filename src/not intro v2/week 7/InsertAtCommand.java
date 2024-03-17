import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
    private ArrayList<String> sourceList;
    private String item;
    private int index;
    
    public InsertAtCommand(ArrayList<String> lst, String itm, int idx) {
        this.sourceList = lst;
        this.item = itm;
        this.index = idx;
    }
    
    @Override
    public void execute() {
        if (index >= 0 && index <= sourceList.size()) {
            sourceList.add(index, item);
        }
    }
}
