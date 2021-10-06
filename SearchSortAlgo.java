import java.util.Arrays;
import java.util.Scanner;
public class SearchSortAlgo {
   public static void main(String args[]) {
      int temp, size;

      //scanner is used to take user input
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();

      //strings converted to integers for comparison
      char charArray[] = str.toCharArray();
      size = charArray.length;
      for(int i = 0; i < size; i++ ) {
         for(int j = i+1; j < size; j++) {
            if(charArray[i]>charArray[j]) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
            }
         }
      }
      // prints out the string sorted alphabetically
      System.out.println("Alphabetical sorting is: "+Arrays.toString(charArray));
   }
}