package com.ixidev.simplenotepad.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class NoteUtils {

    public static String dateFromLong(long time) {
        DateFormat format = new SimpleDateFormat("yyyy MMM dd, EEE", Locale.KOREA);
        return format.format(new Date(time));
    }
}
