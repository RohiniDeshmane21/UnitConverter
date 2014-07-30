package com.example.unitconverter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Area extends MainActivity{

	private Spinner spinner1,spinner2;
	String select, select2;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_area);
		
		//spinner elements
		spinner1 = (Spinner)findViewById(R.id.spinner1);
		spinner2 = (Spinner)findViewById(R.id.spinner2);
		
		
		// Spinner click listener
        //spinner1.setOnItemSelectedListener((OnItemSelectedListener) this);
        //spinner2.setOnItemSelectedListener((OnItemSelectedListener) this);
        
        //Spinner Drop down elements 
         final List<String> list1 = new ArrayList<String>();
         final List<String> list2 = new ArrayList<String>();
        
        list1.add("Square Kilometer");
        list1.add("Square Meter");
        list1.add("Square Centimeter");
        list1.add("Square Mile");
        list1.add("Square Foot");
        list1.add("Square Milimeter");
        list1.add("Acre");
                
        list2.add("Square Kilometer");
        list2.add("Square Meter");
        list2.add("Square Centimeter");
        list2.add("Square Mile");
        list2.add("Square Foot");
        list2.add("Square Milimeter");
        list2.add("Acre");
        
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
        
        		
		final Button BtnCal = (Button)findViewById(R.id.btnCArea);
		
		BtnCal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final EditText edit1 = (EditText)findViewById(R.id.edit1);
				final String enum1 = edit1.getText().toString();
				final double Num1 = Double.parseDouble(enum1);
				//final EditText edit2 = (EditText)findViewById(R.id.edit2);
				final TextView edit2 = (TextView)findViewById(R.id.edit2);
				
				String key = select + " -> " + select2;
		        Hashtable<String, Double> ht = new Hashtable<String, Double>(100);
		        
		        ht.put("Square Kilometer -> Square Kilometer",  1d);
		        ht.put("Square Kilometer -> Square Meter", 1000000d);
		        ht.put("Square Kilometer -> Square Centimeter", 10000000000d);
		        ht.put("Square Kilometer -> Square Mile", 0.3861018768412233);
		        ht.put("Square Kilometer -> Square Foot", 10763915.051182415);
		        ht.put("Square Kilometer -> Square Milimeter", 1000000000000d);
		        ht.put("Square Kilometer -> Acre", 247.10516301527602);
		        
		        ht.put("Square Meter -> Square Kilometer",  0.000001);
		        ht.put("Square Meter -> Square Meter", 1d);
		        ht.put("Square Meter -> Square Centimeter", 10000d);
		        ht.put("Square Meter -> Square Mile", 3.8610187684122333e-7);
		        ht.put("Square Meter -> Square Foot", 10.763915051182416);
		        ht.put("Square Meter -> Square Milimeter", 1000000d);
		        ht.put("Square Meter -> Acre", 0.00024710516301527604);
		        
		        ht.put("Square Centimeter -> Square Kilometer", 1e-10);
		        ht.put("Square Centimeter -> Square Meter", 0.0001);
		        ht.put("Square Centimeter -> Square Centimeter", 1d);
		        ht.put("Square Centimeter -> Square Mile", 3.861018768412234e-11);
		        ht.put("Square Centimeter -> Square Foot", 0.0010763915051182416);
		        ht.put("Square Centimeter -> Square Milimeter", 100.00000000000001);
		        ht.put("Square Centimeter -> Acre", 2.4710516301527606e-8);
		        
		        ht.put("Square Mile -> Square Kilometer", 2.58999);
		        ht.put("Square Mile -> Square Meter", 2589990d);
		        ht.put("Square Mile -> Square Centimeter", 25899900000d);
		        ht.put("Square Mile -> Square Mile", 1d);
		        ht.put("Square Mile -> Square Foot", 27878432.343411945);
		        ht.put("Square Mile -> Square Milimeter", 2589990000000d);
		        ht.put("Square Mile -> Acre", 639.9999011579348);
		        
		        ht.put("Square Foot -> Square Kilometer", 9.2903e-8);
		        ht.put("Square Foot -> Square Meter", 0.092903);
		        ht.put("Square Foot -> Square Centimeter", 929.03);
		        ht.put("Square Foot -> Square Mile", 3.587002266418017e-8);
		        ht.put("Square Foot -> Square Foot", 1d);
		        ht.put("Square Foot -> Square Milimeter", 92903d);
		        ht.put("Square Foot -> Acre", 0.00002295681095960819);
		        
		        ht.put("Square Milimeter -> Square Kilometer", 1e-12);
		        ht.put("Square Milimeter -> Square Meter", 0.000001);
		        ht.put("Square Milimeter -> Square Centimeter", 0.009999999999999998);
		        ht.put("Square Milimeter -> Square Mile", 3.8610187684122333e-13);
		        ht.put("Square Milimeter -> Square Foot", 0.000010763915051182416);
		        ht.put("Square Milimeter -> Square Milimeter", 1d);
		        ht.put("Square Milimeter -> Acre", 2.4710516301527603e-10);
		        
		        ht.put("Acre -> Square Kilometer", 0.00404686);
		        ht.put("Acre -> Square Meter", 4046.86);
		        ht.put("Acre -> Square Centimeter", 40468600d);
		        ht.put("Acre -> Square Mile", 0.0015625002413136731);
		        ht.put("Acre -> Square Foot", 43560.05726402807);
		        ht.put("Acre -> Square Milimeter", 4046860000.0000005);
		        ht.put("Acre -> Acre", 1d);
		        
		         double  multiplier = ht.get(key);
		         double answer = Num1 * multiplier;
		         String enum2 = Double.toString(answer);
		         edit2.setText(enum2);
				
			}	
		});    
	}

}

