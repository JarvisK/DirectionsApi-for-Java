package com.org;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

enum mode {DRIVING, WALKING, BICYCLING, TRANSIT}

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

	public DirectionAPIRequest(String contentType, String origin, String destination, boolean sensor) {

		this.contentType = contentType;
		this.origin = origin;
		this.destination = destination;
		this.sensor = sensor;
	}

	public String getRequestUrl() {
		StringBuilder s = new StringBuilder();
		s.append(this.basicUrl + this.contentType + "?");
		s.append("origin=" + converter(this.origin));
		s.append("&destination=" + converter(this.destination));
		s.append("&sensor=" + converter(String.valueOf(this.sensor)));
		if (this.mode != null && this.mode != "") {
			s.append("&mode=" + converter(this.mode));
		}
		return s.toString();
	}

	public String converter(String in) {
		String tmp = "";
		try {
			tmp = URLEncoder.encode(in, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return tmp;
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

	public void setMode(mode m) {
		switch(m){
		case DRIVING:
			this.mode = "driving";
			break;
		case WALKING:
			this.mode = "walking";
			break;
		case BICYCLING:
			this.mode = "bicycling";
			break;
		case TRANSIT:
			this.mode = "transit";
			break;
		default:
			this.mode = "driving";
		}
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
