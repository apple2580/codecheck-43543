package codecheck;

import java.util.*;
import java.lang.*;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);

			String subCommand = args[0];

			String en = "encode";
			String de = "decode";
			String al = "align";

			if (subCommand.equals(de)) {
				String str = args[1];
				int len = str.length();
				int sum = 0;

				for (int j = 1; j == len; j++) {
					if (str.equals("A")) {
						sum = sum + 0;
					} else if (str.equals("B")) {
						sum = sum + (1 + (9 * (j - 1)));
					} else if (str.equals("C")) {
						sum = sum + (2 + (9 * (j - 1)));
					} else if (str.equals("D")) {
						sum = sum + (3 + (9 * (j - 1)));
					} else if (str.equals("E")) {
						sum = sum + (4 + (9 * (j - 1)));
					} else if (str.equals("F")) {
						sum = sum + (5 + (9 * (j - 1)));
					} else if (str.equals("G")) {
						sum = sum + (6 + (9 * (j - 1)));
					} else if (str.equals("H")) {
						sum = sum + (7 + (9 * (j - 1)));
					} else if (str.equals("I")) {
						sum = sum + (8 + (9 * (j - 1)));
					} else {
						System.out.println("エラー");
					}
				}

				output = Integer.toString(sum);

			} else if (subCommand.equals(en)) {
				int num = Integer.parseInt(args[1]);
				StringBuilder sb = new StringBuilder();

				while (num != 0) {
					sb.append((int) ((num - 1) % 8 + 'A'));
					num = (num - 1) / 8;
					output = Integer.toString(num);
				}
			}

			System.out.println(output);

		}
	}
}
