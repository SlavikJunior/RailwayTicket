package com.example.railwayticket;

import java.io.Serializable;

public class User implements Serializable {

    private String id, plSt, timeSt, plEnd, timeEnd, count;

    public User(String id, String plSt, String timeSt, String plEnd, String timeEnd, String count) {
        this.id = id;
        this.plSt = plSt;
        this.timeSt = timeSt;
        this.plEnd = plEnd;
        this.timeEnd = timeEnd;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlSt() {
        return plSt;
    }

    public void setPlSt(String plSt) {
        this.plSt = plSt;
    }

    public String getTimeSt() {
        return timeSt;
    }

    public void setTimeSt(String timeSt) {
        this.timeSt = timeSt;
    }

    public String getPlEnd() {
        return plEnd;
    }

    public void setPlEnd(String plEnd) {
        this.plEnd = plEnd;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
