import java.util.*;
import java.io.PrintWriter;

// TreeInsertCommand inserts an ArrayList of keys into the tree when executed
public class TreeInsertCommand extends TreeTestCommand {
	private ArrayList<Integer> keysToInsert = new ArrayList<Integer>();

	public TreeInsertCommand(ArrayList<Integer> keys) {
		this.keysToInsert = new ArrayList<Integer>(keys);
	}

	@Override
	public boolean execute(BinarySearchTree tree, PrintWriter testFeedback) {
		// If no keys to insert, return true immediately
		if (0 == keysToInsert.size()) {
			return true;
		}

		// Begin feedback message and insert first key
		testFeedback.write("Inserting keys: " + keysToInsert.get(0));
		tree.insertKey(keysToInsert.get(0));

		// Insert remaining keys
		for (int i = 1; i < keysToInsert.size(); i++) {
			testFeedback.write(", " + keysToInsert.get(i));
			tree.insertKey(keysToInsert.get(i));
		}
		testFeedback.write("\n");
		return true;
	}
}