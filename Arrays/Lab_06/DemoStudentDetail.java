import java.util.Scanner;

class Student_details{
    int enroll_no;
    String name;
    int sem;
    double cpi;
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        enroll_no = sc.nextInt();
        name = sc.next();
        sem = sc.nextInt();
        cpi = sc.nextDouble();
    }
    public void getdetails(){
        System.out.println(enroll_no);
        System.out.println(name);
        System.out.println(sem);
        System.out.println(cpi);
    }
}
public class DemoStudentDetail {
    public static void main(String[] args) {
        Student_details[] st_d = new Student_details[5];
        for(int i=0; i<4; i++){
            st_d[i] = new Student_details();
            st_d[i].setdetails();;
        }
        for(int i=0; i<4; i++){
            st_d[i].getdetails();
        }
    }
}
