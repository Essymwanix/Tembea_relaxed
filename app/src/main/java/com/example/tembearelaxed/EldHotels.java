package com.example.tembearelaxed;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EldHotels extends AppCompatActivity
{
    String[] hotels = {"Boma Inn Hotel", "Sirikwa Hotel", "Eldoret Wagon Hotel", "Winstar Hotel", "Poa PLace Resort", "Noble Hotel and Conference centre",
            "Ndupawa Prestige Hotel", "Starbucks Hotel", "Hotel Comfy", "Hotel Goshen", "Cicada Hotel"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eldhotels);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_view, R.id.textView, hotels);
        ListView eldotels = findViewById(R.id.eldHotels);
        eldotels.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(EldHotels.this,Eldoret.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
