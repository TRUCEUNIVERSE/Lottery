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
	
	public void say3(){
		System.out.println("hahadaixao");
	}

	public void say4(){
		System.out.println("hahadaxiao");
	}
	
	public void sayworkspace2(){
		System.out.println("i am workspace2");
	}
	
	public void createANewBranch(){
		System.out.println("1 create a new Branch");
	}
}
