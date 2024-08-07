//IS THE ARRAY SORTED IN INCREASING ORDER (strictly) using recursion 
//Strcitly next number should be greater than prevous number,can't be equal 

public class ques21 {
    public static boolean isSorted (int[]arr , int index){
        boolean flag = true; 
          if(index == arr.length){
            return flag; 
          }
    
        if(arr[index]>arr[index-1]){
          flag = true; 
        }
        else {
          flag = false; 
        }
        return flag && isSorted(arr, index+1);
        
      }
    
      public static void main(String[] args){
        int arr[] = {1,2,3,4,5,7,8,9,10};
        int index = 1; 
        boolean flag = isSorted(arr, index); 
    
        System.out.println(flag);
      }
}
