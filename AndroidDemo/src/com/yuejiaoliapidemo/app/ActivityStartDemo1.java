package com.yuejiaoliapidemo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityStartDemo1 extends Activity {
	private int requestCode = 100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = new Intent(ActivityStartDemo1.this,
				ActivityStartDemo2.class);
		startActivityForResult(intent, requestCode);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == this.requestCode) {
			
		}
	}
}
