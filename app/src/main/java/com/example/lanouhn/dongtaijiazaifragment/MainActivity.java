package com.example.lanouhn.dongtaijiazaifragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lanouhn.dongtaijiazaifragment.fragmengts.FragmentBase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;
    List<Fragment> list;
    String [] fragmentlist = {"1","2","1","1","1","1","1","1","1","1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager= (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(fspa);
        list= new ArrayList<>();
        /**
         * 循环遍历添加
         */
        String id = "id";
        for (int i = 0; i < fragmentlist.length; i++) {

            list.add(new FragmentBase().newInstanse(id));
        }
        /***
         * 一个一个的添加
         */
       // list.add(new Fragment());

    }


    FragmentStatePagerAdapter fspa= new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    };
}
