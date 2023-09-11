import java.util.Scanner;
public class bmi{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.print("Enter weight(in kgs): ");
        double weight=sc.nextDouble();

        System.out.print("Enter height(in meters): ");
        double height=sc.nextDouble();

        double bmi=calculate(weight,height);
        String category=category(bmi);

        System.out.println("BMI: " +bmi);
        System.out.println("Category: " +category);

        sc.close();
    }
    public static double calculate(double weight,double height){
        return weight/(height*height);
    }
    public static String category(double bmi){
        if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi >= 16 && bmi < 18.4) {
            return "Underweight";
        }  else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 39.9) {
            return "Severe Obesity";
        } else {
            return "Very severe Obesity)";
        }
    }
}