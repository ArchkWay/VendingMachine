package com.example.archek.vendingmachine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainFragment extends Fragment{
    private TextView tvAmountInserted;
    private TextView tvAmountVMTeas;
    private TextView tvAmountVMCoffees;
    private TextView tvAmountVMCoffeesWithMilk;
    private TextView tvAmountVMJuices;
    private TextView tvAmountUserCoffees;
    private TextView tvAmountUserTeas;
    private TextView tvAmountUserCoffeesWithMilk;
    private TextView tvAmountUserJuices;
    private TextView tvAmountUserOnes;
    private TextView tvAmountUserTwos;
    private TextView tvAmountUserFives;
    private TextView tvAmountUserTens;
    private TextView tvAmountVMOnes;
    private TextView tvAmountVMTwos;
    private TextView tvAmountVMFives;
    private TextView tvAmountVMTens;


    private Button btnBuyTea;
    private Button btnBuyCoffee;
    private Button btnBuyCoffeeWithMilk;
    private Button btnBuyJuice;
    private Button btnInsertOne;
    private Button btnInsertTwo;
    private Button btnInsertFive;
    private Button btnInsertTen;
    private Button btnGetChange;

    private int amountInserted;
    private int amountVMTeas;
    private int amountVMCoffees;
    private int amountVMCoffeesWithMilk;
    private int amountVMJuices;
    private int amountUserCoffees;
    private int amountUserTeas;
    private int amountUserCoffeesWithMilk;
    private int amountUserJuices;
    private int amountUserOnes;
    private int amountUserTwos;
    private int amountUserFives;
    private int amountUserTens;
    private int amountVMOnes;
    private int amountVMTwos;
    private int amountVMFives;
    private int amountVMTens;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate( R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){
        initiateSettings();
        initViews(view);
        fillingViews();
        logic();
    }

    private void initiateSettings(){
        /* flexible settings */
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        amountVMOnes = preferences.getInt(PrefsConst.SETTINGS_ONES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMTwos = preferences.getInt(PrefsConst.SETTINGS_TWOS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMFives = preferences.getInt(PrefsConst.SETTINGS_FIVES_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        amountVMTens = preferences.getInt(PrefsConst.SETTINGS_TENS_AMOUNT,PrefsConst.SETTING_DEFAULT_AMOUNT);
        /*preinstalled settings*/
        amountInserted = 0;
        amountVMTeas = 10;
        amountVMCoffees = 20;
        amountVMCoffeesWithMilk = 20;
        amountVMJuices = 15;
        amountUserCoffees = 0;
        amountUserTeas = 0;
        amountUserCoffeesWithMilk = 0;
        amountUserJuices = 0;
        amountUserOnes = 10;
        amountUserTwos = 30;
        amountUserFives = 20;
        amountUserTens = 15;
    }
    private void initViews(View view) {
        /*views*/
        tvAmountInserted = view.findViewById(R.id.tvAmountInserted);
        tvAmountVMTeas = view.findViewById(R.id.tvAmountVMTeas);
        tvAmountVMCoffees = view.findViewById(R.id.tvAmountVMCoffees);
        tvAmountVMCoffeesWithMilk = view.findViewById(R.id.tvAmountVMCoffeesWithMilk);
        tvAmountVMJuices = view.findViewById(R.id.tvAmountVMJuices);
        tvAmountUserCoffees = view.findViewById(R.id.tvCountCoffees);
        tvAmountUserTeas = view.findViewById(R.id.tvCountTeas);
        tvAmountUserCoffeesWithMilk = view.findViewById(R.id.tvCountCoffeesWithMilk);
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
        btnBuyCoffee = view.findViewById(R.id.btnCoffee);
        btnBuyCoffeeWithMilk = view.findViewById(R.id.btnCoffeeWithMilk);
        btnBuyJuice = view.findViewById(R.id.btnJuice);
        btnInsertOne = view.findViewById(R.id.btnInsertOne);
        btnInsertTwo = view.findViewById(R.id.btnInsertTwo);
        btnInsertFive = view.findViewById(R.id.btnInsertFive);
        btnInsertTen = view.findViewById(R.id.btnInsertTen);
        btnGetChange = view.findViewById(R.id.btnGetChange);
    }
    private void fillingViews(){
        /*filling*/
        tvAmountInserted.setText(String.valueOf(amountInserted));
        tvAmountVMTeas.setText(String.valueOf(amountVMTeas + "portions"));
        tvAmountVMCoffees.setText(String.valueOf(amountVMCoffees + "portions"));
        tvAmountVMCoffeesWithMilk.setText(String.valueOf(amountVMCoffeesWithMilk + "portions"));
        tvAmountVMJuices.setText(String.valueOf(amountVMJuices + "portions"));
        tvAmountUserCoffees.setText(String.valueOf(amountUserCoffees + "portions"));
        tvAmountUserTeas.setText(String.valueOf(amountUserTeas));
        tvAmountUserCoffeesWithMilk.setText(String.valueOf(amountUserCoffeesWithMilk));
        tvAmountUserJuices.setText(String.valueOf(amountUserJuices));
        tvAmountUserOnes.setText(String.valueOf(amountUserOnes));
        tvAmountUserTwos.setText(String.valueOf(amountUserTwos));
        tvAmountUserFives.setText(String.valueOf(amountUserFives));
        tvAmountUserTens.setText(String.valueOf(amountUserTens));
        tvAmountVMOnes.setText(String.valueOf(amountVMOnes));
        tvAmountVMTwos.setText(String.valueOf(amountVMTwos));
        tvAmountVMFives.setText(String.valueOf(amountVMFives));
        tvAmountVMTens.setText(String.valueOf(amountVMTens));
    }

    private void logic(){
        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id){
                    case R.id.btnInsertOne:
                        if(amountUserOnes >= 1) {
                            amountInserted += 1;
                            amountUserOnes -= 1;
                            amountVMOnes += 1;

                            tvAmountInserted.setText(String.valueOf(amountInserted));
                            tvAmountUserOnes.setText(String.valueOf(amountUserOnes));
                            tvAmountVMOnes.setText(String.valueOf(amountVMOnes));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnInsertTwo:
                        if(amountUserTwos >= 1) {
                            amountInserted += 2;
                            amountUserTwos -= 1;
                            amountVMTwos += 1;

                            tvAmountInserted.setText(String.valueOf(amountInserted));
                            tvAmountUserTwos.setText(String.valueOf(amountUserTwos));
                            tvAmountVMTwos.setText(String.valueOf(amountVMTwos));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnInsertFive:
                        if(amountUserFives >= 1) {
                            amountInserted += 5;
                            amountUserFives -= 1;
                            amountVMFives += 1;

                            tvAmountInserted.setText(String.valueOf(amountInserted));
                            tvAmountUserFives.setText(String.valueOf(amountUserFives));
                            tvAmountVMFives.setText(String.valueOf(amountVMFives));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnInsertTen:
                        if(amountUserTens >= 1) {
                            amountInserted += 10;
                            amountUserTens -= 1;
                            amountVMTens += 1;

                            tvAmountInserted.setText(String.valueOf(amountInserted));
                            tvAmountUserTens.setText(String.valueOf(amountUserTens));
                            tvAmountVMTens.setText(String.valueOf(amountVMTens));
                        }
                        else Toast.makeText(getContext(), R.string.not_coins, LENGTH_SHORT).show();
                        break;
                    case R.id.btnTea:
                        if(amountInserted >= 13 && amountVMTeas >= 1) {
                            amountInserted -= 13;
                            amountVMTeas -= 1;
                            amountUserTeas += 1;
                            tvAmountUserTeas.setText(String .valueOf(amountUserTeas));
                            tvAmountVMTeas.setText(String .valueOf(amountVMTeas));
                            tvAmountInserted.setText(String.valueOf(amountInserted));
                        }
                        else if(amountInserted < 13) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnCoffee:
                        if(amountInserted >= 18 && amountVMCoffees >= 1) {
                            amountInserted -= 18;
                            amountVMCoffees -= 1;
                            amountUserCoffees += 1;
                            tvAmountUserCoffees.setText(String .valueOf(amountUserCoffees));
                            tvAmountVMCoffees.setText(String .valueOf(amountVMCoffees) + "portions");
                            tvAmountInserted.setText(String.valueOf(amountInserted));
                        }
                        else if(amountInserted < 18) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnCoffeeWithMilk:
                        if(amountInserted >= 21 && amountVMCoffeesWithMilk >= 1) {
                            amountInserted -= 21;
                            amountVMCoffeesWithMilk -= 1;
                            amountUserCoffeesWithMilk += 1;
                            tvAmountUserCoffeesWithMilk.setText(String .valueOf(amountUserCoffeesWithMilk));
                            tvAmountVMCoffeesWithMilk.setText(String .valueOf(amountVMCoffeesWithMilk) + "portions");
                            tvAmountInserted.setText(String.valueOf(amountInserted));
                        }
                        else if(amountInserted < 21) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnJuice:
                        if(amountInserted >= 35 && amountVMJuices >= 1) {
                            amountInserted -= 35;
                            amountVMJuices -= 1;
                            amountUserJuices += 1;
                            tvAmountUserJuices.setText(String .valueOf(amountUserJuices));
                            tvAmountVMJuices.setText(String .valueOf(amountVMJuices) + "portions");
                            tvAmountInserted.setText(String.valueOf(amountInserted));
                        }
                        else if(amountInserted < 35) {
                            Toast.makeText(getContext(), R.string.more_coins, LENGTH_SHORT).show();
                        }
                        else Toast.makeText(getContext(), R.string.no_drink, LENGTH_SHORT).show();
                        break;
                    case R.id.btnGetChange:
                        int tempTens;
                        int tempFives;
                        int tempTwos;
                        int ost;
                        tempTens = amountInserted/10;
                        amountUserTens += tempTens;
                        amountVMTens -= tempTens;
                        ost = amountInserted%10;
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
                        amountInserted = 0;

                        tvAmountUserOnes.setText(String.valueOf(amountUserOnes));
                        tvAmountUserTwos.setText(String.valueOf(amountUserTwos));
                        tvAmountUserFives.setText(String.valueOf(amountUserFives));
                        tvAmountUserTens.setText(String.valueOf(amountUserTens));
                        tvAmountInserted.setText(String.valueOf(amountInserted));
                        tvAmountVMTens.setText(String.valueOf(amountVMTens));
                        tvAmountVMFives.setText(String.valueOf(amountVMFives));
                        tvAmountVMTwos.setText(String.valueOf(amountVMTwos));
                        tvAmountVMOnes.setText(String.valueOf(amountVMOnes));
                        break;
                }
            }
        };
        btnInsertOne.setOnClickListener(listener);
        btnInsertTwo.setOnClickListener(listener);
        btnInsertFive.setOnClickListener(listener);
        btnInsertTen.setOnClickListener(listener);
        btnBuyTea.setOnClickListener(listener);
        btnBuyCoffee.setOnClickListener(listener);
        btnBuyCoffeeWithMilk.setOnClickListener(listener);
        btnBuyJuice.setOnClickListener(listener);
        btnGetChange.setOnClickListener(listener);
    }

}
