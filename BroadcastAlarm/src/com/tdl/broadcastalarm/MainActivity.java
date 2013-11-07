package com.tdl.broadcastalarm;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void alarm(View v){
	
		EditText t = (EditText) findViewById(R.id.editText1);
		Button b = (Button) findViewById(R.id.button1);
		
		int i = Integer.parseInt(t.getText().toString());
		
		Intent intent = new Intent(this,Recieve.class);
		PendingIntent pi = PendingIntent.getBroadcast(this, 0, intent, 0);
		
		AlarmManager am = (AlarmManager) getSystemService(ALARM_SERVICE);
		am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(i*1000), pi);
		Toast.makeText(this, "Alarm in" + i +"Seconds", Toast.LENGTH_SHORT).show();
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
