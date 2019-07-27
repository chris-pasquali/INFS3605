package com.example.infs3605;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homepage5 extends AppCompatActivity {
    private ImageView trophy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage5);
        trophy = findViewById(R.id.trophy);
        trophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLeaderboard();
            }
        });

    }
    public void openLeaderboard(){
        Intent intent = new Intent(this, LeaderBoard.class);
        startActivity(intent);
    }
}
