package com.homework.codeclan.worstchristmassongslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by derkrisz on 2017. 12. 19..
 */

public class WorstSongsAdapter extends ArrayAdapter<Song> {

    public WorstSongsAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.worst_songs_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRanking().toString());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSong.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentSong.getYear().toString());

        return listItemView;

    }
}
