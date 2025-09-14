package com.turingtechnologies.materialscrollbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class DragScrollBar extends View {
    public DragScrollBar(Context ctx) { super(ctx); }
    public DragScrollBar(Context ctx, AttributeSet attrs) { super(ctx, attrs); }
    public void setIndicator(AlphabetIndicator ind, boolean showAtCenter) { }
    public void setClipToPadding(boolean v) { }
    public void setDraggableFromAnywhere(boolean v) { }
    public void setHandleColor(int c) { }
}
