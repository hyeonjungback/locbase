package iocbase;

public class MyForLoop2 {
	
	public int forLoop(int start, int end, int incre) {
		int sum = 0;
		end = end + 1;
		for(int i = start; i < end; i += incre) {
			sum = sum + i;
		}
		return sum;
	}
}
