public class plus_one {
    
        public int[] plusOne(int[] digits) {
            int n = digits.length;
    
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++; // No carry neededgit
                    return digits;
                }
                digits[i] = 0; // Set to 0 and continue loop (carry)
            }
    
            // If all digits were 9, we need a bigger array
            int[] result = new int[n + 1];
            result[0] = 1; // e.g., [9,9,9] -> [1,0,0,0]
            return result;
        }
    }

