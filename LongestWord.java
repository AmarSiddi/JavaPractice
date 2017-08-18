package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {

	public static void main(String[] args)
	{
		String sen="java## 343Testing  Program";
		
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(sen);
		String str1 = matcher.replaceAll("");
		
		
		String longest = "";
		
		String[] words = str1.split(" ");
		System.out.println(words);
		for(String word:words){
			if(word.length()>longest.length()){
				longest = word;
			}
		}
		System.out.println(longest);
		
		
		
		//This is to count each worl length in a string
		/*
		int count=0;
		
		for(int i=0; i<str1.length();i++)
		{
			if(str1.charAt(i)==' ')
			{
				System.out.println("count of a word is" + count);
	            count = 0;
	        } else {
	            count++;
	        }
		}
		System.out.println(count);
		return number;
		*/

	}


}
