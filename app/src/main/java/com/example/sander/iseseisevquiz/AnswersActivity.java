package com.example.sander.iseseisevquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.iseseisevquiz.R;
import com.example.sander.iseseisevquiz.QuizActivity;

public class AnswersActivity extends AppCompatActivity {

    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        mRetryButton = (Button)findViewById(R.id.retry);

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnswersActivity.this, QuizActivity.class));
                AnswersActivity.this.finish();
            }
        });

    }
}
