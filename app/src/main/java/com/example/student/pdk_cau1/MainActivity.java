package com.example.student.pdk_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSoa,edtSob;
    TextView txtKQ;
    Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtSoa = (EditText)findViewById(R.id.edtSoa);
        edtSob = (EditText) findViewById(R.id.edtSob);

        txtKQ=(TextView) findViewById(R.id.txtKQ);
        btnTong=(Button) findViewById(R.id.btnTong);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soa=Integer.parseInt(edtSoa.getText().toString());
                int sob=Integer.parseInt(edtSob.getText().toString());
                int tong=soa+sob;
                txtKQ.setText("Tổng là: "+tong);
            }
        });



    }
}
