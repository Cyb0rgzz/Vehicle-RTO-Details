package com.example.cyb0rgz.cybroid;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton sendbutton;
    private TextInputEditText inputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendbutton = (ImageButton) findViewById(R.id.sendButton);
        inputEditText = findViewById(R.id.vehicleNoEditText);
        sendbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Wait until we fetch the Vehcile Details", Toast.LENGTH_LONG).show();
                inputEditText.setText("");
            }

        });





    }




}
