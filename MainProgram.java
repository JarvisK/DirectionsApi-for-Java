package com.beg;

public class MainProgram {

	public static void main(String[] args) {
		DirectionAPIRequest da = new DirectionAPIRequest("json", "�x�_��", "�x����", false);
		DirectionsData dd = new DirectionsData();
		System.out.println(da.getRequestUrl());
		dd.Create(da.getRequestUrl());
		System.out.println(dd.getStepsDistance(0, 0, 0));
	}
}

