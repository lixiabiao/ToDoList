package com.tigger.android.todolist.tasks;

import com.tigger.android.todolist.data.DataRepository;
import com.tigger.android.todolist.data.Task;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/14.
 */

public class TaskItemPresenter implements TaskItemsContract.Presenter {
    private DataRepository mDataRepository;
    private TaskItemsContract.View mView;

    public TaskItemPresenter(TaskItemsContract.View view) {
        mDataRepository = DataRepository.getInstance();
        mView = view;
    }

    @Override
    public void loadAllTasks() {
        List<Task> tasks = mDataRepository.getAllTasks();
        mView.showAllTasks(tasks);
    }

    @Override
    public void start() {
        loadAllTasks();
    }
}
