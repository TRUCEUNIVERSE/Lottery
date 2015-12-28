package com.itheima.lottery;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void say(){
		System.out.println("---------");
	}
	
	public void say2(){
		System.out.println("aaaa");
	}
	
	public void say4(){
		System.out.println("hahadaxiao");
	}
}
