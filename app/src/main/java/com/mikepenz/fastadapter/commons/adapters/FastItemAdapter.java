package com.mikepenz.fastadapter.commons.adapters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.listeners.OnClickListener;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FastItemAdapter<T extends IItem> extends FastAdapter<T> {
    private final List<T> items = new ArrayList<>();

    public FastItemAdapter() { }

    public T getAdapterItem(int pos) { return items.get(pos); }
    public List<T> getAdapterItems() { return items; }
    public void setAdapterItems(List<T> items) { this.items.clear(); this.items.addAll(items); }
    public void set(List<T> items) { setAdapterItems(items); }
    public int getAdapterItemCount() { return items.size(); }

    public void notifyAdapterItemChanged(int pos) { /* no-op for stub */ }

    public void withOnClickListener(OnClickListener<T> listener) { /* no-op for stub */ }

    public ItemFilter getItemFilter() { return new ItemFilter(); }

    public static class ItemFilter {
        public <I> ItemFilter withFilterPredicate(Predicate<I> p) { return this; }
    }

    @Override
    public int getItemCount() { return items.size(); }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { return null; }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) { }
}
