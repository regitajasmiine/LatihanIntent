package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout4 extends AppCompatActivity implements View.OnClickListener {
    Button explit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4);
        explit4 = (Button) findViewById(R.id.tombol_lanjut4);
        explit4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_lanjut4:
                Intent explit = new Intent(this, layout5.class);
                startActivity(explit);
                break;
        }
    }
}