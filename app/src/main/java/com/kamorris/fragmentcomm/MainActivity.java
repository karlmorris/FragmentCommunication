package com.kamorris.fragmentcomm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements SenderFragment.SenderInterface{

    ReceiverFragment receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        receiver = new ReceiverFragment();
        SenderFragment sender = new SenderFragment();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.frag1, sender)
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.frag2, receiver)
                .commit();
    }

    @Override
    public void acceptMessage(String message) {
        receiver.setMessage(message);
    }
}
