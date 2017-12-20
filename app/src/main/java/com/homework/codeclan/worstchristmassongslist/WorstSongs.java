package com.homework.codeclan.worstchristmassongslist;

import android.graphics.Movie;

import java.util.ArrayList;

/**
 * Created by derkrisz on 2017. 12. 19..
 */

public class WorstSongs {

    private ArrayList<Song> list;

    public WorstSongs() {
        list = new ArrayList<Song>();
        list.add(new Song(1, "Mariah Carey", "All I Want For Christmas Is You", 1994));
        list.add(new Song(2, "Wham!", "Last Christmas", 1986));
        list.add(new Song(3, "Jose Feliciano", "Feliz Navidad", 2004));
        list.add(new Song(4, "Madonna", "Santa Baby", 1987));
        list.add(new Song(5, "Katherine Kennicott Davis", "Little Drummer Boy", 1941));
        list.add(new Song(6, "N Sync", "Merry Christmas, Happy Holidays", 1998));
        list.add(new Song(7, "Spice Girls", "Christmas Wrapping", 1998));
        list.add(new Song(8, "Iggy Pop", "White Christmas", 2009));
        list.add(new Song(9, "Justin Bieber", "Mistletoe", 2001));
        list.add(new Song(10, "Tiny Tim", "Santa Claus Has Got The Aids", 1994));
        list.add(new Song(11, "Pussycat Dolls", "Santa Baby", 2000));
        list.add(new Song(12, "The Jackson 5", "I Saw Mummy Kissing Santa Claus", 1970));
        list.add(new Song(13, "The Peppermint Candy Kids", "All I Want For Christmas Is My Two Front Teeth", 1972));
        list.add(new Song(14, "Elmo & Patsy", "Grandma Got Ran Over By A Reindeer", 1979));
        list.add(new Song(15, "John Denver", "Please Daddy Don't Get Drunk This Christmas", 1993));

    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}
