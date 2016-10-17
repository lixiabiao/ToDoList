package com.tigger.android.todolist.addtask;

import com.tigger.android.todolist.addcategory.AddCategoryContract;
import com.tigger.android.todolist.base.BasePresenter;
import com.tigger.android.todolist.base.BaseView;
import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.data.Task;

/**
 * Created by lixiabiao on 2016/10/14.
 */

public class AddTaskItemContract {
    interface Presenter extends BasePresenter {
        void saveTask(Task task);
    }

    interface View extends BaseView<Presenter> {
        void addTask();
    }
}
