package com.saif.firebaseauthenticationandrtdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Fragment.MainFragment;
import Utils.FragmentUtilities;

public class MainActivity extends AppCompatActivity {
    private  MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment=new MainFragment();
        new FragmentUtilities(this).addFragment(R.id.container,mainFragment);
    }
}
