package jan14;
/*
 * 예외처리
 * 1.compileException - 무조건 try~catch
 * 2.RuntimeException - 선택적..
 */
public class ExceptionEx6 {

	public static void main(String[] args) {
		//throw new Exception(); // 에러
		throw new RuntimeException(); //컴파일은 됨, 실행은 안됨
	}

}
