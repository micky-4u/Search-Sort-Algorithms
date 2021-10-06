import java.util.Arrays;
import java.util.Scanner;
public class SearchSortAlgo {
   public static void main(String args[]) {
      //scanner used to take in user input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();

      //converts the strings to integers for comparison
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}