package com.tdl.activity_media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
	VideoView vd;
	MediaPlayer m;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
public void audio(View v){
	m= MediaPlayer.create(getApplicationContext(),R.raw.tone);
	m.start();
}
public void video(View v){
	vd=(VideoView) findViewById(R.id.videoView1);
	String path = "android.resource://"+getPackageName()+"/"+R.raw.video;
	vd.setVideoURI(Uri.parse(path));
	vd.setMediaController(new MediaController(this));
	vd.requestFocus();
	vd.start();
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
