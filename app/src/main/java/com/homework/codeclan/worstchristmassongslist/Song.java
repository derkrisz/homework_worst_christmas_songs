package com.homework.codeclan.worstchristmassongslist;

/**
 * Created by derkrisz on 2017. 12. 19..
 */

public class Song {

    private Integer ranking;
    private String artist;
    private String title;
    private Integer year;

    public Song(Integer ranking, String artist, String title, Integer year) {
        this.ranking = ranking;
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
