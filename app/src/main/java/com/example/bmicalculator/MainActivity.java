package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv_result;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et_weight);
        et2=(EditText)findViewById(R.id.et_height);
        tv_result=(TextView)findViewById(R.id.tv_result);

        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view )
            {
                bmi();
            }
        });

    }

    private void bmi(){
        float a, b, c;
        a=Float.parseFloat(et2.getText().toString());
        b=Float.parseFloat(et1.getText().toString());
        c=b/(a*a);
        tv_result.setText(""+ c);

        if (c <= 18.5){
            Toast.makeText(getApplicationContext(),"You are underweight",Toast.LENGTH_SHORT).show();
        }
        if( (c>=18.5) && (c < 25)){
            Toast.makeText(getApplicationContext(),"You are Normal",Toast.LENGTH_SHORT).show();
        }
        if (c> 25){
            Toast.makeText(getApplicationContext(),"You are Overweight", Toast.LENGTH_SHORT).show();
        }
    }
}