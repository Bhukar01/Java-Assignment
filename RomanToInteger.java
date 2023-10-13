import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        // Input Roman numeral as a string
        String romanNumeral = "IX"; // You can change this to any valid Roman numeral

        // Call the conversion function
        int result = romanToInt(romanNumeral);
        
        // Print the result
        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s) {
        // Create a mapping of Roman numerals to their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }
}
