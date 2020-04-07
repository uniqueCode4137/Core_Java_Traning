package Special_Class;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "I";
		 str1+= " Like";
		str1+= " Java";
		System.out.println(str1);
		
		StringBuilder sb1 = new StringBuilder("I");
		sb1.append(" Like");
		sb1.append(" java");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Learning is fun");
		sb1.insert(9, "JAVA");
		System.out.println(sb2);
		sb2.replace(9, 13, "Everything");
		System.out.println(sb2);
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		sb2.delete(2, 10);
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
	}

}
