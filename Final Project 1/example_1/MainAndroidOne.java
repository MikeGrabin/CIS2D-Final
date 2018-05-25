package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScrollView mScroll;
    private TextView mLog;
    /*The Override annotation will call other methods from an extended subclass
     * first before the logging components. The logging components are then called
     * from the XML file
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Initialize the logging components
        /*The private variables are implemented with XML methods to call an id reference
         *to run a specific attribute
         */
        mScroll = (ScrollView) findViewById(R.id.scrollLog);
        mLog = (TextView) findViewById(R.id.tvLog);
        mLog.setText("");

        displayMessage("onCreate");

    }

    public void onRunBtnClick(View v) {
        displayMessage("Running code!");
    }

    public void onClearBtnClick(View v) {
        mLog.setText("");
        mScroll.scrollTo(0, mScroll.getBottom());
    }

    public void displayMessage(String message) {
        mLog.append(message + "\n");
        mScroll.scrollTo(0, mScroll.getBottom());
    }
    /*The methods will display text when the orientation has switched
     *and the code will run again to the onPause method and cycle back
     *to running the onResume method*/
    @Override
    protected void onPause() {
        super.onPause();
        displayMessage("onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        displayMessage("onResume");
    }