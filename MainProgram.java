package com.org;

public class MainProgram {

	public static void main(String[] args) {
		
		/*Example for 台北市 to 台中市*/
		DirectionAPIRequest da = new DirectionAPIRequest("json", "台北市", "台中市", false);
		DirectionsData dd = new DirectionsData();
		
		/*set the request mode to WALKING*/
		da.setMode(mode.WALKING);
		
		dd.Create(da.getRequestUrl());/*get the url and send to google web service*/
		System.out.println(dd.getStepsDistance(0, 0, 0));/*will return '20公尺'*/
	}
}

