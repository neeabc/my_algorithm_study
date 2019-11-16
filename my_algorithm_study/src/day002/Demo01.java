package day002;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo01 {
	
	@Test
	public void mergeSortTest() {
		int[] nums = {65,5456,2,45,87,56,8,89,8,90};
		mergeSort(nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));
	}
	
	
	//归并排序
	public void mergeSort(int[] nums,int start,int end) {
		if((end-start)<=1) {
			return;
		}
		
		int mid = (start+end)/2;
		mergeSort(nums,start,mid);
		mergeSort(nums,mid,end);
		merge(nums,start,mid,end);
		
	}
	
	
	//[start,mid)与[mid,end)进行归并
	//数据中有Integer.MAX_VALUE排序可能出现问题
	public void merge(int[] nums,int start,int mid,int end) { 
		int[] A = new int[mid-start+1];
		int[] B = new int[end-mid+1];
		
		for(int i=start,j=0;i<mid;i++,j++) { //复制数组
			A[j]=nums[i];
		}
		A[A.length-1]=Integer.MAX_VALUE; //结束标记
		
		for(int i=mid,j=0;i<end;i++,j++) {
			B[j]=nums[i];
		}
		B[B.length-1]=Integer.MAX_VALUE;
		
		//将复制的数组写回
		for(int i=start,m=0,n=0;i<end;i++) {
			if(A[m]<B[n]) {
				nums[i]=A[m];
				m++;
			}else {
				nums[i]=B[n];
				n++;
			}
		}
	}
}
