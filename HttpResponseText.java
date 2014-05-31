package com.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class HttpResponseText {
	private URL targetUrl;
	private String method;
	private HttpURLConnection conn;
	private final String userAgent = "Mozilla/5.0";
	private final String acceptLanguage = "zh-tw,zh;en-us;";
	
	public HttpResponseText(){
		try {
			this.setURL("https://www.google.com");
			this.method = "GET";
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public HttpResponseText(String url, String method){
		try {
			this.targetUrl = new URL(url);
			this.method = method.toUpperCase();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void setURL(String url) throws MalformedURLException{
		this.targetUrl = new URL(url);
	}
	
	public void setMethod(String method){
		this.method = method.toUpperCase();
	}
	
	public URL getTargetUrl(){
		return this.targetUrl;
	}
	
	public String method(){
		return this.method();
	}
	
	public String getResponseText(){
		BufferedReader br = null;
		String tmp = "";
		StringBuffer sb = null;
		
		try {
			this.conn = (HttpURLConnection)targetUrl.openConnection();
			conn.setRequestProperty("User-Agent", this.userAgent);
			conn.setRequestProperty("Accept-Language", this.acceptLanguage);
			conn.setRequestMethod(this.method);
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			sb = new StringBuffer();
			while((tmp = br.readLine()) != null){
				sb.append(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString().replaceAll(" ", "");
	}
}
