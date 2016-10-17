package com.tigger.android.todolist.tasks;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tigger.android.todolist.base.SingleFragmentActivity;

public class TaskItemsActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new TaskItemsFragment();
    }
}
