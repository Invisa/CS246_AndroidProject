package com.timecrunch.timecrunch;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;

public static class SettingsScreen extends PreferenceFragment {

    @override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);
        //SwitchPreference switchPreference = (SwitchPreference) findPreference("");
    }
}