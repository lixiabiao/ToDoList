package com.tigger.android.todolist.tasks;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tigger.android.todolist.R;
import com.tigger.android.todolist.categorys.TaskCategoryAdapter;
import com.tigger.android.todolist.data.Task;

import java.util.List;

/**
 * Created by lixiabiao on 2016/10/14.
 */

public class TaskItemsAdapter extends RecyclerView.Adapter<TaskItemsAdapter.ViewHolder> {
   private List<Task> tasks;
    private Context mContext;
    private TextView titleView;

    public TaskItemsAdapter(Context context) {
        mContext = context;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
        this.notifyDataSetChanged();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(android.R.layout.simple_list_item_1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindTask(tasks.get(position));

    }


    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            titleView = (TextView) itemView;
        }

        public void bindTask(Task task) {
            titleView.setText(task.getTitle());
        }
    }


}
