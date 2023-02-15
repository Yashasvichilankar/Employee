import java.util.Scanner;
class Employee
{
String emp_name;
int emp_id;
double emp_salary;
int emp_age;

void setData()
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Employee Name: ");
emp_name=sc.nextLine();

System.out.println("Enter Employee Id: ");
emp_id=Integer.parseInt(sc.nextLine());

System.out.println("Enter Employee Salary: ");
emp_salary=Double.parseDouble(sc.nextLine());

System.out.println("Enter Employee Age: ");
emp_age=Integer.parseInt(sc.nextLine());
}

void getData()
{
System.out.println("Employee name:"+emp_name+"\t"+"Employee Id:"+emp_id+"\t"+"Employee Salary:"+emp_salary+"\t"+"Employee Age:"+emp_age);
}

public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

e1.setData();
e2.setData();
e3.setData();
e1.getData();
e2.getData();
e3.getData();
}
}

