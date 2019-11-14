package day001;

import org.junit.jupiter.api.Test;

public class Demo01Test {
	@Test
	public void testHanoi() {
		Demo01 demo = new Demo01();
		
		demo.hanoi(3, "A", "B", "C");
	}
}
