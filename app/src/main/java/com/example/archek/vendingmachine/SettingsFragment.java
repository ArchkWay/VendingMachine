package com.example.archek.vendingmachine;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class SettingsFragment extends Fragment{
    private SharedPreferences prefs;
    private SharedPreferences.Editor prefsEditor;
    TextView tvSetAmountVMOnes;
    TextView tvSetAmountVMTwos;
    TextView tvSetAmountVMFives;
    TextView tvSetAmountVMTens;
    Spinner spSettingsOnes;
    Spinner spSettingsTwos;
    Spinner spSettingsFives;
    Spinner spSettingsTens;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate( R.layout.fragment_settings, container, false);
    }
    @SuppressLint("CommitPrefEdits")
    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState) {
        prefs = PreferenceManager.getDefaultSharedPreferences( getContext() );
        prefsEditor = prefs.edit();
        tvSetAmountVMOnes = view.findViewById(R.id.tvSetAmountVMOnes);
        tvSetAmountVMTwos = view.findViewById(R.id.tvSetAmountVMTwos);
        tvSetAmountVMFives = view.findViewById(R.id.tvSetAmountVMFives);
        tvSetAmountVMTens = view.findViewById(R.id.tvSetAmountVMTens);
        spSettingsOnes = view.findViewById(R.id.spSettingsOnes);
        spSettingsTwos = view.findViewById(R.id.spSettingsTwos);
        spSettingsFives = view.findViewById(R.id.spSettingsFives);
        spSettingsTens = view.findViewById(R.id.spSettingsTens);

        setOnItemSelectedListeners();
        setSelections();

    }
    private void setSelections() {
        int onesAmount = prefs.getInt(PrefsConst.SETTINGS_ONES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        spSettingsOnes.setSelection(getAmountIndex(onesAmount));
        int twosAmount = prefs.getInt(PrefsConst.SETTINGS_TWOS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        spSettingsTwos.setSelection(getAmountIndex(twosAmount));
        int fivesAmount = prefs.getInt(PrefsConst.SETTINGS_FIVES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        spSettingsFives.setSelection(getAmountIndex(fivesAmount));
        int tensAmount = prefs.getInt(PrefsConst.SETTINGS_TENS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        spSettingsTens.setSelection(getAmountIndex(tensAmount));
    }

    private int getAmountIndex(int amount) {
        String [] options = getResources().getStringArray(R.array.amount_options);
        List<String > optionsList = Arrays.asList(options);
        return optionsList.indexOf(String.valueOf(amount));

    }



    private void setOnItemSelectedListeners(){
        spSettingsOnes.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                String amountString = parent.getItemAtPosition( position ).toString();
                int amountInt = Integer.parseInt( amountString );
                prefsEditor.putInt( PrefsConst.SETTINGS_TWOS_AMOUNT, amountInt ).apply();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){ }
        });
        spSettingsTwos.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                String amountString = parent.getItemAtPosition( position ).toString();
                int amountInt = Integer.parseInt( amountString );
                prefsEditor.putInt( PrefsConst.SETTINGS_TWOS_AMOUNT, amountInt ).apply();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){ }
        });
        spSettingsFives.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                String amountString = parent.getItemAtPosition( position ).toString();
                int amountInt = Integer.parseInt( amountString );
                prefsEditor.putInt( PrefsConst.SETTINGS_FIVES_AMOUNT, amountInt ).apply();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){ }
        });
        spSettingsTens.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView <?> parent, View view, int position, long id) {
                String amountString = parent.getItemAtPosition( position ).toString();
                int amountInt = Integer.parseInt( amountString );
                prefsEditor.putInt( PrefsConst.SETTINGS_TENS_AMOUNT, amountInt ).apply();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent){ }
        });
    }
}
