package com.example.examplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        ListView listLogement = findViewById(R.id.listLogement);
        final String[] logements = new String[]{"Paris", "Bordeaux", "Lille", "Lyon", "Brest"};

        ArrayList<String> arrayLogements = new ArrayList<>();

        for(int i = 0; i < logements.length; i++){
            arrayLogements.add(logements[i]);
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayLogements);
        listLogement.setAdapter(adapter);

        listLogement.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String logement = logements[position];

                Toast.makeText(MainActivity.this, logement, Toast.LENGTH_LONG).show();
            }
        });
    }
}
