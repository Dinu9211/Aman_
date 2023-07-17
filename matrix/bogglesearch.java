package matrix;

public class bogglesearch {
    public static boolean bogglesearch(char[][] b,int i,int j,String s,int index){
        System.out.println("i - "+i+" j - "+j+" char - "+s.charAt(index));
        if(i-1>=0 && b[i-1][j]==s.charAt(index)){
            if(s.length()-1==index)
                return true;
            return bogglesearch(b,i-1,j,s,index+1);

            }
            else if(i+1<b.length && b[i+1][j]==s.charAt(index)){
                    if(s.length()-1==index)
                    return true;
                    return bogglesearch(b,i+1,j,s,index+1);
                
            }
            else if(j+1<b[0].length && b[i][j+1]==s.charAt(index)){            
                    if(s.length()-1==index)
                    return true;
                    return bogglesearch(b,i,j+1,s,index+1);
            }
            else if(j-1>=0 && b[i][j-1]==s.charAt(index)){   
                if(s.length()-1==index)
                return true;
                return bogglesearch(b,i,j-1,s,index+1);
            }
            else{
                System.out.println("not found");
                return false;
            }
        }
    
    public static void main(String[] args) {
        char[][] a=new char[][]{{'Q','L','K','E','V'},{'E','R','I','F','Z'},{'A','M','X','N','D'},{'S','R','W','Q','E'}};
        String str= "AMRL";
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==str.charAt(0)){
                    if(bogglesearch(a, i, j, str, 1))
                        System.out.println("string is present");
                }
            }
        }
    }
}
