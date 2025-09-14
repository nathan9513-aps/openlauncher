package com.mikepenz.fastadapter_extensions.drag;

public interface ItemTouchCallback {
    boolean itemTouchOnMove(int oldPosition, int newPosition);
    void itemTouchDropped(int fromPosition, int toPosition);
}
