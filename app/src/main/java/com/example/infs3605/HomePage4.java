package com.example.infs3605;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomePage4 extends AppCompatActivity {

    private ImageView starFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page4);
        Toast.makeText(getApplicationContext(), "New Award Unlocked: Term 1 Completed",Toast.LENGTH_SHORT).show();
        starFour = findViewById(R.id.starFour);
        starFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourseResults4();
            }
        });

    }
    public void openCourseResults4(){
        Intent intent = new Intent(this, CourseResults4.class);
        startActivity(intent);
    }
}

