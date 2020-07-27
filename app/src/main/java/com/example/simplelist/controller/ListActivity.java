package com.example.simplelist.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.simplelist.fragment.ListFragment;

public class ListActivity extends SingleActivity {

    public static final String EXTRA_KEY_NAME_STRING = "com.example.simplelist.nameString";
    public static final String EXTRA_KEY_LIST_COUNT = "com.example.simplelist.listCount";

    public static Intent newIntent(Context context , String name, int count){
        Intent intent = new Intent(context ,ListActivity.class);
        intent.putExtra(EXTRA_KEY_NAME_STRING,name);
        intent.putExtra(EXTRA_KEY_LIST_COUNT,count);
        return intent;
    }

    @Override
    public Fragment createFragment() {
        return ListFragment.newInstance();
    }
}