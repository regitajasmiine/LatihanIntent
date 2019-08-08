package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class layout2 extends AppCompatActivity implements View.OnClickListener {
    Button explit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        explit2 = (Button) findViewById(R.id.tombol_lanjut2);
        explit2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tombol_lanjut2:
                Intent explit = new Intent(this, layout3.class);
                startActivity(explit);
                break;
        }

    }
}
