package com.example.khizzipool.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Flag_Activity extends AppCompatActivity {
    private TextView FnameR;
    private ImageView imgR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_);

        FnameR = findViewById(R.id.flagnm);
        imgR = findViewById(R.id.flagThumbnail);

        Intent i = getIntent();
        String Fname = i.getExtras().getString("FlagName");
        int image = i.getExtras().getInt("Thumbnail");

        FnameR.setText(Fname);
        imgR.setImageResource(image);
    }
}
