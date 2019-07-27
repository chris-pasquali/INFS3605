package com.example.infs3605;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CourseResults3 extends AppCompatActivity {
    private Spinner spinner;
    String subjects[] ={"No Selection", "INFS1609 - Intro to Programming", "INFS2605 - Intermediate Programming"};
    int grade;
    EditText gradeInput;
    TextView gradeText;
    Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayAdapter<String> arrayAdapter;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_course_results2);
            spinner = findViewById(R.id.lbSelectCourses);
            btnHome = findViewById(R.id.btnHome);
            gradeText = findViewById(R.id.displayGrade);
            arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,subjects);
            spinner.setAdapter(arrayAdapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
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
                openHomepage4();
            }
        });
    } public void openHomepage4(){
        Intent intent = new Intent(this, HomePage4.class);
        startActivity(intent);
    }
}
