public class PangramChecker {
    public static boolean isPangram(String str) {
    
        boolean[] letters = new boolean[26];
        str = str.toLowerCase();

        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                
                letters[ch - 'a'] = true;
            }
        }

        
        for (boolean letter : letters) {
            if (!letter) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

