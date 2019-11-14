package day001;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo02Test {
	@Test
	public void testQuick() {
		Demo02 demo = new Demo02();
		
		int[] nums = {5,8,2,7,3,5,8,45,8,3,9,3,34,5,65,53,67,4,5345}; 
		
		demo.quickSort(nums, 0, nums.length);
		
		System.out.println(Arrays.toString(nums));
	}
}
