class Solution {
    public String convert(String s, int numRows) {
        // 1. Edge Case Check
        if (numRows == 1 || s.length() <= numRows) return s;

        int n = s.length();
        char[] result = new char[n]; // Create an array of exact size
        int count = 0;               // Keeps track of where we are in the result array
        int cycleLen = 2 * numRows - 2;

        // 2. Iterate through each row (Top to Bottom)
        for (int i = 0; i < numRows; i++) {
            
            // 3. Jump through the string in "V" cycles
            for (int j = 0; j + i < n; j += cycleLen) {
                
                // Add the "Main" character
                result[count++] = s.charAt(j + i);

                // 4. Add the "Zag" character (if not top/bottom row)
                int zagIndex = j + cycleLen - i;
                if (i != 0 && i != numRows - 1 && zagIndex < n) {
                    result[count++] = s.charAt(zagIndex);
                }
            }
        }
        
        // 5. Convert the char array back to a String
        return new String(result);
    }
}
