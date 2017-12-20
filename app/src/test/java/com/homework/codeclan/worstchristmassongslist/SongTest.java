package com.homework.codeclan.worstchristmassongslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by derkrisz on 2017. 12. 19..
 */

public class SongTest {

    Song song;

    @Before
    public void before() {
        song = new Song(35, "Celine Dion", "My Heart Will Go On", 1997 );

    }

    @Test
    public void getRanking() {
        assertEquals((Integer)35, song.getRanking());
    }

    @Test
    public void getArtist() {
        assertEquals("Celine Dion", song.getArtist());
    }

    @Test
    public void getTitle() {
        assertEquals("My Heart Will Go On", song.getTitle());
    }

    @Test
    public void getYear() {
        assertEquals((Integer)1997, song.getYear());
    }
}
