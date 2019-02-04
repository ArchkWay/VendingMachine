package com.example.archek.vendingmachine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (savedInstanceState == null) {
            replaceFragment(new MainFragment());
        }
    }

    public boolean onCreateOptionsMenu(Menu item) {
        getMenuInflater().inflate(R.menu.menu_activity_main, item);
        return true;
    }

    private void createFragment(int itemId) {
        final Fragment fragment;
        switch (itemId) {
            case R.id.main:
                fragment = new MainFragment();
                break;
            case R.id.settings:
                fragment = new SettingsFragment();
                break;
            default:
                fragment = new Fragment();
                break;
        }
        replaceFragment(fragment);
    }

    private void replaceFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.main:
                createFragment(R.id.main);
                return true;
            case R.id.settings:
                createFragment(R.id.settings);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}



