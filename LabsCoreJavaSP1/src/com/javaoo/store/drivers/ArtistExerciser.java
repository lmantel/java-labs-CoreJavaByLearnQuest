package com.javaoo.store.drivers;

import static java.lang.System.out;

import java.util.TreeSet;

import com.javaoo.store.Artist;

public class ArtistExerciser {
	
	public static void printMemberInstruments(Artist artist, String memberName) {
		out.printf("%s band member %s plays: %n", artist.getName(), memberName);
		for (String instrument: artist.getInstruments(memberName)) {
			out.println("\t" + instrument);
		}
	}

	public static void main(String[] args) {
		
		Artist hotPlate = new Artist();
		hotPlate.setName("GnR");
		
		TreeSet<String> instruments1 = new TreeSet<>();
		instruments1.add("Piano");
		instruments1.add("Clarinet");
		instruments1.add("Tuba");
		instruments1.add("Guitar");
		hotPlate.addMember("Tom", instruments1);
		
		TreeSet<String> instruments2 = new TreeSet<>();
		instruments2.add("Traingle");
		instruments2.add("Saxo");
		instruments2.add("Toc");
		instruments2.add("Bass");
		hotPlate.addMember("Steve", instruments2);
		
		printMemberInstruments(hotPlate, "Tom");
		printMemberInstruments(hotPlate, "Steve");
		
		
		/*
		Artist hotplate = new Artist("HotPlate");
		SortedSet<String> instruments1 = new TreeSet<>();
		instruments1.addAll(Arrays.asList(new String[] {"Piano", "Clarinet", "Hurdy Gurdy", "Tuba"}));
		hotplate.addMember("Tom", instruments1);
		
		SortedSet<String> instruments2 = new TreeSet<>();
		instruments2.addAll(Arrays.asList(new String[] {"Piano", "Drums"}));
		hotplate.addMember("Steve", instruments2);
		
		printMemberInstruments(hotplate, "Tom");
		printMemberInstruments(hotplate, "Steve");
		*/
		
	}
}
