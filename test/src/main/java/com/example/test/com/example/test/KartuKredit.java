package com.example.test.com.example.test;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KartuKredit {
	/*Nomor Kartu Kredit
	Nama di Kartu
	Jenis Kartu Kredit (Silver, Gold, Platinum)
	Expiry Date (dalam mm/yy)
	Limit kartu kredit
	id pemilik
	*/
	
	private long idkartu;
	private String name;
	private String jenis;
	private String date;
	private int limit;
	private int idowner;
	
	public KartuKredit(
			@JsonProperty("idkartu") long idkartu, 
			@JsonProperty("name") String name, 
			@JsonProperty("jenis") String jenis, 
			@JsonProperty("date") String date, 
			@JsonProperty("limit") int limit, 
			@JsonProperty("idowner") int idowner) {
		this.idkartu = idkartu;
		this.name = name;
		this.jenis = jenis;
		this.date = date;
		this.limit = limit;
		this.idowner = idowner;
	}
	
	public long getIdkartu() {
		return idkartu;
	}
	public String getName() {
		return name;
	}
	public String getJenis() {
		return jenis;
	}
	public String getDate() {
		return date;
	}
	public int getLimit() {
		return limit;
	}
	public int getIdowner() {
		return idowner;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void setIdowner(int idowner) {
		this.idowner = idowner;
	}
	
	
}
