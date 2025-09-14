package io.codetail.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

public class ViewAnimationUtils {
    public static Animator createCircularReveal(View view, int centerX, int centerY, float startRadius, float endRadius) {
        // Return a simple ValueAnimator as a no-op substitute for the circular reveal animation
        ValueAnimator a = ValueAnimator.ofFloat(startRadius, endRadius);
        a.setDuration(300);
        return a;
    }
}
