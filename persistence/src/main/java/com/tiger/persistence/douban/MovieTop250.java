package com.tiger.persistence.douban;


import java.util.ArrayList;

/**
 * Created by tigershen on 2017/12/13.
 */

public class MovieTop250 {
    private int total;
    private int count;
    private int start;
    private String title;
    private ArrayList<MovieSubject> movieSubjects;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<MovieSubject> getMovieSubjects() {
        return movieSubjects;
    }

    public void setMovieSubjects(ArrayList<MovieSubject> movieSubjects) {
        this.movieSubjects = movieSubjects;
    }
}
