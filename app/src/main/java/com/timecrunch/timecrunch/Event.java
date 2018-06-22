package com.timecrunch.timecrunch;

public class Event {
    // Event
    String title;
    // Storage
    Boolean gDatabase; // local is 0; external/google is 1;

    // Location
    String location;
    Boolean gMaps; // is formatted for Google Maps
    // time
    String defaultEventStart;
    Boolean timeAMPM;
    String timeStart;
    String timeEnd;
    int timeHour;
    int timeMinute;
    Boolean repeat;
    Boolean daily;
    Boolean weekly;
    Boolean other;
    Boolean monday;
    Boolean tuesday;
    Boolean wednesday;
    Boolean thursday;
    Boolean friday;
    Boolean saturday;
    Boolean sunday;

    String note;


    // Default Constructor
    public Event() {
        title = null;
        location = null;
        gMaps = null;
        gDatabase = null;


        defaultEventStart = null;
        timeAMPM = null;
        timeStart = null;
        timeEnd = null;
        timeHour = 0;
        timeMinute = 0;


        repeat = null;
        daily = null;
        weekly = null;
        other = null;
        monday = null;
        tuesday = null;
        wednesday = null;
        thursday = null;
        friday = null;
        saturday = null;
        sunday = null;

        note = null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void toGoogle() {
        // Parse & JSON/GSON
    }

    /*
    public void () setDefaultTimeStart() {
        // Parse in string from google calander day events
        //find first available  empty time Set timeStart to next hour (ex: if its 7:55, set to 8:00)
        //return empty time to defaultTimeStart

        //rules 1 must be empty in calender
        //rules 2 must be present or future

    }
    */

    public void timeCrunch() {

    }
}