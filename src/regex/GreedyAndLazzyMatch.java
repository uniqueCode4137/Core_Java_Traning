package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazzyMatch {

	public static void main(String[] args) {
	

		/*
		 *  * - Greedy  *? - non-greedy
		 *  + - Greedy  +? - non-greedy
		 *  {} - Greedy  {}? - non-greedy
		 */
		
		String str1 = "XXfdugshYYyfuwgXXytufgh678ijYYgusdfhXXfvgfgfgXXhggYYjhjj";
		
		String patt = "XX.+?YY";
		
		Pattern p = Pattern.compile(patt);
		
		Matcher m = p.matcher(str1);
		
		System.out.println( m.results().count());
		
		m.reset();
		
		while(m.find()) {
			
			System.out.println("starts at:- "+m.start());
			System.out.println(m.group());
		}
	}

}
