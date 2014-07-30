package com.example.unitconverter;

import java.util.ArrayList;
import java.util.Hashtable;
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

public class Weight extends MainActivity{

	private Spinner spinner1,spinner2;
	String select, select2;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_weight);

		//spinner elements
				spinner1 = (Spinner)findViewById(R.id.spinner1);
				spinner2 = (Spinner)findViewById(R.id.spinner2);
				
				    //Spinner Drop down elements 
		         final List<String> list1 = new ArrayList<String>();
		         final List<String> list2 = new ArrayList<String>();
		       
		        list1.add("Kilogram");
		        list1.add("Gram");
		        list1.add("Miligram");
		        list1.add("Ton");
		        list1.add("Pound");
		        list1.add("Ounce");
		        list1.add("Carret");
		        		                
		        list2.add("Kilogram");
		        list2.add("Gram");
		        list2.add("Miligram");
		        list2.add("Ton");
		        list2.add("Pound");
		        list2.add("Ounce");
		        list2.add("Carret");
		       
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
		final Button BtnCal = (Button)findViewById(R.id.btnCWeight);
		
		BtnCal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final EditText edit1 = (EditText)findViewById(R.id.edit1);
				final String enum1 = edit1.getText().toString();
				final double Num1 = Double.parseDouble(enum1);
				
				String key = select + " -> " + select2;
		        Hashtable<String, Double> ht = new Hashtable<String, Double>(100);
		        
		        ht.put("Kilogram -> Kilogram",  1d);
		        ht.put("Kilogram -> Gram", 1000d);
		        ht.put("Kilogram -> Miligram", 1000000d);
		        ht.put("Kilogram -> Ton", 0.001);
		        ht.put("Kilogram -> Pound", 2.2046244201837775);
		        ht.put("Kilogram -> Ounce", 35.27399072294044);
		        ht.put("Kilogram -> Carret", 5000d);
		        
		        ht.put("Gram -> Kilogram",  0.001);
		        ht.put("Gram -> Gram", 1d);
		        ht.put("Gram -> Miligram", 1000.0000000000001);
		        ht.put("Gram -> Ton", 0.000001);
		        ht.put("Gram -> Pound", 0.0022046244201837776);
		        ht.put("Gram -> Ounce", 0.03527399072294044);
		        ht.put("Gram -> Carret", 5d);
		        
		        ht.put("Miligram -> Kilogram",  0.000001);
		        ht.put("Miligram -> Gram", 0.001);
		        ht.put("Miligram -> Miligram", 1d);
		        ht.put("Miligram -> Ton", 9.999999999999999e-10);
		        ht.put("Miligram -> Pound", 0.0000022046244201837775);
		        ht.put("Miligram -> Ounce", 0.00003527399072294044);
		        ht.put("Miligram -> Carret", 0.004999999999999999);
		        
		        ht.put("Ton -> Kilogram", 1000d);
		        ht.put("Ton -> Gram", 1000000d);
		        ht.put("Ton -> Miligram", 1000000000d);
		        ht.put("Ton -> Ton", 1d);
		        ht.put("Ton -> Pound", 2204.6244201837776);
		        ht.put("Ton -> Ounce", 35273.99072294044);
		        ht.put("Ton -> Carret", 5000000d);
		        
		        ht.put("Pound -> Kilogram", 0.453592);
		        ht.put("Pound -> Gram", 453.592);
		        ht.put("Pound -> Miligram", 453592d);
		        ht.put("Pound -> Ton", 0.000453592);
		        ht.put("Pound -> Pound", 1d);
		        ht.put("Pound -> Ounce", 16d);
		        ht.put("Pound -> Carret", 2267.96);
		        
		        ht.put("Ounce -> Kilogram", 0.0283495);
		        ht.put("Ounce -> Gram", 28.3495);
		        ht.put("Ounce -> Miligram", 28349.5);
		        ht.put("Ounce -> Ton", 0.0000283495);
		        ht.put("Ounce -> Pound", 0.0625);
		        ht.put("Ounce -> Ounce", 1d);
		        ht.put("Ounce -> Carret", 141.7475);
		        
		        ht.put("Carret -> Kilogram", 0.0002);
		        ht.put("Carret -> Gram", 0.2);
		        ht.put("Carret -> Miligram", 200.00000000000003);
		        ht.put("Carret -> Ton", 2.0000000000000002e-7);
		        ht.put("Carret -> Pound", 0.0004409248840367555);
		        ht.put("Carret -> Ounce", 0.007054798144588088);
		        ht.put("Carret -> Carret", 1d);
		        
		         double  multiplier = ht.get(key);
		         double answer = Num1 * multiplier;
		         String enum2 = Double.toString(answer);
		         edit2.setText(enum2);
				
			}
		});    
	}
}
