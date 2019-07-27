package com.example.infs3605;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView starOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    starOne = findViewById(R.id.starOne);
    starOne.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openCourseResults();
        }
    });
    }
    public void openCourseResults(){
    Intent intent = new Intent(this, CourseResults.class);
    startActivity(intent);
    }

}
