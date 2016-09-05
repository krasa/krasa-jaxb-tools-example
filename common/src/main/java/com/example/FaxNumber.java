package com.example;

public class FaxNumber {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static FaxNumber parse(String s) {
		FaxNumber n = new FaxNumber();
		n.value = s;
		return n;
	}

	public static String print(FaxNumber n) {
		return n.value;
	}
}