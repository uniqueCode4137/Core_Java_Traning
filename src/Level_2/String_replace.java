package Level_2;

public class String_replace {

	public static void main(String[] args) {
		
		/*
		 Replace - Normal
		 ReplaceAll - Regrex
		 */
		
		String str1 = "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
		String str2 = "1234";
		String str3 = "I";
		
		System.out.println(str1.replace(str2,str3));
		
		String str4 = "EI#$T%HER #YO&*U CON#@$TROL YO$#@@UR M%$IND O%$R &%$IT W$#@%$ILL CON#@$TROL YO*&U";
		String patt = "[^A-Za-z0-9\\s]";
		
		System.out.println(str4.replaceAll(patt, ""));
	}

}
