package com.tigger.android.todolist.addtask;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.addcategory.AddCategoryContract;
import com.tigger.android.todolist.categorys.TaskCategoryAdapter;
import com.tigger.android.todolist.data.Task;


public class AddTaskItemFragment extends Fragment implements AddTaskItemContract.View {
    private static final String TAG = AddTaskItemFragment.class.getSimpleName();
    private String mCategory;
    private EditText mAddTaskEditText;
    private Button mAddTaskButton;
    private AddTaskItemContract.Presenter mAddTaskItemPresenter;


    public AddTaskItemFragment() {
        mAddTaskItemPresenter = new AddTaskItemPresenter(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getActivity().getIntent();
        mCategory = intent.getStringExtra(TaskCategoryAdapter.KEY_CATEGORY);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_task_item, container, false);
        mAddTaskEditText = (EditText) view.findViewById(R.id.add_task_item_edit_text);
        mAddTaskEditText.setText(mCategory);
        Log.d(TAG,mCategory);
        mAddTaskButton = (Button) view.findViewById(R.id.add_task_item_button);
        mAddTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTask();
                getActivity().finish();
            }
        });
        return view;
    }


    @Override
    public void addTask() {
        String taskTitle = mAddTaskEditText.getText().toString();
        Task task = new Task();
        task.setTitle(taskTitle);
        task.setCategory(mCategory);
        mAddTaskItemPresenter.saveTask(task);
    }

    @Override
    public void setPresenter(AddTaskItemContract.Presenter presenter) {
        mAddTaskItemPresenter = presenter;

    }
}
