package com.homework.codeclan.worstchristmassongslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WorstSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worst_songs_list);

        WorstSongs worstSongs = new WorstSongs();
        ArrayList<Song> list = worstSongs.getList();

        WorstSongsAdapter songAdapter = new WorstSongsAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}
