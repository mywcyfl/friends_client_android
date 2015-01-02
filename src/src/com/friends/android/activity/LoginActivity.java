package com.friends.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.friends.android.FriendsActivity;
import com.friends.android.R;


/**
 * ��¼����
 * 
 * @author wangxinwen
 * 
 */
public class LoginActivity extends FriendsActivity {
	/**
	 * ��¼��ť
	 */
	private Button mLogin;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		findViewById();
		setListener();
	}

	/**
	 * �󶨽���UI
	 */
	private void findViewById() {
		mLogin = (Button) findViewById(R.id.login_activity_login);
	}

	/**
	 * UI�¼�����
	 */
	private void setListener() {
		// ��¼��ť����
		mLogin.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// ��ת����������ҳ
				startActivity(new Intent(LoginActivity.this,
						GuideActivity.class));
				finish();
			}
		});
	}

	public void onBackPressed() {
		finish();
		android.os.Process.killProcess(android.os.Process.myPid());
		System.exit(0);
	}
}
