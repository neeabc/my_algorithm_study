package day001;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Demo01 {
	//插入排序
	public void insertSort(int[] arr) {  //升序排列
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			
			int j=i;
			
			while(j>0&&temp<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			
			arr[j]=temp;
		}
	}
	
	@Test
	public void testInsertUp() {
		
		int[] arr = {4,2};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//插入排序
	public void insertSortDown(int[] arr) { //降序排列
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i;
			while(j>0&&temp>arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}
	
	@Test
	public void testInsretDown() {
		int[] arr = {2,4,6,1,3,1,34,5,46,54,63,2,4,654,756};
		insertSortDown(arr);
		System.out.println(Arrays.toString(arr));
	}
}
