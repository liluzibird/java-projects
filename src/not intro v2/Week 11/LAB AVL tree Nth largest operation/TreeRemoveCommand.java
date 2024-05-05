import java.util.*;
import java.io.PrintWriter;

// TreeRemoveCommand removes an ArrayList of keys from the tree when executed
public class TreeRemoveCommand extends TreeTestCommand {
	private ArrayList<Integer> keysToRemove = new ArrayList<Integer>();

	public TreeRemoveCommand(ArrayList<Integer> keys) {
		this.keysToRemove = new ArrayList<Integer>(keys);
	}

	@Override
	public boolean execute(BinarySearchTree tree, PrintWriter testFeedback) {
		if (keysToRemove.size() > 0) {
			// Begin feedback message and remove first key
			testFeedback.write("Removing keys: " + keysToRemove.get(0));
			tree.removeKey(keysToRemove.get(0));

			// Remove remaining keys
			for (int i = 1; i < keysToRemove.size(); i++) {
				testFeedback.write(", " + keysToRemove.get(i));
				tree.removeKey(keysToRemove.get(i));
			}
			testFeedback.write("\n");
		}
		return true;
	}
}