import java.util.Random;
import java.util.Scanner;

public class whileloop{
    public static void main(String[] args) {
        Random rd=new Random();
        int target=rd.nextInt(1,41);

        // System.out.print(target);
        int count=0;


        while(true){

            System.out.print("\nyour guess between 1 to 40: ");

            Scanner sc = new Scanner(System.in);
            int inp= sc.nextInt();

            if(inp == target){
                count++;
                System.out.print("\nyou got it right.");
                System.out.print("\ntotal attempts:" + count);
                break;
            }

            else if(inp > target){
                count++;
                System.out.print("\nsmaller.");
            }


            else {
                count++;
                System.out.print("\ngreater.");
            }
        }
        
    }
}