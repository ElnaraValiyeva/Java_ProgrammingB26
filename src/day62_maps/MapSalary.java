package day62_maps;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("James", 10000.0);
        map.put("Ella", 3456.0);
        map.put("Ana", 90000.0);
        map.put("Elza", 5000.0);
        map.put("Peter", 122344.0);

        String nameForLargest = "";
        double maxSalary = 0.0;

        String nameForLow = "";
        double lowestSalary = Double.MAX_VALUE;

        for (String key : map.keySet()) {
            double value = map.get(key);

            if (map.get(key) > maxSalary) {
                nameForLargest = key;
                maxSalary = map.get(key);
            }
            if (map.get(key) > lowestSalary) {
                nameForLow = key;
                lowestSalary = map.get(key);

            }
            System.out.println("Max Salary: " + nameForLargest + maxSalary);
            System.out.println("Low Salary: " + nameForLow + lowestSalary);
        }
    }}
