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

public class Volume extends MainActivity {

	private Spinner spinner1,spinner2;
	String select, select2;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_volume);
		
		//spinner elements
		spinner1 = (Spinner)findViewById(R.id.spinner1);
		spinner2 = (Spinner)findViewById(R.id.spinner2);
		
		
        //Spinner Drop down elements 
         final List<String> list1 = new ArrayList<String>();
         final List<String> list2 = new ArrayList<String>();
        
        list1.add("Cubic Meter");
        list1.add("Cubic Foot");
        list1.add("Cubic Yard");
        list1.add("Cubic Inch");
        list1.add("Cubic Kilometer");
        list1.add("Cubic Mile");
        list1.add("Cubic Centimeter");
        list1.add("Cubic Millimeter");
        list1.add("Liter");
        list1.add("Milliliter");
                
        list2.add("Cubic Meter");
        list2.add("Cubic Foot");
        list2.add("Cubic Yard");
        list2.add("Cubic Inch");
        list2.add("Cubic Kilometer");
        list2.add("Cubic Mile");
        list2.add("Cubic Centimeter");
        list2.add("Cubic Millimeter");
        list2.add("Liter");
        list2.add("Milliliter");
        
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
       
        final Button BtnCal = (Button)findViewById(R.id.btnCVolume);
		
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
		        ht.put("Cubic Meter -> Cubic Meter",  1d);
		        ht.put("Cubic Meter -> Cubic Foot", 35.31472482766414);
		        ht.put("Cubic Meter -> Cubic Yard", 1.307950376362721);
		        ht.put("Cubic Meter -> Cubic Inch", 61023.61003472243);
		        ht.put("Cubic Meter -> Cubic Kilometer", 1e-9);
		        ht.put("Cubic Meter -> Cubic Mile", 2.399128636479231e-10);
		        ht.put("Cubic Meter -> Cubic Centimeter", 1000000d);
		        ht.put("Cubic Meter -> Cubic Millimeter", 999999999.9999999d);
		        ht.put("Cubic Meter -> Liter", 1000d);
		        ht.put("Cubic Meter -> Milliliter", 1000000d);
		        
		        ht.put("Cubic Foot -> Cubic Meter",  0.0283168);
		        ht.put("Cubic Foot -> Cubic Foot", 1d);
		        ht.put("Cubic Foot -> Cubic Yard", 0.037036969217387895);
		        ht.put("Cubic Foot -> Cubic Inch", 1727.9933606312281);
		        ht.put("Cubic Foot -> Cubic Kilometer", 2.83168e-11);
		        ht.put("Cubic Foot -> Cubic Mile", 6.793564577345508e-12);
		        ht.put("Cubic Foot -> Cubic Centimeter", 28316.8);
		        ht.put("Cubic Foot -> Cubic Millimeter", 28316799.999999996);
		        ht.put("Cubic Foot -> Liter", 28.3168);
		        ht.put("Cubic Foot -> Milliliter", 28316.8);
		        
		        ht.put("Cubic Yard -> Cubic Meter",  0.764555);
		        ht.put("Cubic Yard -> Cubic Foot", 27.00004944061476);
		        ht.put("Cubic Yard -> Cubic Yard", 1d);
		        ht.put("Cubic Yard -> Cubic Inch", 46655.90617009721);
		        ht.put("Cubic Yard -> Cubic Kilometer", 7.64555e-10);
		        ht.put("Cubic Yard -> Cubic Mile", 1.8342657946633783e-10);
		        ht.put("Cubic Yard -> Cubic Centimeter", 764555d);
		        ht.put("Cubic Yard -> Cubic Millimeter", 764554999.9999999);
		        ht.put("Cubic Yard -> Liter", 764.555);
		        ht.put("Cubic Yard -> Milliliter", 764555d);
		       
		        ht.put("Cubic Inch -> Cubic Meter",  0.0000163871);
		        ht.put("Cubic Inch -> Cubic Foot", 0.0005787059272234151);
		        ht.put("Cubic Inch -> Cubic Yard", 0.000021433513612493545);
		        ht.put("Cubic Inch -> Cubic Inch", 1d);
		        ht.put("Cubic Inch -> Cubic Kilometer", 1.63871e-14);
		        ht.put("Cubic Inch -> Cubic Mile", 3.9314760878848806e-15);
		        ht.put("Cubic Inch -> Cubic Centimeter", 16.3871);
		        ht.put("Cubic Inch -> Cubic Millimeter", 16387.1);
		        ht.put("Cubic Inch -> Liter", 0.0163871);
		        ht.put("Cubic Inch -> Milliliter", 16.3871);
		       
		        ht.put("Cubic Kilometer -> Cubic Meter",  1000000000d);
		        ht.put("Cubic Kilometer -> Cubic Foot", 35314724827.66415);
		        ht.put("Cubic Kilometer -> Cubic Yard", 1307950376.3627207);
		        ht.put("Cubic Kilometer -> Cubic Inch", 61023610034722.43);
		        ht.put("Cubic Kilometer -> Cubic Kilometer", 1d);
		        ht.put("Cubic Kilometer -> Cubic Mile", 0.23991286364792308);
		        ht.put("Cubic Kilometer -> Cubic Centimeter", 1000000000000000d);
		        ht.put("Cubic Kilometer -> Cubic Millimeter", 1000000000000000000d);
		        ht.put("Cubic Kilometer -> Liter", 1000000000000d);
		        ht.put("Cubic Kilometer -> Milliliter", 1000000000000000d);
		       
		        ht.put("Cubic Mile -> Cubic Meter",  4168180000d);
		        ht.put("Cubic Mile -> Cubic Foot", 147198129732.17313);
		        ht.put("Cubic Mile -> Cubic Yard", 5451772599.747565);
		        ht.put("Cubic Mile -> Cubic Inch", 254357390874529.34);
		        ht.put("Cubic Mile -> Cubic Kilometer", 4.16818);
		        ht.put("Cubic Mile -> Cubic Mile", 1d);
		        ht.put("Cubic Mile -> Cubic Centimeter", 4168180000000000d);
		        ht.put("Cubic Mile -> Cubic Millimeter", 4168179999999999500d);
		        ht.put("Cubic Mile -> Liter", 4168180000000d);
		        ht.put("Cubic Mile -> Milliliter", 4168180000000000d);
		        
		        ht.put("Cubic Centimeter -> Cubic Meter",  0.000001);
		        ht.put("Cubic Centimeter -> Cubic Foot", 0.000035314724827664145);
		        ht.put("Cubic Centimeter -> Cubic Yard", 0.0000013079503763627207);
		        ht.put("Cubic Centimeter -> Cubic Inch", 0.061023610034722425);
		        ht.put("Cubic Centimeter -> Cubic Kilometer", 9.999999999999999e-16);
		        ht.put("Cubic Centimeter -> Cubic Mile", 2.3991286364792304e-16);
		        ht.put("Cubic Centimeter -> Cubic Centimeter", 1d);
		        ht.put("Cubic Centimeter -> Cubic Millimeter", 999.9999999999999);
		        ht.put("Cubic Centimeter -> Liter", 0.001);
		        ht.put("Cubic Centimeter -> Milliliter", 1d);
		       
		        ht.put("Cubic Millimeter -> Cubic Meter",  1e-9);
		        ht.put("Cubic Millimeter -> Cubic Foot", 3.531472482766414e-8);
		        ht.put("Cubic Millimeter -> Cubic Yard", 1.3079503763627208e-9);
		        ht.put("Cubic Millimeter -> Cubic Inch", 0.00006102361003472243);
		        ht.put("Cubic Millimeter -> Cubic Kilometer", 1e-18);
		        ht.put("Cubic Millimeter -> Cubic Mile", 2.399128636479231e-19);
		        ht.put("Cubic Millimeter -> Cubic Centimeter", 0.001);
		        ht.put("Cubic Millimeter -> Cubic Millimeter", 1d);
		        ht.put("Cubic Millimeter -> Liter", 0.000001);
		        ht.put("Cubic Millimeter -> Milliliter", 0.001);
		       
		        ht.put("Liter -> Cubic Meter",  0.001);
		        ht.put("Liter -> Cubic Foot", 0.035314724827664144);
		        ht.put("Liter -> Cubic Yard", 0.001307950376362721);
		        ht.put("Liter -> Cubic Inch", 61.02361003472243);
		        ht.put("Liter -> Cubic Kilometer", 1e-12);
		        ht.put("Liter -> Cubic Mile", 2.399128636479231e-13);
		        ht.put("Liter -> Cubic Centimeter", 1000.0000000000001);
		        ht.put("Liter -> Cubic Millimeter", 1000000d);
		        ht.put("Liter -> Liter", 1d);
		        ht.put("Liter -> Milliliter", 1000.0000000000001);
		        
		        ht.put("Milliliter -> Cubic Meter",  0.000001);
		        ht.put("Milliliter -> Cubic Foot", 0.000035314724827664145);
		        ht.put("Milliliter -> Cubic Yard", 0.0000013079503763627207);
		        ht.put("Milliliter -> Cubic Inch", 0.061023610034722425);
		        ht.put("Milliliter -> Cubic Kilometer", 9.999999999999999e-16);
		        ht.put("Milliliter -> Cubic Mile", 2.3991286364792304e-16);
		        ht.put("Milliliter -> Cubic Centimeter", 1d);
		        ht.put("Milliliter -> Cubic Millimeter", 999.9999999999999d);
		        ht.put("Milliliter -> Liter", 0.001);
		        ht.put("Milliliter -> Milliliter", 1d);
		       
		          double  multiplier = ht.get(key);
		         double answer = Num1 * multiplier;
		         String enum2 = Double.toString(answer);
		         edit2.setText(enum2);
			
			}
		});
        
	}
}

