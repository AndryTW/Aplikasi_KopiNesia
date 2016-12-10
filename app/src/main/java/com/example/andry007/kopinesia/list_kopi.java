package com.example.andry007.kopinesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_kopi extends AppCompatActivity {
    private ListView listView;
    private String[] kopi;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kopi);

        kopi = new String[]{
                "Kopi Kintamani",
                "Kopi Aceh Gayo",
                "Kopi Medan",
                "Kopi Lawu"
        };

        listView = (ListView) findViewById(R.id.liskop);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kopi);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int ItemPos=i;
                switch (ItemPos) {

                    case 0:
                        Intent a = new Intent(list_kopi.this, Kopi_kintamani.class);
                        startActivity(a);
                        break;

                    case 1:
                        Intent b = new Intent(list_kopi.this, kopi_aceh_gayo.class);
                        startActivity(b);
                        break;

                    case 2:
                        Intent c = new Intent(list_kopi.this, Kopi_medan.class);
                        startActivity(c);
                        break;

                    case 3:
                        Intent d = new Intent(list_kopi.this, Kopi_lawu.class);
                        startActivity(d);
                        break;
                }
            }
        });
    }
}

