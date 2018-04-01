package com.example.kojitak.myfragmentsample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
    }

    /**
     * MainActivityの上にMenuFragmentがある
     * fragment_menu.xmlで指定されているonClickUserInfoが押されると呼ばれる
     */
    public void onClickUserInfo(View view) {
        //UserInfoFragmentの生成
        Fragment fragment = new UserInfoFragment();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //R.id.contentsには初期では「menuFrame」が表示されている
        //replaceすることで、R.id.contentsに表示されているものを置き換える
        transaction.replace(R.id.contents,fragment );
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void onClickColor(View view) {
        Fragment fragment = new ColorFragment();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contents,fragment );
        transaction.addToBackStack(null);
        transaction.commit();
    }

//    public void onClickDrink(View view) {
//        Fragment fragment = new DrinkFragment();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.contents,fragment );
//        transaction.addToBackStack(null);
//        transaction.commit();
//
//    }
//
//    public void onClickFood(View view) {
//        Fragment fragment = new FoodFragment();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.contents,fragment );
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}
