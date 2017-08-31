package edu.orangecoastcollege.cs273.sbadajoz.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchToast(View view) {
        Toast.makeText(this, getString(R.string.shiver_toast_text), Toast.LENGTH_SHORT).show();

    }
}
