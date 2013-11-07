package com.tdl.broadcastalarm;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;

public class Recieve extends BroadcastReceiver {


	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Vibrator v =(Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
		v.vibrate(2000);
	}
}
