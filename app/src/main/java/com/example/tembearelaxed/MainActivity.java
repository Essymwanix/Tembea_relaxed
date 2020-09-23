package com.example.tembearelaxed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] list = {"Eldoret","Nairobi","Mombasa","Turkana","Nakuru","Meru","Machakos","Naivasha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_view,R.id.textView,list);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String item = (String) adapterView.getItemAtPosition(i);
                switch (i){
                    case 0:
                        Intent intent0 = new Intent(MainActivity.this,Eldoret.class);
                        startActivity(intent0);
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,Nairobi.class);
                        startActivity(intent1);
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,Mombasa.class);
                        startActivity(intent2);
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,Turkana.class);
                        startActivity(intent3);
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this,Nakuru.class);
                        startActivity(intent4);
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this,Meru.class);
                        startActivity(intent5);
                    case 6:
                        Intent intent6 = new Intent(MainActivity.this,Machakos.class);
                        startActivity(intent6);
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this,Naivasha.class);
                        startActivity(intent7);

                }
            }
        });

    }
}
