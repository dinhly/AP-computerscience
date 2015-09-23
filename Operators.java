import java.util.Scanner;

class apples{
   public static void main(String args[]){
      Scanner bucky = new Scanner(System.in);
      int girls, boys, people;
      girls = 8;
      boys = 10;
      people = girls % boys;
      System.out.println(people);
   }
}