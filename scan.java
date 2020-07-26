import java.util.Scanner;

public class scan{
  public static void main (String[] args){
  
  int num1,num2;
  Scanner kb = new Scanner(System.in); // here kb  is just a name // Scanner is class new object is created //
  
  System.out.println("Please Enter the number 1 : ");
  num1 = kb.nextInt();    // for integer //rem Int not int
                          //.nextDouble .nextFloat .nextLne(for string) .nextByte .nextChar etc
  System.out.println("Please Enter the number 2 : ");
  num2 = kb.nextInt();
  
  double avg = (num1+num2)/2.0; 
  System.out.println("Average of number is : " + avg);
  
  // playing with String 
   
   kb.nextLine(); //to consume the enter of premitive data type int that we have used earlier // kb.nextInt(); it takes enter also
  
  String name,surname;
  
  System.out.println("Please Enter your first name :  ");
      name = kb.nextLine();
  System.out.println("Please Enter your surname : ");
      surname = kb.nextLine();
  System.out.println(name + " " + surname);
  
  
  
  
  
  }

}
