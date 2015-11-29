package prv.chenxs.handprj.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountUtil {
	public static final String wordSplitRegular="( )+|,|(\\.)+|(\\?)+|(:)+|(;)+|(')+|(\\\")+";
	
	@SuppressWarnings("resource")
	public static Map<String,Integer> count(String text){
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		Scanner s = new Scanner(text).useDelimiter(wordSplitRegular);
		while (s.hasNext()) {
			String word = s.next();
			if (StringUtil.isNotBlank(word)) {
				wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word) + 1 : 1);
			}
		}
		s.close();
		return wordCount;
	}
}
