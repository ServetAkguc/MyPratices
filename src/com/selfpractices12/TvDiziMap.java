package com.selfpractices12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class TvDiziMap {

	public static void main(String[] args) {
		Map<String, String> tvDiziler = new HashMap<>();
		tvDiziler.put("Show TV", "Cukur");
		tvDiziler.put("CNN", "Ana Haber");
		tvDiziler.put("NTV", "Spor Programi");
		tvDiziler.put("TRT 1", "Derbi Maci");
		tvDiziler.put("Yumurcak TV", "Masha ve Koca Ayi");
		System.out.println("============Map i print etmek istiyorum==============");
		System.out.println(tvDiziler);
		System.out.println("^^^^^^^^^^^^^^^^^^^SET ENTRY^^^^^^^^^^^^^^^^^^^^^");
		Set<Entry<String, String>> programlar = tvDiziler.entrySet();
		for (Entry<String, String> program : programlar) {
//			System.out.println(program);
			System.out.println("===========Key ve Value ayri ayri bastirdim=====================");
			System.out.println(program.getKey() + " kanalinda " + program.getValue() + " programi var");
		}
		System.out.println("////////////////////////////////////////////////");
		Iterator<Entry<String, String>> it = programlar.iterator();
		while (it.hasNext()) {
			Entry<String, String> yayin = it.next();
			String key = yayin.getKey();
			String value = yayin.getValue();
			System.out.println(key + " de suan canli yayinda " + value + " var.");
		}

		System.out.println("************************************");
		Set<String> keys = tvDiziler.keySet();
		for (String key : keys) {
			String k = tvDiziler.get(key);

			System.out.println(k);
		}
		System.out.println("============ITERATOR=========");
		Iterator<String> iterator1 = keys.iterator();
		while (iterator1.hasNext()) {
			String i = iterator1.next();
			System.out.println(i);
		}
	}
}
