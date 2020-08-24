package com.example.newwechat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {

    TextView tv;

    ViewPager viewPager;
    List<View> lsViews = new ArrayList<>();
    MyPagerAdapter pagerAdapter;
    RadioButton rb1, rb2, rb3, rb4;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager = findViewById(R.id.viewpager);
        radioGroup = findViewById(R.id.main_rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);

        rb1.setChecked(true);

        lsViews.add(getLayoutInflater().inflate(R.layout.page_weixin, null, false));
        lsViews.add(getLayoutInflater().inflate(R.layout.page_tongxun, null, false));
        lsViews.add(getLayoutInflater().inflate(R.layout.page_found, null, false));
        lsViews.add(getLayoutInflater().inflate(R.layout.page_me, null, false));

        pagerAdapter = new MyPagerAdapter(lsViews);
        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //选中ViewPage页的时候触发该事件
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        rb1.setChecked(true);
                        break;
                    case 1:
                        rb2.setChecked(true);
                        break;
                    case 2:
                        rb3.setChecked(true);
                        break;
                    case 3:
                        rb4.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置Button选中的时候切换ViewPager
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.rb2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.rb3:
                          viewPager.setCurrentItem(2);
                        break;
                    case R.id.rb4:
                        viewPager.setCurrentItem(3);
                        break;
                }
            }
        });
        tv =findViewById(R.id.hm);
        Intent intent = getIntent();
        String regInfo = intent.getStringExtra("regInfo");
        tv.setText(regInfo);


    }
}