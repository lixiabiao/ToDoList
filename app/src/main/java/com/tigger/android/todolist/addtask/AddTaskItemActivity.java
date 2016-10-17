package com.tigger.android.todolist.addtask;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.tigger.android.todolist.base.SingleFragmentActivity;

public class AddTaskItemActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AddTaskItemFragment();
    }
}
