package com.guru.accessibilityproject;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {
	
	private String TAG = "testAccessibility";

	@Override
	protected void onServiceConnected() {
		super.onServiceConnected();
		Log.i(TAG,"MyAccessibilityService connect");
	}
	
	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		int eventType =  event.getEventType();
		Log.i(TAG,"event type = "+ eventType);
		switch(eventType){
		case AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED:
			Log.i(TAG,"event className = "+ event.getClassName().toString());
			break;
		case AccessibilityEvent.TYPES_ALL_MASK:
			
			break;
		}
	}

	@Override
	public void onInterrupt() {
		Log.i(TAG,"accessibility service disconnect!");
	}

}
