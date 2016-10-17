package com.tigger.android.todolist.tasks;

import com.tigger.android.todolist.base.BasePresenter;
import com.tigger.android.todolist.base.BaseView;
import com.tigger.android.todolist.categorys.TaskCategoryContract;
import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.Task;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/14.
 */

public class TaskItemsContract {
    interface Presenter extends BasePresenter {
        void loadAllTasks();
    }

    interface View extends BaseView<TaskItemsContract.Presenter> {
        void showAllTasks(List<Task> tasks);
    }
}
