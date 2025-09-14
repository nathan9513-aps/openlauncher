package com.mikepenz.fastadapter;

public interface IItemAdapter<T extends IItem> {
    interface Predicate<T> {
        boolean filter(T item, CharSequence constraint);
    }

}
