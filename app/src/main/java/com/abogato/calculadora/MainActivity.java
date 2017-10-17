package com.abogato.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private TextView r;
    private Button btnOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        r=(TextView)findViewById(R.id.resultado);

    }
    public void sumar(View View){
        String num1=n1.getText().toString();
        String num2=n2.getText().toString();
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int c=a+b;
        r.setText("= "+c);

    }
    public void restar(View View){
        String num1=n1.getText().toString();
        String num2=n2.getText().toString();
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int c=a-b;
        r.setText("= "+c);

    }
    public void multiplicar(View View){
        String num1=n1.getText().toString();
        String num2=n2.getText().toString();
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int c=a*b;
        r.setText("= "+c);

    }
    public void dividir(View View){
        String num1=n1.getText().toString();
        String num2=n2.getText().toString();
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        double c=a/b;
        r.setText("= "+c);

    }

}
