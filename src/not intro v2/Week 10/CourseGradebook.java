import java.util.*;

public class CourseGradebook extends Gradebook {
   // Declare any protected fields here (change placeholder field below)
	protected int field;
	
	@Override
	public HashMap<Integer, Double> getAssignmentScores(String assignmentName) {
		// Your code here (remove placeholder line below)
		return new HashMap<Integer, Double>();
	}
	
	@Override
	public double getScore(String assignmentName, Integer studentID) {
		// Your code here
		return Double.NaN;
	}
	
	@Override
	public ArrayList<String> getSortedAssignmentNames() {
		// Your code here (remove placeholder line below)
		return new ArrayList<String>();
	}
	
	@Override
	public ArrayList<Integer> getSortedStudentIDs() {
		// Your code here (remove placeholder line below)
		return new ArrayList<Integer>();
	}

	@Override
	public HashMap<String, Double> getStudentScores(Integer studentID) {
		// Your code here (remove placeholder line below)
		return new HashMap<String, Double>();
	}
	
	@Override
	public void setScore(String assignmentName, Integer studentID, Double score) {
		// Your code here
	}
}