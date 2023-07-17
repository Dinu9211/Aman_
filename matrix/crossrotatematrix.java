public class crossrotatematrix {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        rotateMatrix(matrix);
        
        // Print rotated matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int layers = n / 2;
        
        for (int layer = 0; layer < layers; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            
            for (int i = first; i < last; i++) {
                int offset = i - first;
                
                // Save top element
                int top = matrix[first][i];
                
                // Move right to top
                matrix[first][i] = matrix[i][last];
                
                // Move bottom to right
                matrix[i][last] = matrix[last][last - offset];
                
                // Move left to bottom
                matrix[last][last - offset] = matrix[last - offset][first];
                
                // Move top to left
                matrix[last - offset][first] = top;
            }
        }
    }
}