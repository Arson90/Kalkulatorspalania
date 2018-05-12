package com.example.arkadiusz.kalkulatorspalania;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public EditText dzialanie;
    public EditText wynik;

    float eq;
    float num1;
    float num2;
    float num3;
    float num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        EditText numA=(EditText)findViewById(R.id.editText1);
        EditText numB=(EditText)findViewById(R.id.editText2);
        EditText numC=(EditText)findViewById(R.id.editText3);
        wynik = (EditText)findViewById(R.id.editText4);

        if(numA.length()==0){
            num1 = 0;
        }else{
            num1 = Float.parseFloat(numA.getText().toString());
        }

        if(numB.length()==0){
            num2 = 0;
        }else{
            num2 = Float.parseFloat(numB.getText().toString());
        }

        if(numC.length()==0){
            num3=0;
        }else{
            num3 = Float.parseFloat(numC.getText().toString());
        }

        switch(view.getId()){
            case R.id.button1:

                //Oblicz

            num4 = num1/num2/num3;
            eq = num4*100;
            break;
        }

        wynik.setText(String.format("= %.2f",eq));
    }

    public void helpClick(View view) {

        setContentView(R.layout.help);
        TextView helper = (TextView)findViewById(R.id.textView6);
        helper.setText("Sposób obliczania spalania paliwa\n\n" +
                "Wartość tankowania w złotówkach jest dzielona przez cenę litra co daje liczbę zatankowanych litrów\n" +
                "Liczba zatankowanych litrów jest dzielona przez liczbę kilometrów\n" +
                "Wynik tego dzielenia mnoży się przez 100 aby uzyskać wynik z dwoma miejscami po przecinku\n");
    }

    public void wrocClick(View view){
        setContentView(R.layout.activity_main);
    }

}
