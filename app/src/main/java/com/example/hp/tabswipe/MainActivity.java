package com.example.hp.tabswipe;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private Toolbar tb1;
    private TabLayout tablyot;
    private ViewPager vp;
    private myadpter mtadpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb1 = (Toolbar) findViewById(R.id.toolbar);
        tablyot = (TabLayout) findViewById(R.id.tablayout);
        vp = (ViewPager) findViewById(R.id.view);

        setSupportActionBar(tb1);
        //Adding Tabs inside tablayout
        tablyot.addTab(tablyot.newTab().setText("Tab one"));
        tablyot.addTab(tablyot.newTab().setText("Tab 2nd"));
        tablyot.addTab(tablyot.newTab().setText("Tab 3rd"));

        mtadpt = new myadpter(getSupportFragmentManager(), tablyot.getTabCount());  //3 parameters take
        vp.setAdapter(mtadpt);
        //Event handling
        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablyot));
        tablyot.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
