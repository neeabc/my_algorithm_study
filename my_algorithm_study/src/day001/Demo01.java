package day001;

public class Demo01 {
	//汉诺塔
	public void hanoi(int num,String A,String B,String C) {
		
		//结束条件
		if(num==1) {
			System.out.println(A+"-->"+C); //当只有一个盘子时,直接从A到C
			return;
		}
		
		hanoi(num-1,A,C,B); //num-1个盘子,通过C,从A到B
		System.out.println(A+"-->"+C); //最底下的盘子,直接从A到C
		hanoi(num-1,B,A,C); //num-1个盘子,通过A,从B到C
		
	}
}
