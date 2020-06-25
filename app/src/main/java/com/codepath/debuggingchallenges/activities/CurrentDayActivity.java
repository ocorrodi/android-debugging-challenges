package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        tvDay = (TextView) findViewById(R.id.tvDay);
        Toast.makeText(CurrentDayActivity.this, "date" + getDayOfMonth(), Toast.LENGTH_LONG).show();
        tvDay.setText(getDayOfMonth());
    }

    private String getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        return "" + cal.get(Calendar.DAY_OF_MONTH);
    }
}
