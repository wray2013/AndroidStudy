package com.example.httpstest;

import com.example.R;
import com.example.TestApplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Spinner s = (Spinner) findViewById(R.id.protocol_spinner);
		ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.protocols, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//		s.setSelection(getProtocolPos(apopinfo.protocol), true);
		s.setAdapter(adapter);
		s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapterview, View v,
					int position, long id) {
//				Spinner spinner = (Spinner) adapterview;
				String itemContent = (String) adapterview.getItemAtPosition(position);
				Toast.makeText(TestApplication.getInstance(), itemContent + " protocol selected!", Toast.LENGTH_LONG).show();
				//TODO:apopinfo.protocol = itemContent;
			}

			@Override
			public void onNothingSelected(AdapterView<?> view) {
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
