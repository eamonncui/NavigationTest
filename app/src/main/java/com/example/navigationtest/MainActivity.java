package com.example.navigationtest;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements Navigation1Fragment.OnFragmentInteractionListener, Navigation2Fragment.OnFragmentInteractionListener , Navigation3Fragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(@NotNull Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
