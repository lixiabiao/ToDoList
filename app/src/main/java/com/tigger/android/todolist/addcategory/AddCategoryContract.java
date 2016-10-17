package com.tigger.android.todolist.addcategory;


import com.tigger.android.todolist.base.BasePresenter;
import com.tigger.android.todolist.base.BaseView;
import com.tigger.android.todolist.categorys.TaskCategoryContract;
import com.tigger.android.todolist.data.Category;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public interface AddCategoryContract {
    interface Presenter extends BasePresenter {
        void saveCategory(Category category);
    }

    interface View extends BaseView<Presenter> {
        void addCategory();
    }
}
