package com.example.tembearelaxed;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class EldRest extends AppCompatActivity
{
    String[] rest= {"Mama Mia Restaurant", "Java House", "KFC", "The Well Irish Pub and Restaurant", "Sunjeel Palace", "Zaika Lounge",
            "Cloud Nine Restaurant", "Pizza Bistro", "Klique Restaurant", "Kenmosa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eldrest);

        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.list_view, R.id.textView, rest);
        ListView eldRest = findViewById(R.id.eldrest);
        eldRest.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(EldRest.this,Eldoret.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
