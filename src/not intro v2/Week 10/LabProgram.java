public class LabProgram {
	public static void main(String[] args) {
		boolean result1 = Tests.testGetScoreAndSetScore();
		boolean result2 = Tests.testGetAssignmentScores();
		boolean result3 = Tests.testGetSortedAssignmentNames();
		boolean result4 = Tests.testGetSortedStudentIDs();
		boolean result5 = Tests.testGetStudentScores();
		
		System.out.print("\n" + "Summary:" + "\n");
		System.out.print("testGetScoreAndSetScore(): " + (result1 ? "PASS" : "FAIL") + "\n");
		System.out.print("testGetAssignmentScores(): " + (result2 ? "PASS" : "FAIL") + "\n");
		System.out.print("testGetSortedAssignmentNames(): " + (result3 ? "PASS" : "FAIL") + "\n");
		System.out.print("testGetSortedStudentIDs(): " + (result4 ? "PASS" : "FAIL") + "\n");
		System.out.print("testGetStudentScores(): " + (result5 ? "PASS" : "FAIL") + "\n");
	}
}
