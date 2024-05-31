package leetCode75First9qs;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		
		int candies[] = {10,20,30,40};
		int extraCandies=10;
		
		List<Boolean> output;
		
		output=kidsWithCandies(candies,extraCandies);
		
		System.out.println(output);
		
		


	}
	
	
	
	public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        List<Boolean> output = new ArrayList<>();

        int maxCandies =0;
        for(int i=0;i<candies.length;i++) {
            if(maxCandies<candies[i]) {
                maxCandies = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++) {
            int currentCandies = candies[i] + extraCandies;
            if(currentCandies>=maxCandies) {
                output.add(true);
            } else {
                output.add(false);
            }
        }

        return output;
        
    }

}
