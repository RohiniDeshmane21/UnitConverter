package com.example.unitconverter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
public class Length extends MainActivity {

	private Spinner spinner1,spinner2;
	String select, select2;
	@Override
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_length);
		
		//spinner elements
				spinner1 = (Spinner)findViewById(R.id.spinner1);
				spinner2 = (Spinner)findViewById(R.id.spinner2);
				
				 //Spinner Drop down elements 
		         final List<String> list1 = new ArrayList<String>();
		         final List<String> list2 = new ArrayList<String>();
		        
		         list1.add("Foot");
		        list1.add("Inch");
		        list1.add("Kilometer");
		        list1.add("Meter");
		        list1.add("Mile");
		        list1.add("Micrometer");
		        list1.add("Yard");
		        list1.add("Milimeter");
		                
		        list2.add("Foot");
		        list2.add("Inch");
		        list2.add("Kilometer");
		        list2.add("Meter");
		        list2.add("Mile");
		        list2.add("Micrometer");
		        list2.add("Yard");
		        list2.add("Milimeter");
		        
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
   
		//final EditText edit2 = (EditText)findViewById(R.id.edit2);
		        final TextView edit2 = (TextView)findViewById(R.id.edit2);
		final Button BtnCal = (Button)findViewById(R.id.btnCLength);
		
		BtnCal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final EditText edit1 = (EditText)findViewById(R.id.edit1);
				final String enum1 = edit1.getText().toString();
				final double Num1 = Double.parseDouble(enum1);
			
				String key = select + " -> " + select2;
		        Hashtable<String, Double> ht = new Hashtable<String, Double>(100);
		       		        
		        ht.put("Foot -> Foot",  1d);
		        ht.put("Foot -> Inch", 11.999952756091513);
		        ht.put("Foot -> Kilometer", 0.00030480000000000004);
		        ht.put("Foot -> Meter", 0.3048);
		        ht.put("Foot -> Mile", 0.00018939323329294436);
		        ht.put("Foot -> Micrometer", 304800.00000000006);
		        ht.put("Foot -> Yard", 0.33333333333333337);
		        ht.put("Foot -> Milimeter", 304.8);
			
		        ht.put("Inch -> Foot",  0.08333366141732282);
		        ht.put("Inch -> Inch", 1d);
		        ht.put("Inch -> Kilometer", 0.000025400099999999998);
		        ht.put("Inch -> Meter", 0.0254001);
		        ht.put("Inch -> Mile", 0.00001578283157796626);
		        ht.put("Inch -> Micrometer", 25400.1);
		        ht.put("Inch -> Yard", 0.02777788713910761);
		        ht.put("Inch -> Milimeter", 25.4001);
		        
		        ht.put("Kilometer -> Foot", 3280.839895013123);
		        ht.put("Kilometer -> Inch", 39369.923740457714);
		        ht.put("Kilometer -> Kilometer", 1d);
		        ht.put("Kilometer -> Meter",1000d);
		        ht.put("Kilometer -> Mile", 0.6213688756330196);
		        ht.put("Kilometer -> Micrometer", 1000000000d);
		        ht.put("Kilometer -> Yard", 1093.6132983377079);
		        ht.put("Kilometer -> Milimeter", 1000000d);
		        
		        ht.put("Meter -> Foot", 3.280839895013123);
		        ht.put("Meter -> Inch", 39.369923740457715);
		        ht.put("Meter -> Kilometer", 0.001);
		        ht.put("Meter -> Meter",1d);
		        ht.put("Meter -> Mile",0.0006213688756330196);
		        ht.put("Meter -> Micrometer",1000000d);
		        ht.put("Meter -> Yard",1.0936132983377078);
		        ht.put("Meter -> Milimeter",1000d);
		        
		        ht.put("Mile -> Foot", 5280.0196850393695);
		        ht.put("Mile -> Inch", 63359.986771705626);
		        ht.put("Mile -> Kilometer", 1.6093499999999998);
		        ht.put("Mile -> Meter",1609.35);
		        ht.put("Mile -> Mile",1d);
		        ht.put("Mile -> Micrometer",1609350000d);
		        ht.put("Mile -> Yard",1760.00656167979);
		        ht.put("Mile -> Milimeter",1609349.9999999998);
		        
		        ht.put("Micrometer -> Foot", 0.000003280839895013123);
		        ht.put("Micrometer -> Inch", 0.00003936992374045772);
		        ht.put("Micrometer -> Kilometer", 9.999999999999999e-10);
		        ht.put("Micrometer -> Meter",0.000001);
		        ht.put("Micrometer -> Mile",6.213688756330196e-10);
		        ht.put("Micrometer -> Micrometer",1d);
		        ht.put("Micrometer -> Yard",0.0000010936132983377078);
		        ht.put("Micrometer -> Milimeter",0.001);
		        
		        ht.put("Yard -> Foot", 3d);
		        ht.put("Yard -> Inch", 35.99985826827454);
		        ht.put("Yard -> Kilometer", 0.0009144);
		        ht.put("Yard -> Meter",0.9144);
		        ht.put("Yard -> Mile",0.0005681796998788331);
		        ht.put("Yard -> Micrometer",914400d);
		        ht.put("Yard -> Yard",1d);
		        ht.put("Yard -> Milimeter",914.4);
		        
		        ht.put("Milimeter -> Foot", 0.0032808398950131233);
		        ht.put("Milimeter -> Inch", 0.03936992374045772);
		        ht.put("Milimeter -> Kilometer", 0.000001);
		        ht.put("Milimeter -> Meter",0.001);
		        ht.put("Milimeter -> Mile",6.213688756330195e-7);
		        ht.put("Milimeter -> Micrometer",1000.0000000000001);
		        ht.put("Milimeter -> Yard",0.0010936132983377078);
		        ht.put("Milimeter -> Milimeter",1d);
		        
		         double  multiplier = ht.get(key);
		         double answer = Num1 * multiplier;
		         String enum2 = Double.toString(answer);
		         edit2.setText(enum2);
					
			}
		});     
		
		
	}

}
