import java.util.*;

public class TimeoutManager {
   // Priority queue for timeout items. The timeout item with the lowest
   // callback time is the first to be dequeued.
	protected PriorityQueue<TimeoutItem> pq = new PriorityQueue<TimeoutItem>();
	
	// A clock used to get the current time in the addTimeout() and
   // update() method.
	protected MillisecondClock clock;

	public TimeoutManager(MillisecondClock clock) {
		this.clock = clock;
	}

   // Returns a reference to this timeout manager's internal priority queue.
   // Used only for grading purposes.
	public PriorityQueue<TimeoutItem> getPriorityQueue() {
		return pq;
	}
   
   // Adds a timeout item, given a callback method and delay time as
   // parameters. The added timeout expires at:
   // (clock's current time when this method is called) + (delay time)
	public void addTimeout(CallbackMethod callback, int delayBeforeCallback) {
		// Create a new timeout item with the callback method and the time it should be called
		TimeoutItem newTimeout = new TimeoutItem(callback, clock.getTime() + delayBeforeCallback);
		// Add the new timeout item to the priority queue
		pq.add(newTimeout);
	}
   
   // Dequeues each expired timeout item from the priority queue and calls each
   // expired item's callback method.
	public void update() {
		// While there are still items in the priority queue and the first item's callback time is less than or equal to the current time
		while (!pq.isEmpty() && pq.peek().getCallbackTime() <= clock.getTime()) {
			// Remove the first item from the priority queue and call its callback method
			pq.poll().callCallback();
		}
	}
}
