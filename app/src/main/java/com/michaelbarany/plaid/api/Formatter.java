package com.michaelbarany.plaid.api;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class Formatter {
    private Formatter() {
    }

    public static String toCurrency(double amount) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return formatter.format(-1 * amount);
    }

    public static String convertDate(String dateText, String oldFormat, String newFormat) {
        try {
            SimpleDateFormat oldDateFormat = new SimpleDateFormat(oldFormat);
            Date date = oldDateFormat.parse(dateText);
            SimpleDateFormat newDateFormat = new SimpleDateFormat(newFormat);
            return newDateFormat.format(date);
        } catch (ParseException exp) {
            exp.printStackTrace();
        }
        return dateText;
    }
}
