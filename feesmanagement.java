import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class studentdetails{
    private int sid;
    private String sname;
    private double balance;

    public studentdetails(int id, String name, double balance){
        this.sid=id;
        this.sname=name;
        this.balance=balance;
    }
    public int getsid(){
        return sid;
    }
    public String getsname(){
        return sname;
    }
    public double getbalance(){
        return balance;
    }
    public void makepayment(double amount){
        if (amount>0){
            balance-=amount;
            System.out.println("Payment of Rs." + amount + " received. New balance: Rs." + balance);
        }
        else{
            System.out.println("Invalid payment amount.");
        }
    }
}
public class feesmanagement{
    private List<studentdetails> students;
    public feesmanagement(){
        students=new ArrayList<>();
    }
    public void addstudent(studentdetails student){
        students.add(student);
    }
    public void liststudents(){
        System.out.println("List of Students:");
        for (studentdetails student : students) {
            System.out.println("ID: " +student.getsid() + ", Name: " +student.getsname() + ", Balance: Rs." +student.getbalance());
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        feesmanagement fee= new feesmanagement();
        while(true){
            System.out.println("\nFees Management System");
            System.out.println("1.Add Student");
            System.out.println("2.Make Payment");
            System.out.println("3.List Students");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");

            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid= sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student name: ");
                    String sname= sc.nextLine();
                    System.out.print("Enter Balance: ");
                    double balance= sc.nextDouble();
                    studentdetails student=new studentdetails(sid,sname,balance);
                    fee.addstudent(student);
                    System.out.println("Student added successfully!!");
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int studentId= sc.nextInt();
                    System.out.print("Enter amount: ");
                    double paymentAmount= sc.nextDouble();
                    for (studentdetails s : fee.students){
                        if (s.getsid() == studentId){
                            s.makepayment(paymentAmount);
                            break;
                        }
                    }
                    break;
                case 3:
                    fee.liststudents();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}