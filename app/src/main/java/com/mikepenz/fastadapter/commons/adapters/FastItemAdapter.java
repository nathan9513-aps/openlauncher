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

    public void add(T item) { this.items.add(item); }
    public void addAll(List<T> items) { this.items.addAll(items); }
    public void add(java.util.Collection<T> items) { this.items.addAll(items); }
    public void clear() { this.items.clear(); }

    public void notifyAdapterItemChanged(int pos) { /* no-op for stub */ }

    public void notifyAdapterDataSetChanged() { /* no-op for stub */ }

    public void withOnClickListener(OnClickListener<T> listener) { /* no-op for stub */ }

    public ItemFilter getItemFilter() { return new ItemFilter(); }

    public static class ItemFilter<T> {
        public ItemFilter<T> withFilterPredicate(com.mikepenz.fastadapter.IItemAdapter.Predicate<T> p) { return this; }
    }

    @Override
    public int getItemCount() { return items.size(); }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { return null; }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) { }
}
