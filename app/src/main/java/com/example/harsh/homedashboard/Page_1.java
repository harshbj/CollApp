package com.example.harsh.homedashboard;

/**
 * Created by HARSH on 3/25/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by haade on 13/09/2017.
 */

public class Page_1 extends Fragment {

    //Constructor default
    public Page_1(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageOne = inflater.inflate(R.layout.page1, container, false);



        return PageOne;
    }
}
