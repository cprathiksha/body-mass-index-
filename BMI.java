
import java.util.Scanner;
public class BMI
{
    public static String calulate(double weight, double height)
    {
        double bmi= (weight/height/height)*10000;
        System.out.println("BMI = "+bmi);
        if(bmi<18.5)
        {
            return "Under Weight";
        }
        else if(bmi<24.9)
        {
            return "Normal";
        }
        else if(bmi<29.9)
        {
            return "Over Weight";
        }
        else
        {
            return "Obese";
        }
    } 

    public static void main(String args[])
    {
        double weight_in_kg;
        double height_in_meter;
        String result=null;
    
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the weight in Kg: ");
        weight_in_kg=in.nextDouble();

        System.out.println("Enter the height in meter: ");
        height_in_meter=in.nextDouble();
        
        result=calulate(weight_in_kg, height_in_meter);

        System.out.println("Body Mass Index is: "+result);
        in.close();
    }
}
