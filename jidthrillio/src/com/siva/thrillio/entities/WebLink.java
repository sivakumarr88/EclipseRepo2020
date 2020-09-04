package com.siva.thrillio.entities;

public class WebLink extends Bookmark {
	
	private String url;
	private String host;
	
	public WebLink(long id, String title, String url, String host) {
		super();
		this.setId(id);
		this.setTitle(title);
		this.url = url;
		this.host = host;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
}
