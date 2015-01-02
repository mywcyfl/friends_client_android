package com.friends.android.activity;

import android.content.Intent;
import android.os.Bundle;

import com.friends.android.FriendsActivity;
import com.friends.android.R;

/**
 * ��������ҳ
 * 
 * @author wangxinwen
 * 
 */
public class StartActivity extends FriendsActivity implements Runnable {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_activity);
		// ����һ���߳�
		new Thread(this).start();
	}

	public void run() {
		try {
			// 1�����ת����¼����
			Thread.sleep(1500);
			startActivity(new Intent(StartActivity.this, LoginActivity.class));
			finish();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}