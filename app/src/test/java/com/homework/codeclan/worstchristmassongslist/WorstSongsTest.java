package com.homework.codeclan.worstchristmassongslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by derkrisz on 2017. 12. 19..
 */

public class WorstSongsTest {

    @Test
    public void getListTest() {
        WorstSongs worstSongs = new WorstSongs();
        assertEquals(15, worstSongs.getList().size());
    }

}
