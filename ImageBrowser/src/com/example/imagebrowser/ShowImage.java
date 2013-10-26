package com.example.imagebrowser;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/* ShowImage.java
 * A new activity that accepts, via the Intent bundle,
 * an ID representing the image to display full-screen
 * to the user.
 */
public class ShowImage extends Activity implements OnClickListener {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.single_image);

        // find our ImageView in the layout
        ImageView img = (ImageView)findViewById(R.id.single_image);

        // retrieve the set of data passed to us by the Intent
        Bundle extras = getIntent().getExtras();

        // and retrieve the imageToDisplay ID from the extras bundle
        int resource = (int)extras.getLong("imageToDisplay");

        // set the ImageView to display the specified resource ID
        img.setImageResource(resource);

        // close the Activity when a user taps/clicks on the image.
        img.setOnClickListener(this);
        
        //set text for image in /res/string
        
        TextView text = (TextView) findViewById(R.id.text_description);
        text.setText("Cloud computing, or something being in the cloud, is an expression used to describe a variety of different types of computing concepts that involve a large number of computers connected through a real-time communication network such as the Internet.[1] In science, cloud computing is a synonym for distributed computing over a network and means the ability to run a program on many connected computers at the same time. The phrase is also more commonly used to refer to network-based services which appear to be provided by real server hardware, which in fact are served up by virtual hardware, simulated by software running on one or more real machines. Such virtual servers do not physically exist and can therefore be moved around and scaled up (or down) on the fly without affecting the end user—arguably, rather like a cloud.");
        text.invalidate();
	}
	
	/*
	 * finishes (closes) the activity when the user clicks on the image
	 */
	public void onClick(View v) {
		finish();
	}
}
