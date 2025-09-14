package com.mikepenz.fastadapter;

public interface IItem<Item extends IItem<Item, ? extends Object>, VH> {
	long getIdentifier();
}
