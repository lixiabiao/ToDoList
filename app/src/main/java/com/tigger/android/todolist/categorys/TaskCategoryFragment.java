package com.tigger.android.todolist.categorys;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tigger.android.todolist.R;

public class TaskCategoryFragment extends Fragment {
    private RecyclerView taskCategoryRecyclerView;


    public TaskCategoryFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task_category, container, false);
        taskCategoryRecyclerView = (RecyclerView) view.findViewById(R.id.task_catetory_recycler_view);
        taskCategoryRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        TaskCategoryAdapter adapter = new TaskCategoryAdapter(getContext());
        taskCategoryRecyclerView.setAdapter(adapter);
        return view;
    }

}
