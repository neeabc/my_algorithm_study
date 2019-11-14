package util;

public class MyArrayUtil {
	
	//交换int数组的元素
	public static void swap(int[] nums,int a,int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
