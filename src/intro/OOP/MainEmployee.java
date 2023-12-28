package intro.OOP;

import java.util.Scanner;

class Employee
{
    private Integer idNumber;
    private final String name;

    public Employee(String name, Integer codeId)
    {
        this.name = name;
        this.idNumber = codeId;
    }

    public String getName()
    {
        return name;
    }

    public Integer getIdNumber()
    {
        return idNumber;
    }
}

public class MainEmployee
{
    private static Employee getEmployeeInformation()
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your ID number:");
        int id = input.nextInt();

        return new Employee(name, id);
    }

    public static void main(String[] args)
    {
        Employee emp = getEmployeeInformation();
        printEmployeeInformation(emp);
    }

    private static void printEmployeeInformation(Employee emp)
    {
        System.out.println(emp.getName());
        System.out.println(emp.getIdNumber());
    }
}