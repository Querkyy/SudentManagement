package com.example.coope.sudentmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppMainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main);

        button = (Button) findViewById(R.id.studentList);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStudent();
            }
        });
    }

    public void openStudent() {
        Intent intent = new Intent(this, StudentActivity.class);
        startActivity(intent);
    }
}
