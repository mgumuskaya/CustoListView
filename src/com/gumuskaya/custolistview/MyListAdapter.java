package com.gumuskaya.custolistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<YemekSecim>{

	private ArrayList<YemekSecim> items;
	
public MyListAdapter(Context con,int textViewResId, ArrayList<YemekSecim> items) {
	super(con,textViewResId,items);
	this.items=items;
}
@Override
public View getView(int position, View convertView, ViewGroup parent) {
View v = convertView;
if(v ==null) {
LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
v = vi.inflate(R.layout.list_items,null);
}

	YemekSecim myData=items.get(position);
	if(myData !=null) {
		 TextView ad = (TextView) v.findViewById(R.id.ad);
		 TextView fiyat = (TextView) v.findViewById(R.id.fiyat);
		 TextView adet = (TextView) v.findViewById(R.id.adet);
		 if(ad!=null){
				ad.setText(myData.getAd());
				fiyat.setText(String.valueOf(myData.getFiyat()));
				adet.setText(String.valueOf(myData.getAdet()));
			}
	}
	return v;
}
private LayoutInflater getSystemService(String layoutInflaterService) {
	// TODO Auto-generated method stub
	return null;
}

}