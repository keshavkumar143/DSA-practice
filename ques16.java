public class ques16 {
    //First and last occurance of a particular element in a String 

    public static int first = -1; 
    public static int last = -1;
    
    public  static void flOccurance(String s , char element , int index){
  
    if(index == s.length()){
       System.out.println(first);
       System.out.println(last); 
        return; 
      }
  
      char currentCharacter  = s.charAt(index); 
      
      if(currentCharacter == element){
        if(first  == -1){
          first = index; 
        }
        else {
          last = index; 
        }
      }
      flOccurance(s, element, index+1);
    }
    
    public static void main(String[] args) {
  
      String s = "abaacdaefaah";
      char element  = 'a'; 
      int index = 0; 
      flOccurance(s, element, index);
     
    }
}