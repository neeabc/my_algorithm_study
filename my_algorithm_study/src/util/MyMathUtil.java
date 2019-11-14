package util;

public class MyMathUtil {
	
	//随机数	从start到end,不包含end
	public static int random(int start,int end) {
		return (int)((Math.random()*(end-start))+start);
	}
}
