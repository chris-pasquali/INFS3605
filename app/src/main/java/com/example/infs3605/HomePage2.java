package com.example.infs3605;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage2 extends AppCompatActivity {
    private ImageView starTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
starTwo = findViewById(R.id.starTwo);
        starTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCourseResults2();
            }
        });

    }
    public void openCourseResults2(){
        Intent intent = new Intent(this, CourseResults2.class);
        startActivity(intent);
    }
}
