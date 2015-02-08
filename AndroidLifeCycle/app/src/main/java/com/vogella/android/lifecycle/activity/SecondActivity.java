package com.vogella.android.lifecycle.activity;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondActivity extends TracerActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
