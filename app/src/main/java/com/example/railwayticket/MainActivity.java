package com.example.railwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    private EditText edtId, edtPlSt, edtTimeSt, edtPlEnd, edtTimeEnd, edtCount;

    private Button btn;

    private String id, plSt, timeSt, plEnd, timeEnd, count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtId = findViewById(R.id.edtId);
        edtPlSt = findViewById(R.id.edtPlSt);
        edtTimeSt = findViewById(R.id.edtTimeSt);
        edtPlEnd = findViewById(R.id.edtPlEnd);
        edtTimeEnd = findViewById(R.id.edtTimeEnd);
        edtCount = findViewById(R.id.edtCount);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               id = edtId.getText().toString();
               plSt = edtPlSt.getText().toString();
               timeSt = edtTimeSt.getText().toString();
               plEnd = edtPlEnd.getText().toString();
               timeEnd = edtTimeEnd.getText().toString();
               count = edtCount.getText().toString();

               User user = new User(id, plSt, timeSt, plEnd, timeEnd, count);

               Intent intent = new Intent(getApplicationContext(), RailwayTicket.class);

               intent.putExtra("id", user);
                intent.putExtra("plSt", user);
                intent.putExtra("plEnd", user);
                intent.putExtra("timeSt", user);
                intent.putExtra("timeEnd", user);
                intent.putExtra("count", user);

                startActivity(intent);

            }
        });

    }
}