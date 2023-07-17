package matrix;

    public class tem {
        public static boolean bogglesearch(char[][] b, int i, int j, String s, int index) {
            if (i < 0 || i >= b.length || j < 0 || j >= b[0].length || b[i][j] != s.charAt(index)) {
                return false;
            }
            
            if (index == s.length() - 1) {
                return true;
            }
            
            char temp = b[i][j];
            b[i][j] = '#'; // Mark the current cell as visited
            
            // Recursively search in all eight directions around the current cell
            boolean found = bogglesearch(b, i - 1, j, s, index + 1) ||
                            bogglesearch(b, i + 1, j, s, index + 1) ||
                            bogglesearch(b, i, j - 1, s, index + 1) ||
                            bogglesearch(b, i, j + 1, s, index + 1) ||
                            bogglesearch(b, i - 1, j - 1, s, index + 1) ||
                            bogglesearch(b, i - 1, j + 1, s, index + 1) ||
                            bogglesearch(b, i + 1, j - 1, s, index + 1) ||
                            bogglesearch(b, i + 1, j + 1, s, index + 1);
            
            b[i][j] = temp; // Restore the original character
            return found;
        }
        
        public static void main(String[] args) {
            char[][] a = {
                {'Q', 'L', 'K', 'E', 'V'},
                {'E', 'R', 'I', 'F', 'Z'},
                {'A', 'M', 'X', 'N', 'D'},
                {'S', 'R', 'W', 'Q', 'E'}
            };
            
            String str = "AMRL";
            boolean found = false;
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] == str.charAt(0)) {
                        if (bogglesearch(a, i, j, str, 0)) {
                            found = true;
                            break;
                        }
                    }
                }
                
                if (found) {
                    break;
                }
            }
            
            if (found) {
                System.out.println("Word found.");
            } else {
                System.out.println("Word not found.");
            }
        }
    }
    
    
}
