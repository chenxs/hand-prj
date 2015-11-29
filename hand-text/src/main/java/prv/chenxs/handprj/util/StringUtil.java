package prv.chenxs.handprj.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class StringUtil extends StringUtils {
	public static String invert(String arg) {
		if (StringUtils.isNotBlank(arg)) {
			char[] argArr = arg.toCharArray();
			return new String(ArrayUtil.invertArr(argArr));
		}
		return arg;
	}

	public static boolean isPlalindrome(String arg) {
		if (StringUtils.isNotBlank(arg)) {
			char[] argArr = arg.toCharArray();
			int argLength = arg.length();
			for (int i = 0; i < argLength / 2; i++) {
				if (argArr[i] != argArr[argLength - (i + 1)]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(invert("abcdefg"));
		 * System.out.println(invert("1234567"));
		 * System.out.println(invert("")); System.out.println(invert(null));
		 * System.out.println(isPlalindrome("abcdefg"));
		 * System.out.println(isPlalindrome("abcddcba"));
		 * System.out.println(isPlalindrome("abcdedcba"));
		 * System.out.println(isPlalindrome(""));
		 * System.out.println(isPlalindrome(null));
		 */
		String input = "1.... abc fish ' red fish ' i'm is a \"whats rong.\",Dav say:\"this wrong.\"  2 fish blue fish blue3 fish";
		System.out.println(WordCountUtil.count(input));
	}
}
