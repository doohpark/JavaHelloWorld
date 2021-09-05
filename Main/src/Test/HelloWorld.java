package Test;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!\n");
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("학번 입력 : ");
		int studentnum = s.nextInt();
		System.out.println("["+ studentnum + name + "]님 환영합니다~");
	}

}
