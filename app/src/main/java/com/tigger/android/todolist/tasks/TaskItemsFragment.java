package com.tigger.android.todolist.tasks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.addtask.AddTaskItemActivity;
import com.tigger.android.todolist.categorys.TaskCategoryAdapter;
import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.Task;

import java.util.List;

public class TaskItemsFragment extends Fragment implements TaskItemsContract.View{
    private static final String TAG = TaskItemsFragment.class.getSimpleName();
    private String mCategory;
    private TaskItemsAdapter mTaskItemsAdapter;
    private TaskItemsContract.Presenter mPresenter;
    private FloatingActionButton mAddTaskItemFab;

    public TaskItemsFragment() {
        mPresenter = new TaskItemPresenter(this);
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
        // Inflate the layout for this fragment
        Log.d(TAG,mCategory);
        View view = inflater.inflate(R.layout.fragment_task_items, container, false);
        RecyclerView mTaskItemRecyclerView = (RecyclerView) view.findViewById(R.id.task_items_recycycler_view);
        mTaskItemRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mTaskItemsAdapter = new TaskItemsAdapter(getContext());
        mTaskItemRecyclerView.setAdapter(mTaskItemsAdapter);
        mAddTaskItemFab = (FloatingActionButton) view.findViewById(R.id.add_task_item_fab);
        mAddTaskItemFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddTaskItemActivity.class);
                intent.putExtra(TaskCategoryAdapter.KEY_CATEGORY,mCategory);
                startActivity(intent);
            }
        });
        mPresenter.start();
        return view;
    }


    @Override
    public void showAllTasks(List<Task> tasks) {
        mTaskItemsAdapter.setTasks(tasks);

    }

    @Override
    public void setPresenter(TaskItemsContract.Presenter presenter) {
        mPresenter = presenter;

    }
}
