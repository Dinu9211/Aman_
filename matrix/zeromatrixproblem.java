package matrix;
    class rowcol{
    private int row;
    private int col;
     rowcol(int r,int c){
        this.row=r;
        this.col=c;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}


public class zeromatrixproblem {
    public static void printt(int[][] b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] a=new int[][]{{1,3,6,7,8,9,},{9,8,6,0,4,3,},{6,7,2,8,2,0},{7,8,4,2,5,2},{7,5,6,7,1,4,}};
        System.out.println("orignal matrix is");
        printt(a);
      
       
        int count=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==0) count++;
                 
            }
        }
        rowcol[] arr=new rowcol[count];
        
        int index=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]==0){
                    arr[index] = new rowcol(i,j);
                    index++;
                }
                
            }
            
        }


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < a.length; j++) {
                a[ arr[i].getRow()][j] = 0;
            }

            for (int k = 0; k < a[0].length; k++) {
                a[k][arr[i].getCol()] = 0;
    }
    
        }
        System.out.println("after changing zeros");
        printt(a);
}
}  