package com.example.tembearelaxed;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Machakos  extends AppCompatActivity
{
    String[] acts = {"Sites", "Hotels and accomodation", "Restaurants", "Hospitals/Clinics", "Banks/ATMS", "Supermarkets/Shops"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machakos);

        ArrayAdapter adapter = new ArrayAdapter<>(this,R.layout.list_view,R.id.textView,acts);
        ListView mac = findViewById(R.id.mac);
        mac.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(Machakos.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
