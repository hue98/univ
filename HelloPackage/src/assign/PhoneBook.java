package assign;

import java.util.Scanner;

public class PhoneBook {
	
	int numberOfperson;
	
	public static void main(String[] args) {
		
		int i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("number of person : ");
		int numberOfperson = scanner.nextInt();
		System.out.println();
		
		Phone [] phone = new Phone [numberOfperson];
		
		for(i=0; i<numberOfperson; i++) {
			System.out.println("Name and PhoneNumber (ex. 홍길동 010-1234-5678) >> ");
			String name = scanner.next();
			String num = scanner.next();
			phone[i] = new Phone(name, num);
			if(i==numberOfperson-1)
				break;
		}
		System.out.println("Store Done");
		
		while(true) {
			System.out.print("name to search >> ");
			String name = scanner.next();
			if (name.equals("Stop"))
				break;
			for (i=0; i<numberOfperson; i++) {
				if(phone[i].name.equals(name)) {
				System.out.print(name + "'s number is " +phone[i].num);
				}
				break;
			}
		
			if(i==numberOfperson) {
			System.out.println(name + " not found");
			}
		}
	}

}
	