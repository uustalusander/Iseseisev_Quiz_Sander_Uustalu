package com.example.sander.iseseisevquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iseseisevquiz.R;

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    public void seeAnswers(View view)
    {
        Intent lol = new Intent (this, AnswersActivity.class);
        startActivity(lol);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("lõppscore");

        mFinalScore.setText("Sa said "+ QuizBook.questions.length + "-st " + score);

        if (score == 9)
        {
            mGrade.setText("Sa tead mind liiga hästi'");
        }
        if (score == 8)
        {
            mGrade.setText("kahtlaselt hea'");
        }
        if (score == 7)
        {
            mGrade.setText("Pole kohutav");
        }
        if (score <= 6)
        {
            mGrade.setText("Päris kohutav");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuizActivity.class));
                ResultsActivity.this.finish();
            }
        });
    }
}
