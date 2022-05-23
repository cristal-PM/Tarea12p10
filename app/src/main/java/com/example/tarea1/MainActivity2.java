package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

private TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
txt1=(EditText)findViewById(R.id.editTextTextPersonName7);
txt2=(EditText)findViewById(R.id.editTextTextPersonName8);
txt3=(EditText)findViewById(R.id.editTextTextPersonName9);
txt4=(EditText)findViewById(R.id.editTextTextPersonName10);
txt5=(EditText)findViewById(R.id.editTextTextPersonName11);

String datos=getIntent().getStringExtra("datos");
String dato1=getIntent().getStringExtra("dato1");
String dato2=getIntent().getStringExtra("dato2");
String dato3=getIntent().getStringExtra("dato3");
String dato4=getIntent().getStringExtra("dato4");

txt1.setText(datos);
txt2.setText(dato1);
txt3.setText(dato2);
txt4.setText(dato3);
txt5.setText(dato4);
    }
public void atras(View v){
    Intent i=new Intent(this,MainActivity.class);
    i.putExtra("datos",txt1.getText().toString());
    i.putExtra("dato1",txt2.getText().toString());
    i.putExtra("dato2",txt3.getText().toString());
    i.putExtra("dato3",txt4.getText().toString());
    i.putExtra("dato4",txt5.getText().toString());
    startActivity(i);
}
}