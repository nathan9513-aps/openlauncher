package com.mikepenz.fastadapter;

import java.util.List;

/** Minimal AbstractItem stub matching the app's expected API surface */
public abstract class AbstractItem<T extends IItem, VH> implements IItem, IClickable {
	private long identifier = -1;

	public long getIdentifier() { return identifier; }

	@SuppressWarnings("unchecked")
	public T withIdentifier(long id) { this.identifier = id; return (T) this; }

	public void bindView(VH holder, List<Object> payloads) { }
	public void unbindView(VH holder) { }

	// new methods commonly used by concrete items
	public ViewHolderFactory<VH> getViewHolderFactory() { return null; }

	// marker interface for factories (keeps the API surface minimal)
	public interface ViewHolderFactory<VH> { VH create(android.view.View v); }

	// Methods commonly overridden by concrete items in the app
	public abstract int getLayoutRes();
	public abstract int getType();
	public abstract VH getViewHolder(android.view.View v);
}
