package com.example.khizzipool.myapplication;

public class Flags {

    private String Flagname;
    private int Thumbnail;

    public Flags() {
    }

    public Flags(String title, int thumbnail) {
        Flagname = title;
        Thumbnail = thumbnail;
    }

    public String getFlagname() {
        return Flagname;
    }

    public void setFlagname(String flagname) {
        Flagname = flagname;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}




