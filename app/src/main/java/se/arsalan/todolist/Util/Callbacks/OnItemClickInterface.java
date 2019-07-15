package se.arsalan.todolist.Util.Callbacks;

import android.support.v7.widget.RecyclerView;

public interface OnItemClickInterface {
    void onItemClicked(RecyclerView recyclerView, int position, RecyclerView.ViewHolder holder);
}