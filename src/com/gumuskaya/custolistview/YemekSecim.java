package com.gumuskaya.custolistview;

import java.io.Serializable;

@SuppressWarnings("serial")
public class YemekSecim implements Serializable{
	private double fiyat;
	private int adet;
	private String ad;
	
	public YemekSecim(double fiyat,int adet,String ad ) {
		super();
		this.fiyat=fiyat;
		this.setAdet(adet);
		this.ad=ad;
	}
	public double getFiyat(){
		return fiyat;
	}
	public void setFiyat(double fiyat){
		this.fiyat= fiyat;
	}
	public int getAdet(){
		return adet;
	}
	public void setAdet(int adet){
		this.adet= adet;
	}
	public String getAd(){
		return ad;
	}
	public void setAd(String ad){
		this.ad= ad;
	}

}
