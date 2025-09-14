package com.mikepenz.fastadapter.listeners;

import android.view.View;
import com.mikepenz.fastadapter.IItem;

/**
 * Listener signature matching the usage in the app:
 * boolean onClick(View v, IAdapter<T> adapter, T item, int position)
 */
public interface OnClickListener<T extends IItem> {
    boolean onClick(View v, com.mikepenz.fastadapter.IAdapter<T> adapter, T item, int position);
}
