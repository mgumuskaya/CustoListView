package com.gumuskaya.custolistview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener{

	private ListView myListView;
	private Button btn1,btn2,btn3;
	MyListAdapter myListAdapter;
	ArrayList<YemekSecim> mydatalist=new ArrayList<YemekSecim>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				YemekSecim ys=new YemekSecim(8.00, 2, "Tatlý");
				kaydet(ys);
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				YemekSecim ys=new YemekSecim(9.00, 2, "Pizza");
				kaydet(ys);
			}
		});
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				YemekSecim ys=new YemekSecim(25.00, 2, "Lahmacun");
				kaydet(ys);
				
			}
		});
		
		YemekSecim ym1=new YemekSecim(12.4,1,"salata");
		YemekSecim ym2 =new YemekSecim(10.1,1,"çorba");
		YemekSecim ym3 =new YemekSecim(112.4,1,"kahve");
		mydatalist.add(ym1);
		mydatalist.add(ym2);
		mydatalist.add(ym3);
		
		myListView=(ListView)findViewById(R.id.listView);
		myListView.setAdapter(new MyListAdapter(this,R.layout.list_items,mydatalist));
		myListView.setOnItemClickListener(this);
	}
	public void kaydet(YemekSecim ymk){
		mydatalist.add(ymk);
		myListView.setAdapter(new MyListAdapter(this,R.layout.list_items,mydatalist));
		myListView.setSelection(myListView.getAdapter().getCount()-1);
		myListView.setItemsCanFocus(true);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		YemekSecim tik=mydatalist.get(arg2);
		Toast.makeText(getApplicationContext(), tik.getAd()+""+tik.getAdet()+""+tik.getFiyat(),Toast.LENGTH_SHORT).show();
	}

}

