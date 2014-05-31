package com.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.annotations.SerializedName;

public class RoutesData {
	/* the class was order by depth of json, from inner to outer */

	public class Distance {

		private String text;
		private int value;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	public class Duration {
		private String text;
		private int value;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	public class Polyline {
		private String points;

		public String getPoints() {
			return points;
		}

		public void setPoints(String points) {
			this.points = points;
		}
	}

	public class EndLocation {
		private double lat;
		private double lng;

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}
	}

	public class StartLocation {
		private double lat;
		private double lng;

		public double getLat() {
			return lat;
		}

		public void setLat(double lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(double lng) {
			this.lng = lng;
		}
	}

	public class Steps {
		private String travel_mode;

		public String getTravel_mode() {
			return travel_mode;
		}

		public void setTravel_mode(String travel_mode) {
			this.travel_mode = travel_mode;
		}

		public Distance getDistance() {
			return distance;
		}

		public void setDistance(Distance distance) {
			this.distance = distance;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public EndLocation getEnd_location() {
			return end_location;
		}

		public void setEnd_location(EndLocation end_location) {
			this.end_location = end_location;
		}

		public String getHtml_instructions() {
			return html_instructions;
		}

		public void setHtml_instructions(String html_instructions) {
			this.html_instructions = html_instructions;
		}

		public Polyline getPolyline() {
			return polyline;
		}

		public void setPolyline(Polyline polyline) {
			this.polyline = polyline;
		}

		public StartLocation getStart_location() {
			return start_location;
		}

		public void setStart_location(StartLocation start_location) {
			this.start_location = start_location;
		}

		public String getSub_steps() {
			return sub_steps;
		}

		public void setSub_steps(String sub_steps) {
			this.sub_steps = sub_steps;
		}

		public String getTransit_details() {
			return transit_details;
		}

		public void setTransit_details(String transit_details) {
			this.transit_details = transit_details;
		}

		private Distance distance;
		private Duration duration;
		private EndLocation end_location;
		private String html_instructions;
		private Polyline polyline;
		private StartLocation start_location;
		private String sub_steps;
		private String transit_details;
	}

	public class ArrivalTime {
		private Date value;
		private String text;
		private TimeZone time_zone;
	}

	public class Legs {
		private ArrayList<Steps> steps;

		public ArrayList<Steps> getSteps() {
			return steps;
		}

		public void setSteps(ArrayList<Steps> steps) {
			this.steps = steps;
		}

		public Distance getDistance() {
			return distance;
		}

		public void setDistance(Distance distance) {
			this.distance = distance;
		}

		public Duration getDuration() {
			return duration;
		}

		public void setDuration(Duration duration) {
			this.duration = duration;
		}

		public ArrivalTime getArrival_time() {
			return arrival_time;
		}

		public void setArrival_time(ArrivalTime arrival_time) {
			this.arrival_time = arrival_time;
		}

		public Date getDuparture_time() {
			return duparture_time;
		}

		public void setDuparture_time(Date duparture_time) {
			this.duparture_time = duparture_time;
		}

		public StartLocation getStart_location() {
			return start_location;
		}

		public void setStart_location(StartLocation start_location) {
			this.start_location = start_location;
		}

		public EndLocation getEnd_location() {
			return end_location;
		}

		public void setEnd_location(EndLocation end_location) {
			this.end_location = end_location;
		}

		public String getStart_address() {
			return start_address;
		}

		public void setStart_address(String start_address) {
			this.start_address = start_address;
		}

		public String getEnd_address() {
			return end_address;
		}

		public void setEnd_address(String end_address) {
			this.end_address = end_address;
		}

		private Distance distance;
		private Duration duration;
		private ArrivalTime arrival_time;
		private Date duparture_time;
		private StartLocation start_location;
		private EndLocation end_location;
		private String start_address;
		private String end_address;
	}

	public class OverviewPolyline {
		private String points;

		public String getPoints() {
			return points;
		}

		public void setPoints(String points) {
			this.points = points;
		}
	}

	public class Northeast {
		private double lat;

		public double getLat() {
			return lat;
		}

		public void setLat(int lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(int lng) {
			this.lng = lng;
		}

		private double lng;
	}

	public class Southwest {
		private double lat;

		public double getLat() {
			return lat;
		}

		public void setLat(int lat) {
			this.lat = lat;
		}

		public double getLng() {
			return lng;
		}

		public void setLng(int lng) {
			this.lng = lng;
		}

		private double lng;
	}

	public class Bounds {
		private Northeast northeast;

		public Northeast getNortheast() {
			return northeast;
		}

		public void setNortheast(Northeast northeast) {
			this.northeast = northeast;
		}

		public Southwest getSouthwest() {
			return southwest;
		}

		public void setSouthwest(Southwest southwest) {
			this.southwest = southwest;
		}

		private Southwest southwest;
	}

	public class Routes {
		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public ArrayList<Legs> getLegs() {
			return legs;
		}

		public void setLegs(ArrayList<Legs> legs) {
			this.legs = legs;
		}

		public String[] getWaypoint_order() {
			return waypoint_order;
		}

		public void setWaypoint_order(String[] waypoint_order) {
			this.waypoint_order = waypoint_order;
		}

		public OverviewPolyline getOverview_polyline() {
			return overview_polyline;
		}

		public void setOverview_polyline(OverviewPolyline overview_polyline) {
			this.overview_polyline = overview_polyline;
		}

		public Bounds getBounds() {
			return bounds;
		}

		public void setBounds(Bounds bounds) {
			this.bounds = bounds;
		}

		public String getCopyrights() {
			return copyrights;
		}

		public void setCopyrights(String copyrights) {
			this.copyrights = copyrights;
		}

		public ArrayList<String> getWarnings() {
			return warnings;
		}

		public void setWarnings(ArrayList<String> warnings) {
			this.warnings = warnings;
		}

		private String summary;
		private ArrayList<Legs> legs;
		private String[] waypoint_order;
		private OverviewPolyline overview_polyline;
		private Bounds bounds;
		private String copyrights;
		private ArrayList<String> warnings;
	}

	@SerializedName("routes")
	private ArrayList<Routes> routes;

	public ArrayList<Routes> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Routes> routes) {
		this.routes = routes;
	}

}
