package Unit_6;

// import java.util.Arrays;
public class U6_L2_Activity_One{

    public static boolean allNegative(double[] array){
      //functional way
      //return array Arrays.stream(array).allMatch(i -> i < 0);
      //traditional way
      boolean isAllNegative = true;
      for(double i: array){
        if(i >= 0 ){
          isAllNegative = false;
        }
      }
      return isAllNegative;
    }
  }
  