package com.example.tembearelaxed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Eldoret extends AppCompatActivity {
    String[] acts = {"Sites","Hotels and Accomodation","Restaurants","Hospitals/Clinics","Banks/ATMs","Supermarkets/shops"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eldoret);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_view,R.id.textView,acts);
        ListView listView = findViewById(R.id.eld);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //String item = (String) adapterView.getItemAtPosition(i);
                switch (i){
                    case 0:
                        Intent intent0 = new Intent(Eldoret.this,EldSites.class);
                        startActivity(intent0);
                    case 1:
                        Intent intent1 = new Intent(Eldoret.this,EldHotels.class);
                        startActivity(intent1);
                    case 2:
                        Intent intent2 = new Intent(Eldoret.this,EldRest.class);
                        startActivity(intent2);
                    case 3:
                        Intent intent3 = new Intent(Eldoret.this,Turkana.class);
                        startActivity(intent3);
                    case 4:
                        Intent intent4 = new Intent(Eldoret.this,Nakuru.class);
                        startActivity(intent4);
                    case 5:
                        Intent intent5 = new Intent(Eldoret.this,Meru.class);
                        startActivity(intent5);

                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Eldoret.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
