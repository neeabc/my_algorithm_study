package day001;

import util.MyArrayUtil;
import util.MyMathUtil;

public class Demo02 {
	//快速排序
	public void quickSort(int[] nums,int start,int end) {
		
		//结束条件
		if(end-start<=1) { //只有一个数,什么也不做,返回
			return;
		}
		
		//随机选择一个数
		MyArrayUtil.swap(nums, start, MyMathUtil.random(start, end)); //随机选择一个数,并交换至start处
		
		int i=1;
		int j=end-1;
		
		while(i<=j) {
			if(nums[i]>nums[start]) {
				MyArrayUtil.swap(nums, i, j);
				j--;
			}else {
				i++;
			}
		}
		
		MyArrayUtil.swap(nums, start, i-1); //将首位移动到分界位置
		
		quickSort(nums,start,i-1); //排序左边
		quickSort(nums,i,end); //排序右边
		
	}
	
	
}
