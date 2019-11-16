package day002;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo02 {
	//归并排序,不使用哨兵
	@Test
	public void mergeSortTest() {
		int[] nums = {65,5456,2,45,87,56,8,89,8,90,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
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
	
	public void merge(int[] nums,int start,int mid,int end){
		int[] A = new int[mid-start];
		int[] B = new int[end-mid];
		
		//复制数组
		for(int i=start,j=0;i<mid;i++,j++) {
			A[j]=nums[i];
		}
		
		for(int i=mid,j=0;i<end;i++,j++) {
			B[j]=nums[i];
		}
		
		int a=0;
		int b=0;
		int s=start;
		
		while(a<A.length&&b<B.length) {
			if(A[a]<B[b]) {
				nums[s]=A[a];
				s++;
				a++;
			}else {
				nums[s]=B[b];
				s++;
				b++;
			}
		}
		
		//如果有剩余,将剩余的数字写入
		while(a<A.length) {
			nums[s]=A[a];
			s++;
			a++;
		}
		
		while(b<B.length) {
			nums[s]=B[b];
			s++;
			b++;
		}
	}
}
