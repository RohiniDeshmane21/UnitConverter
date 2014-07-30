package com.example.unitconverter;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final ListView myListView = (ListView)findViewById(R.id.listView1);
               
        String[] values = new String[]{ "Area", "Length","Volume","Weight","Temperature"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        myListView.setAdapter(adapter);
        
        myListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				String itemValue = (String)myListView.getItemAtPosition(position);
				
				if(itemValue == "Area")
				{
					Intent NextArea = new Intent(getApplicationContext(), Area.class);
					startActivity(NextArea);
				}
				else if(itemValue == "Length")
				{
					Intent NextLength = new Intent(getApplicationContext(), Length.class);
					startActivity(NextLength);
				}
				else if(itemValue == "Weight")
				{
					Intent NextWeight = new Intent(getApplicationContext(), Weight.class);
					startActivity(NextWeight);
				}
				else if(itemValue == "Volume")
				{
					Intent NextVolume = new Intent(getApplicationContext(), Volume.class);
					startActivity(NextVolume);
				}
				else if(itemValue == "Temperature")
				{
					Intent NextTemp = new Intent(getApplicationContext(), Temp.class);
					startActivity(NextTemp);
				}
			}
		
        });
        
        
        
        //Button Area to start
       // Button bArea = (Button)findViewById(R.id.btnArea);
       /*/ bArea.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent NextArea = new Intent(getApplicationContext(), Area.class);
				startActivity(NextArea);
			}
		});  
        
		
        //Button Weight to start
        Button bWeight = (Button)findViewById(R.id.btnWeight);
        bWeight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent NextWeight = new Intent(getApplicationContext(), Weight.class);
				startActivity(NextWeight);
			}
		});
        
        //Button Length to start
        Button bLength = (Button)findViewById(R.id.btnLength);
        bLength.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent NextLength = new Intent(getApplicationContext(), Length.class);
				startActivity(NextLength);
			}
		});
        
        //Button Volume to start
        Button bVolume = (Button)findViewById(R.id.btnVolume);
        bVolume.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent NextVolume = new Intent(getApplicationContext(), Volume.class);
				startActivity(NextVolume);
			}
		});
        
        //Button Temperature
        Button bTemp = (Button)findViewById(R.id.btnTemperature);
        bTemp.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent NextTemp = new Intent(getApplicationContext(), Temp.class);
				startActivity(NextTemp);
			}
		});*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
