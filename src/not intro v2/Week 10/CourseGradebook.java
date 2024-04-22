import java.util.*;

public class CourseGradebook extends Gradebook {
    protected HashMap<String, HashMap<Integer, Double>> gradebook;

    public CourseGradebook() {
        gradebook = new HashMap<>();
    }

    @Override
    public HashMap<Integer, Double> getAssignmentScores(String assignmentName) {
        return gradebook.getOrDefault(assignmentName, new HashMap<>());
    }

    @Override
    public double getScore(String assignmentName, Integer studentID) {
        return gradebook.getOrDefault(assignmentName, new HashMap<>()).getOrDefault(studentID, Double.NaN);
    }

    @Override
    public ArrayList<String> getSortedAssignmentNames() {
        ArrayList<String> assignmentNames = new ArrayList<>(gradebook.keySet());
        Collections.sort(assignmentNames);
        return assignmentNames;
    }

    @Override
    public ArrayList<Integer> getSortedStudentIDs() {
        HashSet<Integer> studentIDs = new HashSet<>();
        for (HashMap<Integer, Double> scores : gradebook.values()) {
            studentIDs.addAll(scores.keySet());
        }
        ArrayList<Integer> sortedStudentIDs = new ArrayList<>(studentIDs);
        Collections.sort(sortedStudentIDs);
        return sortedStudentIDs;
    }

    @Override
    public HashMap<String, Double> getStudentScores(Integer studentID) {
        HashMap<String, Double> studentScores = new HashMap<>();
        for (Map.Entry<String, HashMap<Integer, Double>> entry : gradebook.entrySet()) {
            if (entry.getValue().containsKey(studentID)) {
                studentScores.put(entry.getKey(), entry.getValue().get(studentID));
            }
        }
        return studentScores;
    }

    @Override
    public void setScore(String assignmentName, Integer studentID, Double score) {
        if (!gradebook.containsKey(assignmentName)) {
            gradebook.put(assignmentName, new HashMap<>());
        }
        gradebook.get(assignmentName).put(studentID, score);
    }
}
