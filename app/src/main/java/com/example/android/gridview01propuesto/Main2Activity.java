package com.example.android.gridview01propuesto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //
        Bundle bundle = getIntent().getExtras();
        //String dato = bundle.getString("posicion");
        int dato = bundle.getInt("posicion");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(dato+"");

    }

    public void salir(View v) {
        finish();
    }

}
