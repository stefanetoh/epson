package com.example.epson;

import java.io.IOException;

import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.ArchitectView.ArchitectConfig;
import com.wikitude.architect.ArchitectView.ArchitectUrlListener;
import com.wikitude.architect.ArchitectView.SensorAccuracyChangeListener;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	protected ArchitectView architectView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.architectView = (ArchitectView)this.findViewById( R.id.architectView );
		final ArchitectConfig config = new ArchitectConfig( "yChFBBC+qXaAbG7Ar+SNDup1AQZ4l8nyt4Jizrvf/7CGKlzYanm3S5jwkH73qIjUKqxyN8tNOLiTtXwhdVY7TzFerohjccWKRJ0z4OHFmBqhxCFvqw6r4lxm0FrNtM/NuqvNch1Jz7L2Ic0OId+x0zl1Mh/Dm0k+UI8G/xIlBNpTYWx0ZWRfX/drR3T/zDcSz0EEQXaSu9eIu9ywDGBKplMddEjcB8HjW1jzh4DaOUdFEmY1ghhgU9K7EAHyTYadMagmWjMv/TWWhWJ8oDO9zWFwRYQKdYeGPhPE1TfLNbBEN9foEI8E51sKE3/7cq04isLnSxEGWntyotOXkQpEq62/TCLzKHJY8vm9aAdhBf+nTWbb45nWxJuBTMmX0M4nJIs9Rc6Li46yucwludMhmEq5N/bAWBytpmUBEFzNAJdCrnoLSlwkmeZXlGfF2TGRF4d77/osI5hTcKBi6JCbpIynbLz8NxRcYUkiLiGmCNc4gfpKKOp19Dn/ZBNmxW2Ov8tAILiYfL6SDRZzDsZ1oMtC1zfS/waDenEQmmvEArVjfhrn2OhD5f0aDfDz477oy7GhOvbccONS7HgDWzomcmRqqtkj9Q9Zy/VDoxsw4kuFT8BV3MlbVK23csqHSsHmIbKr/AUC+qXO2Pz/x4SMcQ==" /* license key */ );
		this.architectView.onCreate( config );
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState){
		super.onPostCreate( savedInstanceState );
		this.architectView.onPostCreate();
		try {
			this.architectView.load( "index.html" );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		// call mandatory live-cycle method of architectView
		if ( this.architectView != null ) {
			this.architectView.onDestroy();
		}
	}
}

