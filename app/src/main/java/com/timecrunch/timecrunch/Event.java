package com.timecrunch.timecrunch;

public class Event {

    // Event
    String title;
    String note;
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



//    // Default Constructor
//    public Event() {
//        title = NULL;
//        location = NULL;
//        gMaps = NULL;
//        gDatabase = NULL;
//
//
//        defaultEventStart = NULL;
//        timeAMPM = NULL;
//        timeStart = NULL;
//        timeEnd = NULL;
//        timeHour = NULL;
//        timeMinute = NULL;
//
//
//        repeat = NULL;
//        daily = NULL;
//        weekly = NULL;
//        other = NULL;
//        monday = NULL;
//        tuesday = NULL;
//        wednesday = NULL;
//        thursday = NULL;
//        friday = NULL;
//        saturday = NULL;
//        sunday = NULL;
//
//        note = NULL;
//    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void toGoogle() {
        // Parse & JSON/GSON
    }

    /*
    public void () setDefaultTimeStart() {
        // Parse in string from google calander day events
        //find first available empty time Set timeStart to next hour (ex: if its 7:55, set to 8:00)
        //return empty time to defaultTimeStart

        //rules 1 must be empty in calender
        //rules 2 must be present or future

    }
    */

    public void timeCrunch() {

    }
}