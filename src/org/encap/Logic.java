package org.encap;

public class Logic {

	public static void main(String[] args) {
		String s = "Welcome to my channel";
		String s1 = "";
		String[] s3 = s.split("");
		for (String s4 : s3) {
			String s5 = "";
			for (int i = s4.length() - 1; i > 0; i--) {
				char c = s4.charAt(i);
				s5 = s5 + c;

			}
			s1 = s1 + s5 + "";
		}
		System.out.println(s1);

	}

}
