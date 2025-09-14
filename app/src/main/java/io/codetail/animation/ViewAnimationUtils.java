package io.codetail.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

public class ViewAnimationUtils {
    /**
     * Minimal stub replacement for the io.codetail circular reveal helper.
     * Returns a ValueAnimator as a no-op placeholder for CI/build purposes.
     */
    public static Animator createCircularReveal(View view, int centerX, int centerY, float startRadius, float endRadius) {
        ValueAnimator a = ValueAnimator.ofFloat(startRadius, endRadius);
        a.setDuration(300);
        return a;
    }
}
