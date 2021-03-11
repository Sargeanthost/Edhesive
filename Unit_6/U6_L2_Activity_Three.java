package Unit_6;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
//slow way to do this. I will update using set comparison later
public class U6_L2_Activity_Three{
    public static boolean hasDuplicates(int[] ints){
        boolean duplicates=false;
        List<Integer> intList  = Arrays.stream(ints).boxed().collect(Collectors.toList());
        Set<Integer> intSet = new HashSet<>(intList);
        if(intSet.size() < intList.size()){
            duplicates = true;
        }
        return duplicates;
    }
}
  
