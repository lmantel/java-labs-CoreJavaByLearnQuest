package com.javaoo.store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
	
	public Artist(String name) {
		setName(name);
	}
	
	public Artist() {
		memberNames = new TreeSet<>();
		memberInstruments = new TreeMap<>();
	}
	
	public Artist(String name, SortedSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
		super();
		setName(name);
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
	}
	
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers() {
		return memberNames;
	}
	
	public SortedSet<String> getInstruments(String memberName) {
		return memberInstruments.get(memberName);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//private String[] memberNames = new String[20];
	//private String[] memberInstruments = new String[20];
	private String name;
	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String>> memberInstruments;
}
