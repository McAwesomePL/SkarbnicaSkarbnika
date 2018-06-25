package com.pureawesomness.skarbnicaskarbnika;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements TabOneFragment.OnFragmentInteractionListener,
        TabTwoFragment.OnFragmentInteractionListener,
        TabThreeFragment.OnFragmentInteractionListener {

    private BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new TabOneFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new TabTwoFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    getFragmentManager().beginTransaction().replace(R.id.fragment_container, new TabThreeFragment()).commit();
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }
            getFragmentManager().beginTransaction().add(R.id.fragment_container, new TabOneFragment()).commit();
        }
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}
