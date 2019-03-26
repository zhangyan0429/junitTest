package junit_0326;

public class Test2 {
//参数化测试和异常测试
	public int kakeru(int x,int y) {
		return x*y;
	}
	public int chu(int x,int y) throws ArithmeticException{
		return x/y;
	}
}
