package com.tigger.android.todolist.addtask;

import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.DataRepository;
import com.tigger.android.todolist.data.Task;
import com.tigger.android.todolist.tasks.TaskItemsContract;

/**
 * Created by lixiabiao on 2016/10/14.
 */

public class AddTaskItemPresenter implements AddTaskItemContract.Presenter {
    private DataRepository mDataRepository;
    private AddTaskItemContract.View mView;

    public AddTaskItemPresenter( AddTaskItemContract.View view) {
        mDataRepository = DataRepository.getInstance();
        mView = view;
    }


    @Override
    public void saveTask(Task task) {
        mDataRepository.addTask(task);
    }

    @Override
    public void start() {

    }
}
