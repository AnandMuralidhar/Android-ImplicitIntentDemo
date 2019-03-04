package com.anand.assignmenttwo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void startWebBrowser(View v) {
        EditText editText = findViewById(R.id.urlTextEntry);
        Uri websiteAddress = Uri.parse(editText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, websiteAddress);
        startActivity(intent);
    }

    public void startPhone(View v) {
        EditText editText = findViewById(R.id.mobileTextEntry);
        Uri mobileNumber = Uri.parse("tel:" + editText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL, mobileNumber);
        startActivity(intent);
    }

    public void finishActivity(View v)
    {
        MainActivity.this.finish();
    }
}
