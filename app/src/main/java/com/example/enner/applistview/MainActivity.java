package com.example.enner.applistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Trae la referencia la lista que esta en la vista
        ListView listViewContacts = (ListView) findViewById(R.id.listViewContacts);

        String[] dataContacts = new String[]{"Juan", "Jose", "Maria", "Pedro", "Luis", "Enner", "Ana"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                                                this,
                                                android.R.layout.simple_expandable_list_item_1,
                                                android.R.id.text1,
                                                dataContacts);

        listViewContacts.setAdapter(adapter);

        //github.com/byronap120/SimpleList
        // developer.android.com/guide/topics/ui/layout/listview.html

    }

}
