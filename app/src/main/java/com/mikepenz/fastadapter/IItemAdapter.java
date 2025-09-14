package com.mikepenz.fastadapter;

public interface IItemAdapter<T extends IItem> {
    interface Predicate<T> {
        boolean apply(T item);
    }
}
