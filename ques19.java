//generate Possible ways to reach the end point of a matrix 

public class ques19 {
    
    public static void res(int r,int col,int m,int n , String ans){
            if(r-1 == m && col-1 == n){
                System.out.println(ans);
            }
             
            if(m > r || n > col){
                return;
            }

            else {
                res(r, col, m+1, n, ans+"V");
                res(r, col, m, n+1, ans+"H");
            }
    }
    public static void main(String[] args) {
 
        res(3, 3,0,0, "");
    }
}
