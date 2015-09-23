package instances;
import java.util.Scanner;
public class methodsinstances {
	 private static Scanner input;

	public static void main (String args[]){
         input = new Scanner(System.in);
         tuna tunaObject = new tuna ();
         System.out.println("Enter name of first gf here: ");
         String temp = input.nextLine();
         tunaObject.setName(temp);
         tunaObject.saying();
     
    }   
 }            


