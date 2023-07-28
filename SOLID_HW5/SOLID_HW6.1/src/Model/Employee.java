package Model;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    private static int baseSalary;
        
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        Employee.baseSalary = baseSalary;
        }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
        }

    //  метод получения размера baseSalary, чтобы использовать значение в других расчетах 
    public static int getbaseSalary() {
        return baseSalary;
        }

        
}
