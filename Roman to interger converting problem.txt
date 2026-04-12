import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int currentVal = getValue(s.charAt(i));
            
            // Check if there is a next character and if it's larger
            if (i < n - 1 && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal; // Subtraction rule
            } else {
                total += currentVal; // Addition rule
            }
        }
        
        return total;
    }

    // Helper method to map symbols to values
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
