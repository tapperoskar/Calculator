import java.util.HashMap;
import java.util.Scanner;
public class Skeleton{

  public static void main(String[] args) {
   
    Scanner b = new Scanner(System.in);
    Addition add = new Addition();
    System.out.println("Enter name: ");
    String input = b.nextLine();
    System.out.println(input);
    System.out.println(add.add(1, 2));
    

    
  }
}

