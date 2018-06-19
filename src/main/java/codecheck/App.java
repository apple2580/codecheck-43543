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

				//for (int j = 1; j == len; j++) {

				//}

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
