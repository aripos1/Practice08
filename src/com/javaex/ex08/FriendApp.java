package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Friend[] friends = new Friend[3];

		System.out.println("친구 3명을 등록하세요");

		for (int i = 0; i < 3; i++) {

			String name = sc.nextLine();
			String[] sArr = name.split(" ");

			if (sArr.length == 3) {
				friends[i] = new Friend(sArr[0], sArr[1], sArr[2]);
			} 
		} for (Friend friend : friends) {
            friend.showInfo(); // showInfo 메서드를 사용하여 정보 출력
        }
	}

}
