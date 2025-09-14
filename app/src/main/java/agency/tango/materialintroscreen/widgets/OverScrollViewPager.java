package agency.tango.materialintroscreen.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;

public class OverScrollViewPager extends androidx.viewpager.widget.ViewPager {
    public OverScrollViewPager(Context ctx) { super(ctx); }
    public OverScrollViewPager(Context ctx, AttributeSet attrs) { super(ctx, attrs); }
    public SwipeableViewPager getOverScrollView() { return (SwipeableViewPager) this; }
}
