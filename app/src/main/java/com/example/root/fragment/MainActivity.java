package com.example.root.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    private SecondFragment mSecFrag;
    private ThirdFragment mThirdFrag;
    private FragmentManager mFragManager;
    private FragmentTransaction mFragTransaction;
    private FirstFragment mFirstFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSecFrag=new SecondFragment();
        mThirdFrag=new ThirdFragment();
        mFragManager=getFragmentManager();
        mFirstFrag=(FirstFragment)mFragManager.findFragmentById(R.id.fragment);
        mFragTransaction=mFragManager.beginTransaction();
        mFragTransaction.add(R.id.myframe,mSecFrag);
        mFragTransaction.commit();
    }

    public void change() {
        mFragTransaction=mFragManager.beginTransaction();
        if (mSecFrag.isResumed())
        {
            mThirdFrag=new ThirdFragment();
            mFragTransaction.replace(R.id.myframe,mThirdFrag);
        }
        else
        {
            mSecFrag=new SecondFragment();
            mFragTransaction.replace(R.id.myframe,mSecFrag);
        }

        mFragTransaction.addToBackStack(null);
        mFragTransaction.commit();


    }

    public void send(String s) {
        if (mSecFrag.isResumed())
        {
            mSecFrag.send(s);
        }
        else
        {
            mThirdFrag.send(s);
        }

    }

    public void sendPhone(String s) {
        mFirstFrag.sendPhone(s);
    }

    public void sendAddress(String s) {
        mFirstFrag.sendAddress(s);
    }
}
