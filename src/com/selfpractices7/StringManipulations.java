package com.selfpractices7;

public class StringManipulations {

	public static void main(String[] args) {
		String rana = "Servet Berrin Rana Akguc";

		System.out.println(rana.charAt(5));
		System.out.println(rana.compareTo("Hello"));
		System.out.println(rana.compareToIgnoreCase("Servet Berrin Rana Akguc"));
		System.out.println(rana.concat("Servet"));
		System.out.println(rana.contains("Rana"));
		System.out.println(rana.endsWith("Akguc"));
		System.out.println(rana.equals("servet berrin rana Akguc"));
		System.out.println(rana.equalsIgnoreCase("Servet Berrin Rana AKGUC"));
		System.out.println(rana.indexOf('e', 3));
		System.out.println(rana.indexOf("Berrin"));
		System.out.println(rana.isEmpty());
		System.out.println(rana.lastIndexOf("c"));
		System.out.println(rana.length());
		System.out.println(rana.replaceAll("a", "x"));
		System.out.println(rana.toCharArray());
		System.out.println(rana.toLowerCase());
		System.out.println(rana.toUpperCase());
		System.out.println(rana.replaceFirst("Servet", "Baba"));
		System.out.println(rana.startsWith("Se"));
		System.out.println(rana.subSequence(7, 13));
		System.out.println(rana.substring(7, 13));
		System.out.println(rana.substring(5));

		String[] str = rana.split(" ");

		for (String s : str) {
			System.out.println(s);
		}

		char[] str1 = rana.toCharArray();
		String reverse = "";
		for (int i = str1.length - 1; i >= 0; i--) {
			reverse += str1[i];

		}
		System.out.println(reverse);
			
	}
}
