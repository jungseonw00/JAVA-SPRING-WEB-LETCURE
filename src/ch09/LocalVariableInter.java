package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		
		// 타입을 정확하게 작성하지 않아도 알아서 출력 해준다. 
		// 단, 한 번 정해진 데이터타입은 자바에서는 바뀌지 않는다. 
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
		// str = 3;
	}

}
