import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample employee logs
        List<EmployeeLog> logs = new ArrayList<>();
        logs.add(new EmployeeLog("A17", 'I', "22/05/2017", 7.5f, 22, 0));
        logs.add(new EmployeeLog("A239", 'O', "21/05/2017", 8.4f, 19, 10));
        logs.add(new EmployeeLog("B01", 'I', "22/05/2017", 5.0f, 20, 0));
        logs.add(new EmployeeLog("C12", 'O', "21/05/2017", 4.5f, 18, 15));
        logs.add(new EmployeeLog("D34", 'O', "22/05/2017", 6.0f, 20, 10));
        logs.add(new EmployeeLog("A17", 'I', "23/05/2017", 7.4f, 22, 0));
        logs.add(new EmployeeLog("A239", 'O', "22/05/2017", 7.4f, 19, 10));
        logs.add(new EmployeeLog("B01", 'I', "23/05/2017", 5.7f, 20, 0));
        logs.add(new EmployeeLog("C12", 'O', "22/05/2017", 4.5f, 18, 15));
        logs.add(new EmployeeLog("D34", 'O', "23/05/2017", 8.0f, 20, 10));
        for (EmployeeLog employeeLog: logs){
            System.out.println(employeeLog.toString());
        }
        Report.costPerDay(logs);
        Report.rankingReport(logs);

    }
}