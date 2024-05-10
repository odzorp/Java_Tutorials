import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tutorials {

  public static void main(String[] args) {
    // Example 1: Using matches() method to find a pattern in a string
    String text1 = "visit w3schools1";
    String pattern1 = "w3schools";
    if (text1.toLowerCase().contains(pattern1.toLowerCase())) {
      System.out.println("Pattern 'w3schools' found in the text.");
    }

    // Example 2: Using Pattern and Matcher classes to find a pattern in a string
    String text2 = "visit w3schools1";
    String pattern2 = "w3schools";
    Pattern p = Pattern.compile(pattern2, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(text2);
    if (m.find()) {
      System.out.println("Pattern 'w3schools' found in the text.");
    }

    // Example 3: Adding two numbers with user input
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = myObj.nextInt();
    System.out.println("Enter second number");
    int b = myObj.nextInt();
    int sum = a + b;
    System.out.println("Sum of two numbers is " + sum);

    // Example 4: Counting the number of words in a string
    String str = "Hello World! CASTOR OIL IS GOOd for the body and soul";
    int countWords = str.split("\\s+").length;
    System.out.println("Number of words: " + countWords);

    // Example 5: Reversing a string
    String originalStr = "Hello";
    StringBuilder reversedStrBuilder = new StringBuilder();
    for (int i = originalStr.length() - 1; i >= 0; i--) {
      reversedStrBuilder.append(originalStr.charAt(i));
    }
    String reversedStr = reversedStrBuilder.toString();
    System.out.println("Reversed String: " + reversedStr);

    // Example 6: Calculating the sum of an array
    int[] arr = { 1, 2, 3, 4, 5 };
    int sumArray = Arrays.stream(arr).sum();
    System.out.println("Sum of array elements: " + sumArray);

    // Example 7: Converting a string to an array
    String myStr = "Hello";
    char[] charArray = myStr.toCharArray();
    System.out.println(charArray[0]);
    for (char i : charArray) {
      System.out.println(i);
    }

    // Example 8: Sorting an array
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Tesla" };
    Arrays.sort(cars);
    for (String car : cars) {
      System.out.println(car);
    }

    // Example 9: Looping through an ArrayList
    ArrayList<String> carsList = new ArrayList<>(
        Arrays.asList("Volvo", "tshs", "kjssj", "jsjsjs", "kskksn", "lmmm", "esss"));
    for (String car : carsList) {
      System.out.println(car);
    }

    // Example 10: Looping through a HashMap
    HashMap<String, String> capitalCities = new HashMap<>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    for (String country : capitalCities.keySet()) {
      System.out.println("key: " + country + " value: " + capitalCities.get(country));
    }

    // Example 11: Looping through an enum
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  }

  // Example 11: Enum definition for looping through
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
}
