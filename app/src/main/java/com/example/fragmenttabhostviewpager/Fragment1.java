package com.example.fragmenttabhostviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	TextView msg;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment1, null);
		msg = (TextView) rootView.findViewById(R.id.msg);
//		Bundle ga = getArguments();
//		String val = ga.getString("pretty");
//		msg.setText(val);
		return rootView;
	}

}