package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout3 extends AppCompatActivity implements View.OnClickListener {
    Button explit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        explit3 = (Button) findViewById(R.id.tombol_lanjut3);
        explit3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_lanjut3:
                Intent explit = new Intent(this, layout4.class);
                startActivity(explit);
                break;
        }
    }
}
