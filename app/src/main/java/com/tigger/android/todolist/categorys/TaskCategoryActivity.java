package com.tigger.android.todolist.categorys;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.base.SingleFragmentActivity;

public class TaskCategoryActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new TaskCategoryFragment();
    }
}
