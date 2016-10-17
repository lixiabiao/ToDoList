package com.tigger.android.todolist.categorys;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tigger.android.todolist.data.Category;
import com.tigger.android.todolist.tasks.TaskItemsActivity;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/13.
 */

public class TaskCategoryAdapter extends RecyclerView.Adapter<TaskCategoryAdapter.ViewHolder> {
    private List<Category> categories;
    private Context context;
    public static final String  KEY_CATEGORY = "category";

    public TaskCategoryAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
        this.notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindCategory(categories.get(position));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleView = (TextView) itemView;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Category category = categories.get(getAdapterPosition());
                    String cagetoryName = category.getTitle();
                    Intent intent = new Intent(context, TaskItemsActivity.class);
                    intent.putExtra(KEY_CATEGORY, cagetoryName);
                    context.startActivity(intent);
                }
            });
        }

        public void bindCategory(Category category) {
            titleView.setText(category.getTitle());
        }
    }
}
