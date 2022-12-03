package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
		
		for (; dan <= 9; dan++) {
			
			for (count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + "=" + dan * count);
			}
			System.out.println();
		}
		
		System.out.println("========================");
		System.out.println("for문 끝");
		System.out.println("========================");
		System.out.println();
		
		// while문으로 표현하기 위해서 변수에 값 입력
		dan = 2;
		count = 1;
		while (dan <= 9) {
			
			count = 1;
			while (count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}
}