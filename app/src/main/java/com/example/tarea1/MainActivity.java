package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bFecha,siguiente;
EditText nom,tel,desc,email ,fec;
private int dia,mes,año;
private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    bFecha=(Button)findViewById(R.id.button);
    bFecha.setOnClickListener(this);
    siguiente=(Button)findViewById(R.id.button2);
    nom=(EditText)findViewById(R.id.editTextTextPersonName3);
    tel=(EditText) findViewById(R.id.editTextTextPersonName5);
    email=(EditText) findViewById(R.id.editTextTextPersonName);
    desc=(EditText)findViewById(R.id.editTextTextPersonName6);
    fec=(EditText)findViewById(R.id.editTextTextPersonName4);
        String datos=getIntent().getStringExtra("datos");
        String dato1=getIntent().getStringExtra("dato1");
        String dato2=getIntent().getStringExtra("dato2");
        String dato3=getIntent().getStringExtra("dato3");
        String dato4=getIntent().getStringExtra("dato4");

        nom.setText(datos);
        fec.setText(dato1);
        tel.setText(dato2);
        email.setText(dato3);
        desc.setText(dato4);
    }

    @Override
    public void onClick(View view) {
        if  (view==bFecha){
            final Calendar c =Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            año=c.get(Calendar.YEAR);
            DatePickerDialog D=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    fec.setText(i2+"-"+i1+"-"+i);
                }
            },dia,mes,año);
            D.show();
        }
    }



    public void Enviar(View view) {
            Intent i=new Intent(this,MainActivity2.class);
            i.putExtra("datos",nom.getText().toString());
            i.putExtra("dato1",fec.getText().toString());
            i.putExtra("dato2",tel.getText().toString());
            i.putExtra("dato3",email.getText().toString());
            i.putExtra("dato4",desc.getText().toString());startActivity(i);}

}
