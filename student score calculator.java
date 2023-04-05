Map - Given a map of student name/ID and their list of scores. Calculate the total score of each student.
Student ID	     Score
1	            [10,20,10]
2	            [10,20,11]

Summary:
The program first creates a map studentScores with student IDs as keys and lists of scores as values. It then creates an empty map studentTotalScores to store the total score of each student.

The program then loops through the entries of studentScores, calculates the total score for each student, and adds the result to the studentTotalScores map.

Finally, the program prints out the total score for each student in a table format with columns for Student ID and Total Score.






import java.util.*;

public class StudentScoreCalculator {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> studentScores = new HashMap<>();
        studentScores.put(1, Arrays.asList(10, 20, 10));
        studentScores.put(2, Arrays.asList(10, 20, 11));

        Map<Integer, Integer> studentTotalScores = new HashMap<>();

        for (Map.Entry<Integer, List<Integer>> entry : studentScores.entrySet()) {
            int studentId = entry.getKey();
            List<Integer> scores = entry.getValue();
            int totalScore = 0;

            for (int score : scores) {
                totalScore += score;
            }

            studentTotalScores.put(studentId, totalScore);
        }

        System.out.println("Student ID\tTotal Score");
        for (Map.Entry<Integer, Integer> entry : studentTotalScores.entrySet()) {
            int studentId = entry.getKey();
            int totalScore = entry.getValue();
            System.out.println(studentId + "\t\t" + totalScore);
        }
    }
}
