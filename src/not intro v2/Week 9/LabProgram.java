import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class LabProgram {
	public static boolean verifyCallbacks(PrintWriter testFeedback, ArrayList<String> actual,
			ArrayList<String> expected) {
		// Compare ArryList sizes first
		boolean areEqual = true;
		if (actual.size() == expected.size()) {
			for (int i = 0; areEqual && i < actual.size(); i++) {
				if (!actual.get(i).equals(expected.get(i))) {
					areEqual = false;
				}
			}
		} 
		else {
			areEqual = false;
		}

		// Print results
		testFeedback.write(areEqual ? "PASS" : "FAIL");
		testFeedback.write(": Verification of invoked callbacks\n");
		testFeedback.write("  Expected: " + expected + "\n");
		testFeedback.write("  Actual:   " + actual + "\n");
		return areEqual;
	}

	public static boolean test1(PrintWriter testFeedback) {
		TestClock clock = new TestClock();
		TimeoutManager timeouts = new TimeoutManager(clock);

		ArrayList<String> actualCallbacks = new ArrayList<String>();
		ArrayList<String> expectedCallbacks = new ArrayList<String>();

		// Test with items:
		// Added at clock time = 0:
		// - item D with delay 500 (callback time is 500)
		// - item A with delay 100 (callback time is 100)
		// Added at clock time = 50
		// - item B with delay 150 (callback time is 200)
		clock.setTime(0);
		timeouts.addTimeout(() -> {
			actualCallbacks.add("D");
			testFeedback.write("Item D's callback\n");
		}, 500);
		timeouts.addTimeout(() -> {
			actualCallbacks.add("A");
			testFeedback.write("Item A's callback\n");
		}, 100);
		clock.setTime(50);
		timeouts.addTimeout(() -> {
			actualCallbacks.add("B");
			testFeedback.write("Item B's callback\n");
		}, 150);

		// Do an update with clock time = 100, which should invoke item A's
		// callback
		clock.setTime(100);
		testFeedback.write("Updating with clock time = 100. Item A should show below.\n");
		timeouts.update();

		// Verify that only item A's callback was called
		expectedCallbacks.add("A");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Do another update with a clock time of 150, which shouldn't invoke any
		// callbacks
		clock.setTime(150);
		testFeedback.write("Updating with clock time = 150. No callbacks should show below.\n");
		timeouts.update();

		// Verify that still only item A's callback has been called
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Add more timeouts at clock time = 300:
		// - item E with delay 500 (callback time is 800)
		// - item C with delay 100 (callback time is 400)
		clock.setTime(300);
		testFeedback.write("Adding timeouts E and C\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("E");
			testFeedback.write("Item E's callback\n");
		}, 500);
		timeouts.addTimeout(() -> {
			actualCallbacks.add("C");
			testFeedback.write("Item C's callback\n");
		}, 100);

		// Verify that adding new timeouts didn't invoke any new callbacks
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Do an update with a clock time of 350, which should invoke item B's
		// callback
		clock.setTime(350);
		testFeedback.write("Updating with clock time = 350. Item B should show below.\n");
		timeouts.update();

		// Verify callbacks: A and B called, others not
		expectedCallbacks.add("B");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Do an update with a clock time of 550, which should invoke item C's
		// callback and item D's callback, in that order
		clock.setTime(550);
		testFeedback.write("Updating with clock time = 550. Item C and D should show below, ");
		testFeedback.write("in that order.\n");
		timeouts.update();

		// Verify callbacks: A, B, C, and D
		expectedCallbacks.add("C");
		expectedCallbacks.add("D");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Do another update with a clock time of 700, which shouldn't invoke any
		// callbacks
		clock.setTime(700);
		testFeedback.write("Updating with clock time = 700. No callbacks should show below.\n");
		timeouts.update();

		// Verify callbacks: again just A, B, C, and D
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// Do a final update with time = 900, which should invoke item E's callback
		clock.setTime(900);
		testFeedback.write("Updating with clock time = 900. Item E should show below.\n");
		timeouts.update();

		// Verify callbacks: A, B, C, D, and E
		expectedCallbacks.add("E");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		return true;
	}

	public static boolean test2(PrintWriter testFeedback) {
		TestClock clock = new TestClock();
		TimeoutManager timeouts = new TimeoutManager(clock);

		ArrayList<String> actualCallbacks = new ArrayList<String>();
		ArrayList<String> expectedCallbacks = new ArrayList<String>();

		// At t = 0:
		// - Add item A with delay 800 (callback time is 800)
		clock.setTime(0);
		testFeedback.write("At t=0, adding timeout A with delay = 800\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("A");
		}, 800);

		// At t = 50:
		// - Add item D with delay 600 (callback time is 650)
		clock.setTime(50);
		testFeedback.write("At t=50, adding timeout D with delay = 600\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("D");
		}, 600);

		// At t = 100:
		// - Add item C with delay 200 (callback time is 300)
		clock.setTime(100);
		testFeedback.write("At t=100, adding timeout C with delay = 200\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("C");
		}, 200);

		// At t = 150:
		// - Add item E with delay 250 (callback time is 400)
		clock.setTime(150);
		testFeedback.write("At t=150, adding timeout E with delay = 250\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("E");
		}, 250);

		// At t = 200:
		// - Add item B with delay 50 (callback time is 250)
		// - Update, then verify that no callback have yet been called
		clock.setTime(200);
		testFeedback.write("At t=200, adding timeout B with delay = 50");
		testFeedback.write(", then updating\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("B");
		}, 50);
		timeouts.update();
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// At t = 400:
		// - Update, then verify that callbacks B, C, and E have been called
		clock.setTime(400);
		testFeedback.write("At t=400, updating\n");
		timeouts.update();
		expectedCallbacks.add("B");
		expectedCallbacks.add("C");
		expectedCallbacks.add("E");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// At t = 450:
		// - Add item F with delay 100 (callback time is 550)
		clock.setTime(450);
		testFeedback.write("At t=450, adding timeout F with delay = 100\n");
		timeouts.addTimeout(() -> {
			actualCallbacks.add("F");
		}, 100);

		// At t = 600:
		// - Update, then verify callbacks: B and C from earlier, E and F now
		clock.setTime(600);
		testFeedback.write("At t=600, updating\n");
		timeouts.update();
		expectedCallbacks.add("F");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		// At t = 800:
		// - Update, then verify callbacks: B, C, E, F, D, A
		clock.setTime(800);
		testFeedback.write("At t=800, updating\n");
		timeouts.update();
		expectedCallbacks.add("D");
		expectedCallbacks.add("A");
		if (!verifyCallbacks(testFeedback, actualCallbacks, expectedCallbacks)) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		PrintWriter testFeedback = new PrintWriter(System.out);
		boolean test1Result = test1(testFeedback);
		testFeedback.println();

		boolean test2Result = test2(testFeedback);
		testFeedback.println();

		testFeedback.flush();

		System.out.println("Local test 1: " + (test1Result ? "PASS" : "FAIL"));
		System.out.println("Local test 2: " + (test2Result ? "PASS" : "FAIL"));
		
		testFeedback.close();
	}
}
