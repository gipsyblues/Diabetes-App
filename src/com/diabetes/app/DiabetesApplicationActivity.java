package com.diabetes.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.diabetes.app.R;

public class DiabetesApplicationActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView itemList = (ListView) findViewById(R.id.itemList);
        final String[] itemValues = new String[] { "Enter injection data", "How do you feel?", "View and print data", "Vial monitor", "Settings", "blah", "blah", "blah", "blah", "blah" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemValues);
        itemList.setAdapter(adapter);
        
        itemList.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
				String s = itemValues[position];
				
				if (s.equals("Enter injection data")) {
					Intent dataEntryForm = new Intent(v.getContext(), DataEntryForm.class);
					startActivity(dataEntryForm);
				}
				
				else if (s.equals("How do you feel?")) {
					Intent feelingRate = new Intent(v.getContext(), FeelingRater.class);
					startActivity(feelingRate);
				}
				
				else if (s.equals("View and export data")) {
					
				}
				
				else if (s.equals("Vial monitor")) {
					
				}
				
				else if (s.equals("Settings")) {
					
				}
				
			}
        });
    }
   
}