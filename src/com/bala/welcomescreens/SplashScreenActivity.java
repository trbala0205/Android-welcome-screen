package com.bala.welcomescreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        //thread for splash screen running
        Thread screenDisplayTimer = new Thread(){
        	public void run(){
        		try {
					sleep(2000);
				} catch (InterruptedException e) {
				}finally{
					startActivity(new Intent(SplashScreenActivity.this, IntroScreenActivity.class));
					overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
				}
        		finish();
        	}
        };
        screenDisplayTimer.start();
	}
}
