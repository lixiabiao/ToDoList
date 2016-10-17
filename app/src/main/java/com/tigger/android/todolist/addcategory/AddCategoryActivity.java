package com.tigger.android.todolist.addcategory;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.base.SingleFragmentActivity;
import com.tigger.android.todolist.data.DataRepository;

public class AddCategoryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AddCategoryFragment();
    }
}
