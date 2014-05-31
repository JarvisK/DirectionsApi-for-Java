package com.beg;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DirectionAPIRequest {
	private final String basicUrl = "http://maps.googleapis.com/maps/api/directions/"; 
	
	private String contentType;
	private String destination;
	private boolean sensor;
	private String mode;
	private String waypoints;
	private boolean alternatives;
	private String avoid;
	private String units;
	private String region;
	private String departure_time;
	private String arrival_time;
	private String origin;
	
	public DirectionAPIRequest(String contentType, String origin, String destination, boolean sensor){
		try {
			this.contentType = URLEncoder.encode(contentType, "utf-8");
			this.origin = URLEncoder.encode(origin,"utf-8");
			this.destination = URLEncoder.encode(destination,"utf-8");
			this.sensor = URLEncoder.encode(String.valueOf(sensor), "utf-8") != null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
	public String getRequestUrl(){
		StringBuilder s = new StringBuilder();
		s.append(this.basicUrl + this.contentType+"?");
		s.append("origin="+this.origin);
		s.append("&destination="+this.destination);
		s.append("&sensor="+String.valueOf(this.sensor));
		if(this.mode != null && this.mode != ""){
			s.append("&mode="+this.mode);
		}
		return s.toString();
	}
	
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isSensor() {
		return sensor;
	}

	public void setSensor(boolean sensor) {
		this.sensor = sensor;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getWaypoints() {
		return waypoints;
	}

	public void setWaypoints(String waypoints) {
		this.waypoints = waypoints;
	}

	public boolean isAlternatives() {
		return alternatives;
	}

	public void setAlternatives(boolean alternatives) {
		this.alternatives = alternatives;
	}

	public String getAvoid() {
		return avoid;
	}

	public void setAvoid(String avoid) {
		this.avoid = avoid;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	
}
