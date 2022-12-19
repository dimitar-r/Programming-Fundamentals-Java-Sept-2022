package associativeArrays.exercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();
        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countStudents; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);
        }
        Map<String, Double> averageStudentsGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.50) {
                averageStudentsGrade.put(studentName, averageGrade);
            }
        }
        averageStudentsGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
