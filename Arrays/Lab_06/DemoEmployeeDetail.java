import java.util.Scanner;
class Employee_Details{
    int employee_id;
    String employee_name;
    String employee_designation;
    double employee_salary;
        public void read(){
            Scanner sc = new Scanner(System.in);
            employee_id = sc.nextInt();
            employee_name = sc.next();
            employee_designation = sc.next();
            employee_salary = sc.nextDouble();
        }
        public void print(){
            System.out.println(employee_id);
            System.out.println(employee_name);
            System.out.println(employee_designation);
            System.out.println(employee_salary);
        }
}
public class DemoEmployeeDetail {
    public static void main(String[] args) {
        Employee_Details e_d = new Employee_Details();
        e_d.read();
        e_d.print();
    }
}
