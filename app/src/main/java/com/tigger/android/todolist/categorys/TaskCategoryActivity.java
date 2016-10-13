package com.tigger.android.todolist.categorys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tigger.android.todolist.R;

public class TaskCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_category);

        Fragment fragment;
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragment = fragmentManager.findFragmentById(R.id.task_category_container);
        if (fragment == null) {
            fragment = new TaskCategoryFragment();
            fragmentManager.beginTransaction().add(R.id.task_category_container, fragment).commit();
        }

    }
}
