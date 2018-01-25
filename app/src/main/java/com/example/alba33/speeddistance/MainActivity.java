package com.example.alba33.speeddistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText speed, distance;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speed = (EditText)findViewById(R.id.etSpeed);
        distance = (EditText)findViewById(R.id.etDistance);
        calculate = (Button)findViewById(R.id.btnCalculate);
        result = (TextView)findViewById(R.id.txtResult);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nSpeed = speed.getText().toString();
                String nDistance = distance.getText().toString();

                int spd = Integer.parseInt(nSpeed);
                int dst = Integer.parseInt(nDistance);

                int time = dst / spd;
                if (time <= 1) {
                    result.setText("Your time to destination " + time + "Hour");
                }else if (time >= 1) {
                    result.setText("Your time to destination " + time + "Hours");
                }
            }
        });
    }
}
