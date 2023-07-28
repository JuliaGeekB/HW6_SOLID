 package Services;
import Model.Employee;

public class NetSalary {
    // метод выносится отдельно. Т.к. это область бухгалтерии (расчетов), где можно корректировать, например, размер налогов
    
    public int calculateNetSalary() {
        int tax = (int) (Employee.getbaseSalary()* 0.25);//calculate in otherway
        return Employee.getbaseSalary()- tax;
        }
}
