package io.codetail.animation;

import android.animation.Animator;
import android.view.View;

public class ViewAnimationUtils {
    public static Animator createCircularReveal(View v, int cx, int cy, float start, float end) { return null; }
}
package io.codetail.animation;

import android.animation.Animator;
import android.view.View;

public class ViewAnimationUtils {
    public static Animator createCircularReveal(View view, int centerX, int centerY, float startRadius, float endRadius) {
        // Return a no-op animator to satisfy compile; real animation not needed in CI
        return new Animator() {
            @Override public void start() {}
            @Override public void cancel() {}
            @Override public void end() {}
            @Override public long getStartDelay() { return 0; }
            @Override public void setStartDelay(long startDelay) {}
            @Override public android.animation.Animator setDuration(long duration) { return this; }
            @Override public long getDuration() { return 0; }
            @Override public void addListener(Listener listener) {}
            @Override public void removeListener(Listener listener) {}
            @Override public Animator.AnimatorListener[] getListeners() { return new Animator.AnimatorListener[0]; }
        };
    }
}
