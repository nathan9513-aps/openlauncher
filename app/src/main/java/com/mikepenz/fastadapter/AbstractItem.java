package com.mikepenz.fastadapter;

import java.util.List;

/** Minimal AbstractItem stub matching the app's expected API surface */
public abstract class AbstractItem<Item extends IItem<Item, VH> , VH> implements IItem<Item, VH>, IClickable {
	private long identifier = -1;

	public long getIdentifier() { return identifier; }
	@SuppressWarnings("unchecked")
	public Item withIdentifier(long id) { this.identifier = id; return (Item) this; }

	public void bindView(VH holder, List<Object> payloads) { }
	public void unbindView(VH holder) { }
}
