package com.example.archek.vendingmachine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainFragment extends Fragment{
    ConstraintLayout clMain;
    TextView tvAmountIncerted;
    TextView tvAmountVMTeas;
    TextView tvAmountVMCoffies;
    TextView tvAmountVMCoffiesWithMilk;
    TextView tvAmountVMJuices;
    TextView tvAmountUserCoffies;
    TextView tvAmountUserTeas;
    TextView tvAmountUserCoffiesWithMilk;
    TextView tvAmountUserJuices;
    TextView tvAmountUserOnes;
    TextView tvAmountUserTwos;
    TextView tvAmountUserFives;
    TextView tvAmountUserTens;
    TextView tvAmountVMOnes;
    TextView tvAmountVMTwos;
    TextView tvAmountVMFives;
    TextView tvAmountVMTens;


    Button btnBuyTea;
    Button btnBuyCoffie;
    Button btnBuyCoffieWithMilk;
    Button btnBuyJuice;
    Button btnIncertOne;
    Button btnIncertTwo;
    Button btnIncertFive;
    Button btnIncertTen;
    Button btnGetChange;

    int amountIncerted;
    int amountVMTeas;
    int amountVMCoffies;
    int amountVMCoffiesWithMilk;
    int amountVMJuices;
    int amountUserCoffies;
    int amountUserTeas;
    int amountUserCoffiesWithMilk;
    int amountUserJuices;
    int amountUserOnes;
    int amountUserTwos;
    int amountUserFives;
    int amountUserTens;
    int amountVMOnes;
    int amountVMTwos;
    int amountVMFives;
    int amountVMTens;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate( R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        amountVMOnes = preferences.getInt(PrefsConst.SETTINGS_ONES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMTwos = preferences.getInt(PrefsConst.SETTINGS_TWOS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMFives = preferences.getInt(PrefsConst.SETTINGS_FIVES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMTens = preferences.getInt(PrefsConst.SETTINGS_TENS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        tvAmountIncerted = view.findViewById(R.id.tvAmountIncerted);
        tvAmountVMTeas = view.findViewById(R.id.tvAmountVMTeas);
        tvAmountVMCoffies = view.findViewById(R.id.tvAmountVMCoffies);
        tvAmountVMCoffiesWithMilk = view.findViewById(R.id.tvAmountVMCoffiesWithMilk);
        tvAmountVMJuices = view.findViewById(R.id.tvAmountVMJuices);
        tvAmountUserCoffies = view.findViewById(R.id.tvCountCoffies);
        tvAmountUserTeas = view.findViewById(R.id.tvCountTeas);
        tvAmountUserCoffiesWithMilk = view.findViewById(R.id.tvCountCoffiesWithMilk);
        tvAmountUserJuices = view.findViewById(R.id.tvCountJuices);
        tvAmountUserOnes = view.findViewById(R.id.tvCountOnes);
        tvAmountUserTwos = view.findViewById(R.id.tvCountTwos);
        tvAmountUserFives = view.findViewById(R.id.tvCountFives);
        tvAmountUserTens = view.findViewById(R.id.tvCountTens);
        tvAmountVMOnes = view.findViewById(R.id.tvVMCountOnes);
        tvAmountVMTwos = view.findViewById(R.id.tvVMCountTwos);
        tvAmountVMFives = view.findViewById(R.id.tvVMCountFives);
        tvAmountVMTens = view.findViewById(R.id.tvVMCountTens);

        btnBuyTea = view.findViewById(R.id.btnTea);
        btnBuyCoffie = view.findViewById(R.id.btnCoffie);
        btnBuyCoffieWithMilk = view.findViewById(R.id.btnCoffieWithMilk);
        btnBuyJuice = view.findViewById(R.id.btnJuice);
        btnIncertOne = view.findViewById(R.id.btnIncertOne);
        btnIncertTwo = view.findViewById(R.id.btnIncertTwo);
        btnIncertFive = view.findViewById(R.id.btnIncertFive);
        btnIncertTen = view.findViewById(R.id.btnIncertTen);
        btnGetChange = view.findViewById(R.id.btnGetChange);

        amountIncerted = 0;
        amountVMTeas = 10;
        amountVMCoffies = 20;
        amountVMCoffiesWithMilk = 20;
        amountVMJuices = 15;
        amountUserCoffies = 0;
        amountUserTeas = 0;
        amountUserCoffiesWithMilk = 0;
        amountUserJuices = 0;
        amountUserOnes = 10;
        amountUserTwos = 30;
        amountUserFives = 20;
        amountUserTens = 15;

        tvAmountIncerted.setText(String.valueOf(amountIncerted));
        tvAmountVMTeas.setText(String.valueOf(amountVMTeas));
        tvAmountVMCoffies.setText(String.valueOf(amountVMCoffies));
        tvAmountVMCoffiesWithMilk.setText(String.valueOf(amountVMCoffiesWithMilk));
        tvAmountVMJuices.setText(String.valueOf(amountVMJuices));
        tvAmountUserCoffies.setText(String.valueOf(amountUserCoffies));
        tvAmountUserTeas.setText(String.valueOf(amountUserTeas));
        tvAmountUserCoffiesWithMilk.setText(String.valueOf(amountUserCoffiesWithMilk));
        tvAmountUserJuices.setText(String.valueOf(amountUserJuices));
        tvAmountUserOnes.setText(String.valueOf(amountUserOnes));
        tvAmountUserTwos.setText(String.valueOf(amountUserTwos));
        tvAmountUserFives.setText(String.valueOf(amountUserFives));
        tvAmountUserTens.setText(String.valueOf(amountUserTens));
        tvAmountVMOnes.setText(String.valueOf(amountVMOnes));
        tvAmountVMTwos.setText(String.valueOf(amountVMTwos));
        tvAmountVMFives.setText(String.valueOf(amountVMFives));
        tvAmountVMTens.setText(String.valueOf(amountVMTens));

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id){
                    case R.id.btnIncertOne:
                        if(amountUserOnes >= 1) {
                            amountIncerted += 1;
                            amountUserOnes -= 1;
                            amountVMOnes += 1;

                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                            tvAmountUserOnes.setText(String.valueOf(amountUserOnes));
                            tvAmountVMOnes.setText(String.valueOf(amountVMOnes));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnIncertTwo:
                        if(amountUserTwos >= 1) {
                            amountIncerted += 2;
                            amountUserTwos -= 1;
                            amountVMTwos += 1;

                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                            tvAmountUserTwos.setText(String.valueOf(amountUserTwos));
                            tvAmountVMTwos.setText(String.valueOf(amountVMTwos));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnIncertFive:
                        if(amountUserFives >= 1) {
                            amountIncerted += 5;
                            amountUserFives -= 1;
                            amountVMFives += 1;

                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                            tvAmountUserFives.setText(String.valueOf(amountUserFives));
                            tvAmountVMFives.setText(String.valueOf(amountVMFives));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnIncertTen:
                        if(amountUserTens >= 1) {
                            amountIncerted += 10;
                            amountUserTens -= 1;
                            amountVMTens += 1;

                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                            tvAmountUserTens.setText(String.valueOf(amountUserTens));
                            tvAmountVMTens.setText(String.valueOf(amountVMTens));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnTea:
                        if(amountIncerted >= 13 && amountVMTeas >= 1) {
                            amountIncerted -= 13;
                            amountVMTeas -= 1;
                            amountUserTeas += 1;
                            tvAmountUserTeas.setText(String .valueOf(amountUserTeas));
                            tvAmountVMTeas.setText(String .valueOf(amountVMTeas));
                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                        }
                        else if(amountIncerted < 13) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnCoffie:
                        if(amountIncerted >= 18 && amountVMCoffies >= 1) {
                            amountIncerted -= 18;
                            amountVMCoffies -= 1;
                            amountUserCoffies += 1;
                            tvAmountUserCoffies.setText(String .valueOf(amountUserCoffies));
                            tvAmountVMCoffies.setText(String .valueOf(amountVMCoffies));
                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                        }
                        else if(amountIncerted < 18) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnCoffieWithMilk:
                        if(amountIncerted >= 21 && amountVMCoffiesWithMilk >= 1) {
                            amountIncerted -= 21;
                            amountVMCoffiesWithMilk -= 1;
                            amountUserCoffiesWithMilk += 1;
                            tvAmountUserCoffiesWithMilk.setText(String .valueOf(amountUserCoffiesWithMilk));
                            tvAmountVMCoffiesWithMilk.setText(String .valueOf(amountVMCoffiesWithMilk));
                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                        }
                        else if(amountIncerted < 21) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnJuice:
                        if(amountIncerted >= 35 && amountVMJuices >= 1) {
                            amountIncerted -= 35;
                            amountVMJuices -= 1;
                            amountUserJuices += 1;
                            tvAmountUserJuices.setText(String .valueOf(amountUserJuices));
                            tvAmountVMJuices.setText(String .valueOf(amountVMJuices));
                            tvAmountIncerted.setText(String.valueOf(amountIncerted));
                        }
                        else if(amountIncerted < 35) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnGetChange:
                        int tempTens;
                        int tempFives;
                        int tempTwos;
                        int ost;
                        tempTens = amountIncerted/10;
                        amountUserTens += tempTens;
                        amountVMTens -= tempTens;
                        ost = amountIncerted%10;
                        tempFives = ost/5;
                        amountUserFives += tempFives;
                        amountVMFives -= tempFives;
                        ost = ost%5;
                        tempTwos = ost/2;
                        amountUserTwos += tempTwos;
                        amountVMTwos -= tempTwos;
                        ost = ost%2;
                        amountUserOnes += ost;
                        amountVMOnes -= ost;
                        amountIncerted = 0;

                        tvAmountUserOnes.setText(String .valueOf(amountUserOnes));
                        tvAmountUserTwos.setText(String .valueOf(amountUserTwos));
                        tvAmountUserFives.setText(String .valueOf(amountUserFives));
                        tvAmountUserTens.setText(String .valueOf(amountUserTens));
                        tvAmountIncerted.setText(String .valueOf(amountIncerted));
                        tvAmountVMTens.setText(String .valueOf(amountVMTens));
                        tvAmountVMFives.setText(String .valueOf(amountVMFives));
                        tvAmountVMTwos.setText(String .valueOf(amountVMTwos));
                        tvAmountVMOnes.setText(String .valueOf(amountVMOnes));
                        break;
                };
            }
        };
        btnIncertOne.setOnClickListener(listener);
        btnIncertTwo.setOnClickListener(listener);
        btnIncertFive.setOnClickListener(listener);
        btnIncertTen.setOnClickListener(listener);

        btnBuyTea.setOnClickListener(listener);
        btnBuyCoffie.setOnClickListener(listener);
        btnBuyCoffieWithMilk.setOnClickListener(listener);
        btnBuyJuice.setOnClickListener(listener);

        btnGetChange.setOnClickListener(listener);
    }
}
