public class TestClock extends MillisecondClock {
	private int currentTime;

	public TestClock() {
		currentTime = 0;
	}

	@Override
	public int getTime() {
		return currentTime;
	}

	// Sets this clock's current time, provided the new time is greater than the
	// previously set time.
	public boolean setTime(int newTime) {
		// Only allow time to move forward
		if (newTime > currentTime) {
			currentTime = newTime;
			return true;
		}
		return false;
	}
}
