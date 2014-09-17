package com.seenu.pnrstatus;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class MainActivity extends ActionBarActivity {

	// Edittext for PNR number
	private EditText pnrEt;

	// pnr number
	private String pnrNumber;

	// TAG : class name
	private String TAG = getClass().getSimpleName();

	// Pnr status api url
	private String url = "http://pnrdekho.com/api_getPnrStatus.php?pnr=";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pnrEt = (EditText) findViewById(R.id.editText1);

		pnrEt.setOnEditorActionListener(new OnEditorActionListener() {

			@Override
			public boolean onEditorAction(TextView v, int actionId,
					KeyEvent event) {
				// TODO Auto-generated method stub
				if (actionId == EditorInfo.IME_ACTION_GO) {

					pnrNumber = pnrEt.getText().toString().trim();
					url = url + pnrNumber;
					Log.i(TAG, url);
				}
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
