package android.support.v4.app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class FragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    public FragmentPagerAdapter(FragmentManager fm) { super(fm); }
    public FragmentPagerAdapter(FragmentManager fm, int behavior) { super(fm, behavior); }
}
