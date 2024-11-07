import java.util.Scanner;
import java.util.Arrays;

public class DataRunner {
  public static void main(String[] args) {
// Scanner test = new Scanner(System.in);
    UserStory test = new UserStory("breeds.txt", "size.txt", "age.txt");
  
    // System.out.println("1. Most likely dog to be adopted." + "\n2. Least likely dog to be adopted." + "\n3. Best dog for you.");
    Dog poplular = test.getMostPopular();
    System.out.println(poplular);
  }
}