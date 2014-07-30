package com.example.unitconverter;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class Temp extends MainActivity{
	private Spinner spinner1,spinner2;
	String select, select2;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_temp);
		
		//spinner elements
		spinner1 = (Spinner)findViewById(R.id.spinner1);
		spinner2 = (Spinner)findViewById(R.id.spinner2);
		
		
        //Spinner Drop down elements 
         final List<String> list1 = new ArrayList<String>();
         final List<String> list2 = new ArrayList<String>();
        
        list1.add("Celsius");
        list1.add("Kelvin");
        list1.add("Farenheit");
                        
        list2.add("Celsius");
        list2.add("Kelvin");
        list2.add("Farenheit");
                        
        
        //create adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list1);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, list2);
        
        //Dropdown layout style - list view with radio Button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        //Attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter1);
        spinner2.setAdapter(dataAdapter2);
        
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub
				select = arg0.getItemAtPosition(pos).toString();
		
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        	
        });

        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub
				select2 = arg0.getItemAtPosition(pos).toString();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		
        });
        
        final Button BtnCal = (Button)findViewById(R.id.btnCTemp);
       // final EditText edit2 = (EditText)findViewById(R.id.edit2);
        
        BtnCal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final EditText edit1 = (EditText)findViewById(R.id.edit1);
				final String enum1 = edit1.getText().toString();
				final double Num1 = Double.parseDouble(enum1);
				
				//final EditText edit2 = (EditText)findViewById(R.id.edit2);
				final TextView edit2 = (TextView)findViewById(R.id.edit2);
				
			
				if(select == "Celsius")
				{
					
					if(select2 == "Celsius")
					{
						String s = Double.toString(Num1);
						edit2.setText(s+"  cel.");
					}
					else if(select2 == "Kelvin")
					{
						final double Num2 = Num1 + 273.15;
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  kelvin");
					}
					else if(select2 == "Farenheit")
					{
						final double Num2 = (Num1*(1.8))+32;
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  farh");
					}
				}
				
				//
				else if(select == "Kelvin")
				{
					
					if(select2 == "Celsius")
					{
						final double Num2 = Num1 -273.15;
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  cel.");
					}
					else if(select2 == "Kelvin")
					{
						String s = Double.toString(Num1);
						edit2.setText(s+"  kelvin");
					}
					else if(select2 == "Farenheit")
					{
						final double Num2 = (Num1*(1.8))-459.67;
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  farh");
					}
				}
				
				else if(select == "Farenheit")
				{
					
					if(select2 == "Celsius")
					{
						final double Num2 = (Num1 - 32)*(0.5555);
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  cel.");
					}
					else if(select2 == "Kelvin")
					{
						final double Num2 = (Num1 + 459.67) * (0.5555);
						String enum2 = Double.toString(Num2);
						edit2.setText(enum2+"  kelvin");	
					}
					else if(select2 == "Farenheit")
					{
						String s = Double.toString(Num1);
						edit2.setText(s+"  farh");
					}
				}
			}
        });
	}
}

