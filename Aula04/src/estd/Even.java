package estd;

public class Even {

	public int countEvens(int[] nums){
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		
		for(int i : nums){
			System.out.println(i);
		}
		
		return 0;
	}
	
}
