package com.example.infs3605;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage3 extends AppCompatActivity {
    private ImageView starThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page3);
        starThree = findViewById(R.id.starThree);
        starThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourseResults3();
            }
        });

    }
    public void openCourseResults3(){
        Intent intent = new Intent(this, CourseResults3.class);
        startActivity(intent);
    }
}
