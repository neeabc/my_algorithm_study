package day002;

import org.junit.jupiter.api.Test;

public class Demo04 {
	
	@Test
	public void test() {
		
		int[] nums = {1,3,65,78,98,100};
		int num = 200;
		
		System.out.println(find(nums, num));
	}
	
	//二分查找 迭代
    public int find(int[] nums,int num){
        int start = 0;
        int end = nums.length;
        int mid = (end+start)/2;

        while((end-start)>0){
            if (nums[mid]==num){
                return mid;
            }else if (nums[mid]>num){
                end = mid;
                mid = (end+start)/2;
            }else{
                start = mid+1;
                mid = (end+start)/2;
            }
        }
        return start;

    }
    
    
    @Test
	public void testt() {
		
		int[] nums = {1,3,65,78,98,100};
		int num = 200;
		
		System.out.println(findd(nums, num,0,nums.length));
	}
    
    //递归
    public int findd(int[] nums,int num,int start,int end) {
    	
    	if(end==start) {
    		return start;
    	}
    		
    	
    	int mid = (end+start)/2;
    	if(nums[mid]==num) {
    		return mid;
    	}else if(nums[mid]>num) {
    		return findd(nums, num, start, mid);
    	}else {
    		return findd(nums, num, mid+1, end);
    	}
    }
}
