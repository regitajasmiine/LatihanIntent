package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout6 extends AppCompatActivity implements View.OnClickListener {
    Button explit6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout6);
        explit6 = (Button) findViewById(R.id.tombol_lanjut6);
        explit6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_lanjut6:
                Intent explit = new Intent(this, MainActivity.class);
                startActivity(explit);
                break;
        }
    }
}