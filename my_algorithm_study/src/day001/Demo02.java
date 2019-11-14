package day001;

import util.MyArrayUtil;
import util.MyMathUtil;

public class Demo02 {
	//快速排序
	public void quickSort(int[] nums,int start,int end) {
		
		//结束条件
		if(end-start==1) { //只有一个数,什么也不做,返回
			return;
		}
		
		//随机选择一个数
		MyArrayUtil.swap(nums, start, MyMathUtil.random(start, end)); //随机选择一个数,并交换至start处
		
		int i=1;
		int j=end-1;
		
		//将i移动到大于nums[start]的数的位置
		while(nums[i]<=nums[start]) {
			i++;
		}
		
		//将j移动到小于nums[start]的数的位置
		while(nums[j]>=nums[start]) {
			j++;
		}
		
		while(i<=j) {
			MyArrayUtil.swap(nums, i, j);
			
			while(nums[i]<=nums[start]) {
				i++;
			}
			
			while(nums[j]>=nums[start]) {
				j++;
			}
		}
		
		MyArrayUtil.swap(nums, start, i-1);
		
		quickSort(nums,start,i-2); //排序左边
		quickSort(nums,i,end); //排序右边
		
	}
	
}
