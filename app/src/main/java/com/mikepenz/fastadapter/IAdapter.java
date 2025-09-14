package com.mikepenz.fastadapter;

import java.util.List;

public interface IAdapter<T extends IItem> {
    List<T> getAdapterItems();
}
