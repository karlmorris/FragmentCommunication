package com.kamorris.fragmentcomm;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SenderFragment extends Fragment {

    SenderInterface activty;


    public SenderFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity c) {
        super.onAttach(c);
        activty = (SenderInterface) c;
    }

    @Override
    public void onDetach() {
        activty = null;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sender, container, false);

        final EditText et = (EditText) v.findViewById(R.id.editText);

        v.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activty.acceptMessage(et.getText().toString());
            }
        });


        return v;
    }

    public interface SenderInterface {
        public void acceptMessage(String message);
    }

}
