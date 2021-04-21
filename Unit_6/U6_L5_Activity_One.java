package Unit_6;

public class U6_L5_Activity_One{

    public static void reverse(String[] words){
      for(String s : words){
        for(int i = s.length()-1; i >=0; i--){
          System.out.print(s.substring(i,i+1));
        }
        System.out.println();
      }
    }
  
  }
  