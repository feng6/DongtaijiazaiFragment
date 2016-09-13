package com.example.lanouhn.dongtaijiazaifragment.fragmengts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.lanouhn.dongtaijiazaifragment.R;

/**
 * Created by lanouhn on 2016/9/13.
 */
public class FragmentBase extends Fragment {
    /**
     *
     * @param id  要传递的值
     * @return   其他地方接受的对象，带值，可以穿多个值
     * (String id,...,....)
     *   bundle.putString("id",id);
     *    bundle.putString("id",id);
     */
    public static FragmentBase newInstanse(String id){
        FragmentBase FB = new FragmentBase();
        Bundle bundle=new Bundle();
        bundle.putString("id",id);
        FB.setArguments(bundle);
        return FB;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base,container,false);

        /**
         * 获取fragments
         * getBundle
         */
        Bundle bundle=getArguments();
        String id = bundle.getString("id");

        return  view;
    }
}
