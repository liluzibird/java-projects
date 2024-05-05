import java.io.PrintWriter;

// TreeTestCommand is the abstract base class for a command that tests some
// aspect of a BinarySearchTree object
public abstract class TreeTestCommand {
	public abstract boolean execute(BinarySearchTree tree, PrintWriter testFeedback);
}