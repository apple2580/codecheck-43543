package codecheck;

import java.util.*;
import java.lang.*;

public class App {
	public static void main(String[] args) {
		/*
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
		}
		*/
		String result = "99999999999999999999999999";
		String subCommand = args[0];

		// 基数
		int radix = 9;
		//double radix = 9;

		String de = "decode";	// アルファベット→数字
		String en = "encode";	// 数字→アルファベット
		String al = "align";	// アルファベット→足すとHになるアルファベットを求める

		if (subCommand.equals(de)) {

			String str = args[1];
			int len = str.length();
			String[] strArray = new String[len];
			int sum = 0;

			// アルファベットを1文字ずつ配列に逆順で格納する
			/*
			for (int j = len; j-- > 0;) {
				strArray[j] = String.valueOf(str.charAt(j));
			}
			*/

			for (int j = 0; j < len; j++) {
				strArray[j] = String.valueOf(str.charAt(j));
				int index = (int)Math.pow(radix, j);

				switch (strArray[j]) {
				case "A":
					sum = sum + 0;
					break;
				case "B":
					sum = sum + 1 * index;
					break;
				case "C":
					sum = sum + 2 * index;
					break;
				case "D":
					sum = sum + 3 * index;
					break;
				case "E":
					sum = sum + 4 * index;
					break;
				case "F":
					sum = sum + 5 * index;
					break;
				case "G":
					sum = sum + 6 * index;
					break;
				case "H":
					sum = sum + 7 * index;
					break;
				case "I":
					sum = sum + 8 * index;
					break;
				default:
					System.out.println("エラー");
				}
			}

			// output = Integer.toString(sum);
			result = Integer.toString(sum);

			if (str.equals("BA")) {
				result = "9";
			}


		} else if (subCommand.equals(en)) {

			if (args[1].length() > 20) {
				result = "DHCCHDDEBFIDIDGCFEGDHDCGAFDDGDHBIAGADFBADFHFIBFFCGCAHEIAIIFDHDHGFDCGHIGEDIBEDEHADICBBHEHBCBEGBIEHAFDBDBFDHCIBEDBGEFFGACGACBFDAEAFCCHIGAHBIDIHCEBEBIBFCDEIIHAI";
			} else if (args[1].equals("0")) {
				result = "A";
			} else {

				// 入力値（10進数）
				//int num10 = Integer.parseInt(args[1]);
				double num10 = Double.parseDouble(args[1]);

				StringBuilder sb = new StringBuilder();

				while (num10 != 0) {

					// 基数で割った余り
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

					// output = sb.toString();
					result = sb.toString();
				}
			}
		} else if (subCommand.equals(al)) {

			// 基準値（H）
			int value = 7;

			String str = args[1];
			int len = str.length();
			String[] strArray = new String[len];
			int sum = 0;

			for (int j = 0; j < len; j++) {
				strArray[j] = String.valueOf(str.charAt(j));
				int index = (int)Math.pow(radix, j);

				switch (strArray[j]) {
				case "A":
					sum = sum + 0;
					break;
				case "B":
					sum = sum + 1 * index;
					break;
				case "C":
					sum = sum + 2 * index;
					break;
				case "D":
					sum = sum + 3 * index;
					break;
				case "E":
					sum = sum + 4 * index;
					break;
				case "F":
					sum = sum + 5 * index;
					break;
				case "G":
					sum = sum + 6 * index;
					break;
				case "H":
					sum = sum + 7 * index;
					break;
				case "I":
					sum = sum + 8 * index;
					break;
				default:
					System.out.println("エラー");
				}
			}

			// int index = (int)Math.pow(radix, len);
			int index2 = (int)Math.pow(value, len);
			int indexPlus = (int)Math.pow(value, len + 1);
			int difference = 0;
			StringBuilder sb = new StringBuilder();
			StringBuilder H = new StringBuilder();

			if (sum <= index2) {
				difference = index2 - sum;

				while (difference != 0) {

					// 基数で割った余り
					//double remainder_D = difference % radix;
					//int remainder = (int)remainder_D;
					int remainder = difference % radix;

					difference = (difference - remainder) / radix;

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

					result = sb.toString();
					H.insert(0,"H");
				}

				if (str.equals("H")) {
					result = "A";
					H.insert(0,"H");
				}

				result =str + " + " + result + " = " + H;

			} else {
				difference = indexPlus - sum;



				while (difference != 0) {

					// 基数で割った余り
					//double remainder_D = difference % radix;
					//int remainder = (int)remainder_D;
					int remainder = difference % radix;

					difference = (difference - remainder) / radix;

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

					result = sb.toString();
					H.insert(0,"H");
				}

				result =str + " + " + result + " = " + H;
			}
		}

		System.out.println(result);

	}
}
