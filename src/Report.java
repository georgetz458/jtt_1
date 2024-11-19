import java.util.*;

public class Report {
    public static void costPerDay(List<EmployeeLog> employeeLogs){
        //reports
        Map<String ,Float> in_house_report = new HashMap<>();
        Map<String ,Float> outsourced_report = new HashMap<>();
        //iterate through logs
        for (EmployeeLog employeeLog : employeeLogs){
            float cost = employeeLog.calculateCost();
            String date = employeeLog.getDate();
            //aggregate costs of same date
            if(employeeLog.getIn_house_outsourced() == 'I'){
                in_house_report.put(date, in_house_report.getOrDefault(date, 0.0f) + cost);
            } else if (employeeLog.getIn_house_outsourced() == 'O') {
                outsourced_report.put(date, outsourced_report.getOrDefault(date, 0.0f) + cost);
            }
        }
        // Display in-house report
        System.out.println("\n--- In-House Employees Total Costs Per Day ---");
        for (Map.Entry<String, Float> entry : in_house_report.entrySet()) {
            System.out.println("Date: " + entry.getKey() + ", Total Cost: " + entry.getValue());
        }

        // Display outsourced report
        System.out.println("\n--- Outsourced Employees Total Costs Per Day ---");
        for (Map.Entry<String, Float> entry : outsourced_report.entrySet()) {
            System.out.println("Date: " + entry.getKey() + ", Total Cost: " + entry.getValue());
        }
    }

    public static void rankingReport(List<EmployeeLog> employeeLogs){
        //reports
        Map<String ,Float> in_house_rank = new HashMap<>();
        Map<String ,Float> outsourced_rank = new HashMap<>();
        //iterate through logs
        for( EmployeeLog employeeLog: employeeLogs){
            float cost = employeeLog.calculateCost();
            String id = employeeLog.getId();
            //aggregate costs of same id
            if(employeeLog.getIn_house_outsourced() == 'I'){
                in_house_rank.put(id, in_house_rank.getOrDefault(id, 0.0f) + cost);
            } else if (employeeLog.getIn_house_outsourced() == 'O') {
                outsourced_rank.put(id, outsourced_rank.getOrDefault(id, 0.0f) + cost);
            }
        }
        // Sort and display in-house ranking
        System.out.println("\n--- In-House Employees Ranking ---");
        in_house_rank.entrySet().stream()
                .sorted((e1, e2) -> Float.compare(e2.getValue(), e1.getValue())) // Sort by total cost in descending order
                .forEach(entry -> System.out.println("Employee ID: " + entry.getKey() + ", Total Cost: " + entry.getValue()));

        // Sort and display outsourced ranking
        System.out.println("\n--- Outsourced Employees Ranking ---");
        outsourced_rank.entrySet().stream()
                .sorted((e1, e2) -> Float.compare(e2.getValue(), e1.getValue())) // Sort by total cost in descending order
                .forEach(entry -> System.out.println("Employee ID: " + entry.getKey() + ", Total Cost: " + entry.getValue()));
    }
}
