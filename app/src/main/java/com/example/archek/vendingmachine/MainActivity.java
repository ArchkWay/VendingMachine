package com.example.archek.vendingmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvAmountIncerted;
    TextView tvAmountVMTeas;
    TextView tvAmountVMCoffies;
    TextView tvAmountVMCoffiesWithMilk;
    TextView tvAmountVMJuices;
    TextView tvCountCoffies;
    TextView tvCountTeas;
    TextView tvCountCoffiesWithMilk;
    TextView tvCountJuices;
    TextView tvCountOnes;
    TextView tvCountTwos;
    TextView tvCountFives;
    TextView tvCountTens;
    TextView tvVMCoinOnes;
    TextView tvVMCoinTwos;
    TextView tvVMCoinFives;
    TextView tvVMCoinTens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAmountIncerted = findViewById(R.id.tvAmountIncerted);
        tvAmountVMTeas = findViewById(R.id.tvAmountVMTeas);
        tvAmountVMCoffies = findViewById(R.id.tvAmountVMCoffies);
        tvAmountVMCoffiesWithMilk = findViewById(R.id.tvAmountVMCoffiesWithMilk);
        tvAmountVMJuices = findViewById(R.id.tvAmountVMJuices);
        tvCountCoffies = findViewById(R.id.tvCountCoffies);
        tvCountTeas = findViewById(R.id.tvCountTeas);
        tvCountCoffiesWithMilk = findViewById(R.id.tvCountCoffiesWithMilk);
        tvCountJuices = findViewById(R.id.tvCountJuices);
        tvCountOnes = findViewById(R.id.tvCountOnes);
        tvCountTwos = findViewById(R.id.tvCountTwos);
        tvCountFives = findViewById(R.id.tvCountFives);
        tvCountTens = findViewById(R.id.tvCountTens);
        tvVMCoinOnes = findViewById(R.id.tvVMCoinOnes);
        tvVMCoinTwos = findViewById(R.id.tvVMCoinTwos);
        tvVMCoinFives = findViewById(R.id.tvVMCoinFives);
        tvVMCoinTens = findViewById(R.id.tvVMCoinTens);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }

    }
}
