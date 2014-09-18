package com.seenu.pnrstatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.Request.Method;
import com.android.volley.toolbox.JsonObjectRequest;
import com.seenu.pnrstatus.files.VolleyFunctions;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
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

	// myMerchantsAsync mTask;
	private JsonObjectRequest jsonObjReq;

	private VolleyFunctions volFun;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pnrEt = (EditText) findViewById(R.id.editText1);

		volFun = new VolleyFunctions(MainActivity.this);

		pnrEt.setOnEditorActionListener(new OnEditorActionListener() {

			@Override
			public boolean onEditorAction(TextView v, int actionId,
					KeyEvent event) {
				// TODO Auto-generated method stub
				if (actionId == EditorInfo.IME_ACTION_GO) {

					pnrNumber = pnrEt.getText().toString().trim();
					url = url + pnrNumber;
					Log.i(TAG, url);

					requestFromServer();
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

	private void requestFromServer() {
		// TODO Auto-generated method stub

		jsonObjReq = new JsonObjectRequest(Method.GET, url, null,
				new Response.Listener<JSONObject>() {

					@Override
					public void onResponse(JSONObject response) {
						Log.d("Response", response.toString());

						String result = response.toString();

					}
				}, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {

						NetworkResponse response = error.networkResponse;

						if (response != null) {

						} else {

						}
					}
				}) {

			/**
			 * Passing some request headers
			 * */
			@Override
			public Map<String, String> getHeaders() throws AuthFailureError {
				HashMap<String, String> headers = new HashMap<String, String>();
				headers.put("Content-Type", "application/json");
				return headers;
			}
		};

		// Adding request to request queue
		volFun.addToRequestQueue(jsonObjReq);
	}

}
