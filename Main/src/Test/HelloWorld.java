package Test;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hello World!!\n");
		System.out.print("�̸� �Է� : ");
		String name = s.next();
		System.out.print("�й� �Է� : ");
		int studentnum = s.nextInt();
		System.out.println("["+ studentnum + name + "]�� ȯ���մϴ�~");
	}

}
