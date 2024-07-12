package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(">>");

		while (true) {

			for (int i = 0; i < 1; i++) {
				String str = sc.nextLine();
				if (str.equals("/q")) {
					System.out.println("종료합니다.");
					break;
				}

				String[] sArr = str.split(" ");
				int a = Integer.parseInt(sArr[0]);
				String b = sArr[1];
				int c = Integer.parseInt(sArr[2]);

				if (b.equals("+")) {
					Add add = new Add();
					add.setValue(a, c);
					System.out.println(add.calculate());
					;
				} else if (b.equals("-")) {
					Sub sub = new Sub();
					sub.setValue(a, c);
					System.out.println(sub.calculate());
					;
				} else if (b.equals("/")) {
					Div div = new Div();
					div.setValue(a, c);
					System.out.println(div.calculate());
					;
				} else if (b.equals("*")) {
					Mul mul = new Mul();
					mul.setValue(a, c);
					System.out.println(mul.calculate());
					;
				} else {
				
					System.out.println("알수 없는 연산 입니다.");
				
				}
				
				System.out.print(">>");
			}
			sc.close();
		}
	}

}
