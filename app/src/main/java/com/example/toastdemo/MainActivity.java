package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("Info", "Button was pressed.");
        Toast.makeText(this, "Hi " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
