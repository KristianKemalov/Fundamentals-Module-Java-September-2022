package AssociativeArrays.Excercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, ArrayList<Double>> studentMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            studentMap.putIfAbsent(name, new ArrayList<>());
            studentMap.get(name).add(grade);
        }

        Map<String,Double> finalMap=new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : studentMap.entrySet()) {
            List<Double> listGrades=entry.getValue();
            double average=getAverageGrade(listGrades);

            if (average>=4.5){
                finalMap.put(entry.getKey(),average);
            }
        }


        finalMap.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades=0;

        for (double grade:listGrades) {
                sumGrades+=grade;

        }
        return sumGrades/listGrades.size();
    }
}
