package day002;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo03 {
	
	@Test
	public void insertTest() {
		int[] nums = {65,5456,2,45,87,56,8,89,8,90,Integer.MAX_VALUE};
		insertSort(nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));
	}
	
	//递归版的插入排序
	public void insertSort(int[] nums,int start,int end) {
		//结束条件
		if((end-start)<=1) {
			return;
		}
		
		insertSort(nums, start, end-1); //对之前的进行排序
		
		int temp = nums[end-1];
		int i=end-1;
		while(i>0&&nums[i-1]>temp) {
			nums[i]=nums[i-1];
			i--;
		}
		nums[i]=temp;
		
	}
}
