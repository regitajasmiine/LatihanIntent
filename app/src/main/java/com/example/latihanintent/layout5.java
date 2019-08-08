package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout5 extends AppCompatActivity implements View.OnClickListener {
    Button explit5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5);
        explit5 = (Button) findViewById(R.id.tombol_lanjut5);
        explit5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_lanjut5:
                Intent explit = new Intent(this, layout6.class);
                startActivity(explit);
                break;
        }
    }
}