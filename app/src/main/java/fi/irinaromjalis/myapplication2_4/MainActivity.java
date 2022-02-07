package fi.irinaromjalis.myapplication2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Result;
    int step = 7;
    int start = 1;

    int min = -15;
    int max = 21;

    Button plus;
    Button minus;
    Button reset;

    private int value = start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView) findViewById(R.id.result);
        String res = String.valueOf(value);
        Result.setText(res);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        reset = (Button)findViewById(R.id.reset);

        plus.setOnClickListener(this::increment);
        minus.setOnClickListener(this::decrement);
        reset.setOnClickListener(this::reset);
    }

    public void increment(View view) {
        int newValue = value + step;
        if(newValue >= max){
            Result.setText(String.valueOf(max));
            return;
        }
        value = newValue;
        String res = String.valueOf(value);
        Result.setText(res);
    }

    public void decrement(View view) {
        int newValue = value - step;
        if(newValue < min ){
            Result.setText(String.valueOf(min));
            return;
        }

        value = newValue;
        String res = String.valueOf(value);
        Result.setText(res);
    }

    public void reset(View view) {
        value = start;
        String res = String.valueOf(value);
        Result.setText(res);
    }
}


