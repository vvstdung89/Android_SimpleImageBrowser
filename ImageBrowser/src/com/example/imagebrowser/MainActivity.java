package com.example.imagebrowser;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long id) {
		// create the Intent to open our ShowImage activity.
    	Intent i = new Intent(this, ShowImage.class);
   
    	// pass a key:value pair into the 'extra' bundle for
    	// the intent so the activity is made aware which
    	// photo was selected.
    	i.putExtra("imageToDisplay", id);

    	// start our activity
    	startActivity(i);
		
	}

}
