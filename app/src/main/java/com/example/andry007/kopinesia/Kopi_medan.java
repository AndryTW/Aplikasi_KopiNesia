package com.example.andry007.kopinesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kopi_medan extends AppCompatActivity {
    TextView txt_hsl;
    EditText txt_no,nm,alm,number;
    Button btn_tot,btn_kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopi_medan);

            txt_hsl=(TextView) findViewById(R.id.txt_hsl);
            txt_no = (EditText) findViewById(R.id.txt_no);
            nm = (EditText) findViewById(R.id.nm);
            alm = (EditText) findViewById(R.id.alm);
            number = (EditText) findViewById(R.id.notelp);
            btn_tot = (Button) findViewById(R.id.btn_tot);

            btn_tot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int p,h;
                    p = Integer.parseInt(txt_no.getText().toString());
                    h = p* 9000;
                    txt_hsl.setText("Total Harga Seluruhnya sebesar  :  Rp "+h);
                }
            });

            btn_kirim = (Button) findViewById(R.id.btn_kirim);

            btn_kirim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (nm.getText().toString().contentEquals("") || alm.getText().toString().contentEquals("")
                            || number.getText().toString().contentEquals("")  || txt_no.getText().toString().contentEquals("") ) {
                        Toast.makeText(Kopi_medan.this, "Mohon Isikan Semua Data", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(Kopi_medan.this, "Terima Kasih, Kopi Medan Segera Dikirim", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
}
