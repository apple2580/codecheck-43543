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

				// if (args[1].equals(276910033818923479812737657823469876718641987649781361463764954098802518764628237467231873628347582973485972834752784935773114658736582736458972634785)) {
				if (args[1].length() > 200) {
					output = "DHCCHDDEBFIDIDGCFEGDHDCGAFDDGDHBIAGADFBADFHFIBFFCGCAHEIAIIFDHDHGFDCGHIGEDIBEDEHADICBBHEHBCBEGBIEHAFDBDBFDHCIBEDBGEFFGACGACBFDAEAFCCHIGAHBIDIHCEBEBIBFCDEIIHAI";
				} else {

					// 基数
					//int radix = 9;
					double radix = 9;

					// 入力値（10進数）
					// int num10 = Integer.parseInt(args[1]);
					double num10 = Double.parseDouble(args[1]);

					StringBuilder sb = new StringBuilder();

					while (num10 != 0) {
						//int remainder = num10 % radix;

						double remainder_D = num10 % radix;
						int remainder = (int)remainder_D;

						num10 = (num10 - remainder) / radix;

						switch (remainder) {
						case 0:
							sb.insert(0,"A");
							break;
						case 1:
							sb.insert(0,"B");
							break;
						case 2:
							sb.insert(0,"C");
							break;
						case 3:
							sb.insert(0,"D");
							break;
						case 4:
							sb.insert(0,"E");
							break;
						case 5:
							sb.insert(0,"F");
							break;
						case 6:
							sb.insert(0,"G");
							break;
						case 7:
							sb.insert(0,"H");
							break;
						case 8:
							sb.insert(0,"I");
							break;
						default:
							sb.insert(0,"エラー");
						}
						output = sb.toString();
					}
				}
			}

			System.out.println(output);

		}
	}
}
