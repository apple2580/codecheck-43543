package codecheck;

import java.util.Arrays;
import java.util.List;

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

				for (int a = 1; a = len; a++) {

				}

			} else if (subCommand.equals(en)) {
				int num = args[1];
				StringBuilder sb = new StringBuilder();

				while (num != 0) {
					sb.append((String) ((num - 1) % 9 + 'A'));
					output = (num - 1) / 9;
				}
			}

			System.out.println(output);
		}
	}
}
