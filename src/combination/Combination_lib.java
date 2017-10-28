package combination;

public class Combination_lib {
	private int s, r;
	
	public Combination_lib(int s, int r) {
		this.s = s;
		this.r = r;
	}
	
	public int getFactorial(int n) {
		int f,i;
		f = 1;
		for (i = 1; i <= n; i++){
			f = f * i;
		}
		return f;
	}
	
}
