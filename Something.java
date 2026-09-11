import java.util.Scanner;
public class Something {
public static void main(String arg[]) {
    Scanner sc =new Scanner(System.in);

    // String name = sc.next();
    // int age = sc.nextInt();

   // System.out.println("name  -->" + name + "  " + "age  ->  "  +age);

   double num1 = sc.nextDouble();
   double num2 = sc.nextDouble();
     
   if(num1 > num2) {
    System.out.println("num1 is graeter");
   }
   else{
    System.out.println("\n num2 is greater");
   }
if(num1 == 0) {
    System.out.println("\nnum1 is neutral");
}
 else  if(num1%2 == 0) {
    System.out.println("num1 is even\n");
   }
   else{
    System.out.println("num1 is odd");
   }
   System.out.println("sum =" +  (num1+num2)  + "  " + "\ndiff = " + (num1-num2) + "\nproduct =" + (num1*num2) +  "\ndiv=" + (num1/num2) + "\nmodulo = " + (num1%num2));
//    sc.close();
}
}