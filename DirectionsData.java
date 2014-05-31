package com.beg;

import java.util.ArrayList;

import com.beg.RoutesData.Legs;
import com.beg.RoutesData.Routes;
import com.beg.RoutesData.Steps;
import com.google.gson.Gson;

public class DirectionsData {
	private ArrayList<Routes> routes;
	private Gson gson;
	private HttpResponseText http;
	
	/*constructor*/
	public DirectionsData(){
		this.routes = null;
	}
	
	public DirectionsData(ArrayList<Routes> routes){
		this.routes = (ArrayList<Routes>)routes;
	}
	/*end of Constructor*/
	
	public void Create(String url){
		this.http = new HttpResponseText(url, "GET");
		gson = new Gson();
		this.routes = this.gson.fromJson(this.http.getResponseText(), RoutesData.class).getRoutes();
	}
	
	public ArrayList<Legs> getAllLegs(int Lid) {
		return this.routes
				.get(Lid)
				.getLegs();
	}

	public ArrayList<Steps> getAllSteps(int Rid, int Lid) {
		return this.routes
				.get(Rid)
				.getLegs()
				.get(Lid)
				.getSteps();
	}

	public Legs getLegById(int Rid, int Lid) {
		return this.routes
				.get(Rid)
				.getLegs()
				.get(Lid);
	}

	public Steps getStepById(int Rid, int Lid, int Sid) {
		return this.routes
				.get(Rid)
				.getLegs()
				.get(Lid)
				.getSteps()
				.get(Sid);
	}

	public int getLegDistance(int RoutesId, int LegsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getDistance()
				.getValue();
	}
	
	public int getLegDuration(int Rid, int Lid){
		return this.routes
				.get(Rid)
				.getLegs()
				.get(Lid)
				.getDuration()
				.getValue();
	}
	
	public String getLegStartAddress(int RoutesId, int LegsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getStart_address();
	}
	
	public String getLegEndAddress(int RoutesId, int LegsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getEnd_address();
	}
	
	public int getStepsDistanceById(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getDistance()
				.getValue();
	}
	
	public String getStepsDurationById(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getDuration()
				.getText();
	}
	
	public double[] getLegsStartLocation(int RoutesId, int LegsId){
		double[] s = new double[2];
		s[0] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getStart_location()
				.getLat();
		s[1] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getStart_location()
				.getLng();
		return s;
	}
	
	public double[] getLegsEndLocation(int RoutesId, int LegsId){
		double[] s = new double[2];
		s[0] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getEnd_location()
				.getLat();
		s[1] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getEnd_location()
				.getLng();
		return s;
	}
	
	public double[] getStepsStartLocation(int RoutesId, int LegsId, int StepsId){
		double[] s = new double[2];
		s[0] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getStart_location()
				.getLat();
		s[1] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getStart_location()
				.getLng();
		return s;
	}
	
	public double[] getStepsEndLocation(int RoutesId, int LegsId, int StepsId){
		double[] s = new double[2];
		s[0] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getEnd_location()
				.getLat();
		s[1] = this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getEnd_location()
				.getLng();
		return s;
	}
	
	public String getStepsDuration(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getDuration()
				.getText();
	}
	
	public String getStepsDistance(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getDistance()
				.getText();
	}
	
	public String getStepsTravelMode(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getTravel_mode();
	}
	
	public String getStepsPolylines(int RoutesId, int LegsId, int StepsId){
		return this.routes
				.get(RoutesId)
				.getLegs()
				.get(LegsId)
				.getSteps()
				.get(StepsId)
				.getPolyline()
				.getPoints();
	}
}
