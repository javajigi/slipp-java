package net.slipp.reflection;

import java.util.Scanner;

public class ClassRunner {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String command = scanner.nextLine();
			if ("quit".equals(command)) {
				break;
			}
			
			if (command.startsWith("run")) {
				String[] commands = command.split(" ");
				if (commands.length != 3) {
					System.out.println("run 명령어는 인자가 2개여야 합니다.");
					continue;
				}
			}
		}
		
		scanner.close();
	}
}