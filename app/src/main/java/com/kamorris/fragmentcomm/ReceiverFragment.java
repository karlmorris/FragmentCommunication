package com.kamorris.fragmentcomm;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReceiverFragment extends Fragment {

    TextView textView;

    public ReceiverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_blank, container, false);
        textView = (TextView) v.findViewById(R.id.textView);
        return v;
    }

    public void setMessage(String message){
        textView.setText(message);
    }


}
