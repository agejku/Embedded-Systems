package com.app.PositionSensorActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.app.PositionSensorActivity.R;
public class PositionSensorActivity extends Activity implements OnClickListener {
	// private SimulationView mSimulationView;
	private SensorManager mSensorManager;
	private PowerManager mPowerManager;
	private WindowManager mWindowManager;
	private Display mDisplay;
	private Button start;
	private Button stop;
	private Button refresh;
    private WakeLock mWakeLock;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		 // Get an instance of the SensorManager
    //   mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        // Get an instance of the PowerManager
    //    mPowerManager = (PowerManager) getSystemService(POWER_SERVICE);

        // Get an instance of the WindowManager
      //  mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
     //   mDisplay = mWindowManager.getDefaultDisplay();

        // Create a bright wake lock
      //   mWakeLock = mPowerManager.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, getClass()
       //         .getName());


		//start = (Button) findViewById(R.id.button_start);
		//start.setOnClickListener(this);

		//stop = (Button) findViewById(R.id.button_stop);
		//stop.setOnClickListener(this);

		//refresh = (Button) findViewById(R.id.button_refresh);
		//refresh.setOnClickListener(this);

	}
	 @Override
	    protected void onResume() {
	        super.onResume();
	        /*
	         * when the activity is resumed, we acquire a wake-lock so that the
	         * screen stays on, since the user will likely not be fiddling with the
	         * screen or buttons.
	         */
	      //  mWakeLock.acquire();

	    }
	 @Override
	    protected void onPause() {
	        super.onPause();
	        /*
	         * When the activity is paused, we make sure to stop the simulation,
	         * release our sensor resources and wake locks
	         */

	      
	    }
	@Override
	public void onClick(View arg0) {
		// EditText nameField = (EditText) findViewById(R.id.editText1);
		 
	      //  String name = nameField.getText().toString();
	 
	     //   if (name.length() == 0) {
	     //       new AlertDialog.Builder(this).setMessage(
	     //               R.string.unknownName).setNeutralButton(
	     //               R.string.ok,
	     //               null).show();
	     //       return;
	        }

	     //   if (v == hiButton || v == helloButton) {
	     //       int resourceId = v == hiButton ? R.string.hi_greeting
	      //              : R.string.hello_greeting;

	      //      String greeting = getResources().getString(resourceId, name);
	      //      Toast.makeText(this, greeting, Toast.LENGTH_LONG).show();

	      //      TextView greetingField = (TextView) findViewById(R.id.greeting_field);
	      //      greetingField.setText(greeting);
	        //}
	
}
