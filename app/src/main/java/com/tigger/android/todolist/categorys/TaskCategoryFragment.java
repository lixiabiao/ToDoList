package com.tigger.android.todolist.categorys;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tigger.android.todolist.BasePresenter;
import com.tigger.android.todolist.BaseView;
import com.tigger.android.todolist.R;
import com.tigger.android.todolist.addcategory.AddCategoryActivity;
import com.tigger.android.todolist.data.Category;

import java.util.List;

public class TaskCategoryFragment extends Fragment implements TaskCategoryContract.View {
    private static final String TAG = TaskCategoryFragment.class.getSimpleName();
    private RecyclerView taskCategoryRecyclerView;
    private FloatingActionButton mAddCategoryFab;
    private TaskCategoryContract.Presenter mPresenter;
    private TaskCategoryAdapter mAdapter;


    public TaskCategoryFragment() {
        mPresenter = new TaskCategoryPresenter(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task_category, container, false);
        taskCategoryRecyclerView = (RecyclerView) view.findViewById(R.id.task_catetory_recycler_view);
        taskCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new TaskCategoryAdapter(getContext());
        taskCategoryRecyclerView.setAdapter(mAdapter);
        mAddCategoryFab = (FloatingActionButton) view.findViewById(R.id.add_task_category_fab);
        mAddCategoryFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoAddCategoryActivity();
            }
        });
        mPresenter.start();
        return view;
    }

    @Override
    public void setPresenter(TaskCategoryContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showAllCategories(List<Category> categories) {
        mAdapter.setCategories(categories);
    }

    @Override
    public void gotoAddCategoryActivity() {
        Intent intent = new Intent(getActivity(), AddCategoryActivity.class);
        startActivity(intent);
    }
}
