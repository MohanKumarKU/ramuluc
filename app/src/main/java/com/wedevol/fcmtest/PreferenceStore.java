package com.wedevol.fcmtest;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceStore {


    private static final String CUSTOMERID = "customerid";
    private static final String IPADDRESS = "ipaddress";


    public void setCustomerid(Context context, String OFSItems) {

        final SharedPreferences prefs = context.getSharedPreferences(
                CUSTOMERID, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(CUSTOMERID, OFSItems);
        editor.apply();
    }

    public String getCustomerid(Context context) {
        final SharedPreferences prefs = context.getSharedPreferences(
                CUSTOMERID, Context.MODE_PRIVATE);
        return prefs.getString(CUSTOMERID, "");
    }


    public void setIpaddress(Context context, String OFSItems) {

        final SharedPreferences prefs = context.getSharedPreferences(
                IPADDRESS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(IPADDRESS, OFSItems);
        editor.apply();
    }

    public String getIpaddress(Context context) {
        final SharedPreferences prefs = context.getSharedPreferences(
                IPADDRESS, Context.MODE_PRIVATE);
        return prefs.getString(IPADDRESS, "10.0.2.2");
    }

}
