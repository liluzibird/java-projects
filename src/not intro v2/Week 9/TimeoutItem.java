@FunctionalInterface
interface CallbackMethod {
	void invoke();
}

public class TimeoutItem implements Comparable<TimeoutItem> {
	private int callbackTime;
	private CallbackMethod callbackMethod;

	public TimeoutItem(CallbackMethod callbackMethod, int callbackTime) {
		this.callbackTime = callbackTime;
		this.callbackMethod = callbackMethod;
	}

	public TimeoutItem(TimeoutItem toCopy) {
		this.callbackTime = toCopy.callbackTime;
		this.callbackMethod = toCopy.callbackMethod;
	}

	public void callCallback() {
		callbackMethod.invoke();
	}

	final public int getCallbackTime() {
		return callbackTime;
	}

	@Override
	public int compareTo(TimeoutItem tItem) {
	   // Java's PriorityQueue keeps item with smallest value at the front.
		if (this.callbackTime > tItem.callbackTime) {
			return 1;
		} 
		else if (this.callbackTime < tItem.callbackTime) {
			return -1;
		} 
		else {
			return 0;
		}
	}
}
