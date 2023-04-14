package com.example.railwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class RailwayTicket extends AppCompatActivity implements Serializable {

    private TextView tvId, tvPlSt, tvTimeSt, tvPlEnd, tvTimeEnd, tvCount;

    private Button btn;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railway_ticket);

        tvId = findViewById(R.id.tvId);
        tvPlSt = findViewById(R.id.tvPlSt);
        tvTimeSt = findViewById(R.id.tvTimeSt);
        tvPlEnd = findViewById(R.id.tvPlEnd);
        tvTimeEnd = findViewById(R.id.tvTimeEnd);
        tvCount = findViewById(R.id.tvCount);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            //id, plSt, timeSt, plEnd, timeEnd, count
            user = (User)bundle.getSerializable("id" );
            user = (User)bundle.getSerializable("plSt" );
            user = (User)bundle.getSerializable("timeSt" );
            user = (User)bundle.getSerializable("plEnd" );
            user = (User)bundle.getSerializable("timeEnd" );
            user = (User)bundle.getSerializable("count" );

            tvId.setText("ID: " + user.getId());
            tvPlSt.setText("Место отправления: " + user.getPlSt());
            tvTimeSt.setText("Время отправления: " + user.getTimeSt());
            tvPlEnd.setText("Место прибытия: " + user.getPlEnd());
            tvTimeEnd.setText("Время прибытия: " + user.getTimeEnd());
            tvCount.setText("Стоимость билета: " + user.getCount());

        }

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}