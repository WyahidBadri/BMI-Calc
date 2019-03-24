
//wyahid badri
 
import java.util.Scanner;
 
 
 
public class finalp
{
    public static void main( String [] args )
    {
     
    System.out.println("B.M.I is the Body Mass Index calculator. \n");
     
    System.out.println("Although this can be changed with exercise an diet \n");
     
    System.out.println("Enter you are a male or a female. \n");
     
    Scanner n = new Scanner(System.in);
    String Gen = n.next();
    String m = "male";
    String f = "female";
     
    if ( Gen.equals(m))
    {
        System.out.println("Enter your height in inches \n");
     
        Scanner a = new Scanner(System.in);
     
        double height;
        height = a.nextDouble();
     
        System.out.println("Enter your weight in pounds \n");
     
          
     
        double weight;
        weight = a.nextDouble();
         
        double convHeight = height * .025;
        double convWeight = weight * .045;
        System.out.println("Your current B.M.I is   "+(convWeight / convHeight)*4);
        System.out.println("A healthy bmi is between 18 as 25 \n");
         
        System.out.println("To maintain press 1, To bulk press 2, To cut press 3 \n");
         
        int cal = a.nextInt();
         
        if (cal == 1)
        {
            double bmr = weight * 11;
            System.out.println("your bmr is "+bmr+"calories \n");
            System.out.println("To maintain your weight you must consume "+(bmr+0)+" calories \n");
             
        }
        else if (cal == 2)
        {
            double bmr = weight * 11;
            System.out.println("your bmr is "+bmr+"calories \n");
            System.out.println("Togain mass you must consume at least "+(bmr*1.5)+" calories \n");
        }
        else if(cal == 3)
        {
            double bmr = weight * 11;
            System.out.println("your bmr is "+bmr+"calories \n");
            System.out.println("To lose weight you must consume less than "+(bmr-100)+" calories \n");
        }
             
             
         
         
         
         
 
    }
     
    else if(Gen.equals(f))
    {
        System.out.println("Enter your height in inches \n");
     
        Scanner a = new Scanner(System.in);
     
        double height;
        height = a.nextDouble();
     
        System.out.println("Enter your weight in pounds \n");
         
     
        double weight;
        weight = a.nextDouble();
         
        double convHeight = height * .025;
        double convWeight = weight * .045;
        System.out.println("Your current B.M.I is   "+(convWeight / convHeight)*4);
        System.out.println("A healthy bmi is between 18 as 25 \n");
         
        System.out.println("To maintain press 1, To bulk press 2, To cut press 3 \n");
         
        int cal = a.nextInt();
         
        if (cal == 1)
        {
            double bmr = weight * 10;
            System.out.println("your bmr is "+bmr+"calories \n");
            System.out.println("To maintain your weight you must consume "+bmr+" calories \n");
             
        }
        else if (cal == 2)
        {
            double bmr = weight * 10;
            System.out.println("your bmr is "+bmr+"calories");
            System.out.println("Togain mass you must consume at least "+(bmr*1.5)+" calories \n");
        }
        else if(cal == 3)
        {
            double bmr = weight * 10;
            System.out.println("your bmr is "+bmr+"calories");
            System.out.println("To lose weight you must consume less than "+(bmr-100)+" calories \n");
        }          
    }   
  }
}