import java.util.ArrayList;
import java.util.Arrays; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Day6Prob2 {
    public static void main(String args[]) { 
        ArrayList<Integer> list;
        
        Integer[] ip=new  Integer[]{1,1,3,5,1,1,1,4,1,5,1,1,1,1,1,1,1,3,1,1,1,1,2,5,1,1,1,1,1,2,1,4,1,4,1,1,1,1,1,3,1,1,5,1,1,1,4,1,1,1,4,1,1,3,5,1,1,1,1,4,1,5,4,1,1,2,3,2,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,5,1,1,1,3,4,1,1,1,1,3,1,1,1,1,1,4,1,1,3,1,1,3,1,1,1,1,1,3,1,5,2,3,1,2,3,1,1,2,1,2,4,5,1,5,1,4,1,1,1,1,2,1,5,1,1,1,1,1,5,1,1,3,1,1,1,1,1,1,4,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,3,2,1,1,1,1,2,2,1,2,1,1,1,5,5,1,1,1,1,1,1,1,1,1,1,1,1,2,2,1,1,4,2,1,4,1,1,1,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,1,5,1,1,1,1,1,1,1,1,3,1,1,3,3,1,1,1,3,5,1,1,4,1,1,1,1,1,4,1,1,3,1,1,1,1,1,1,1,1,2,1,5,1,1,1,1,1,1,1,1,1,1,4,1,1,1,1};
        List <Integer> input= Arrays.asList(ip);
        
Map<Integer, Long> fishMap = new HashMap<>();
         for(Integer fish:input)
        { 
			fishMap.put(fish, fishMap.getOrDefault(fish, 0L) + 1);
		}

        for(int i=0;i<256 ;i++)
        {
           
            for(int fishLife = 0; fishLife <= 8; fishLife++)
			    {fishMap.put(fishLife - 1, fishMap.getOrDefault(fishLife, 0L));}
			    
	    	fishMap.put(6, fishMap.getOrDefault(6, 0L) + fishMap.get(-1));
		    fishMap.put(8, fishMap.remove(-1));
        }
        
        long sum = 0;
        for(long fishCount : fishMap.values())
            sum += fishCount;

      System.out.println(sum);
    }
}
