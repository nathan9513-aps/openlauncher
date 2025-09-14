package com.mikepenz.fastadapter;

import androidx.recyclerview.widget.RecyclerView;

public abstract class FastAdapter<T extends IItem> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements IAdapter<T> {
    @Override
    public java.util.List<T> getAdapterItems() { return java.util.Collections.emptyList(); }
}
