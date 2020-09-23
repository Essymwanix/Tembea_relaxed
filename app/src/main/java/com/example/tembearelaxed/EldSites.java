package com.example.tembearelaxed;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EldSites extends AppCompatActivity
{
    String[] sites = {"Iskon Hindu Temple", "Chepkiit Falls", "Mt. Elgon National Park", "Kapkuro Bandas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eldsites);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_view, R.id.textView, sites);
        ListView eldSites = findViewById(R.id.eldsites);
        eldSites.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(EldSites.this,Eldoret.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
