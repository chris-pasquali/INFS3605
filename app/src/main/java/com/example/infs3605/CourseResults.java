package com.example.infs3605;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CourseResults extends AppCompatActivity {
    private Spinner spinner;
    String subjects[] ={"No Selection","INFS1602 - Information Systems", "INFS1603 - Databases", "INFS1609 - Intro to Programming", "INSF2605 - Intermediate Programming"};
    int grade;
    EditText gradeInput;
    TextView gradeText;
    Button btnHome;
    ArrayAdapter<String>arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_results);
    spinner = findViewById(R.id.lbSelectCourses);
    btnHome = findViewById(R.id.btnHome);
    gradeText = findViewById(R.id.displayGrade);
    arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,subjects);
    spinner.setAdapter(arrayAdapter);

    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            if(!(spinner.getSelectedItem().toString().trim().equals("Select")))
            {

                if ( spinner.getSelectedItem().toString().trim().equals("INSF2605 - Intermediate Programming")) {
                    Toast.makeText(getApplicationContext(), "Please complete INFS1602 and INFS1603 before taking this course",Toast.LENGTH_SHORT).show();
                }
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });
        gradeInput = findViewById(R.id.editText2);
        gradeInput.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN)&& (keyCode == KeyEvent.KEYCODE_ENTER)){
                    int value = Integer.valueOf(gradeInput.getText().toString());
                    if (value >= 85 && value <= 100) {
                        gradeText.setText("HD");
                    }if (value >= 75 && value <= 84){
                        gradeText.setText("D");
                    }if (value >= 65 && value <= 74){
                        gradeText.setText("C");
                    }if (value >= 50 && value <= 64){
                        gradeText.setText("P");
                    }if (value <= 49){
                        gradeText.setText("F");
                    }
                }
                return false;
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Course Completed!",Toast.LENGTH_SHORT).show();
                openHomepage2();
            }
        });
    } public void openHomepage2(){
        Intent intent = new Intent(this, HomePage2.class);
        startActivity(intent);
    }
}
