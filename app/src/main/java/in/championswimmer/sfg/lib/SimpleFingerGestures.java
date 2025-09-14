package in.championswimmer.sfg.lib;

import android.view.MotionEvent;
import android.view.View;

public class SimpleFingerGestures {
    private OnFingerGestureListener listener;

    public interface OnFingerGestureListener {
        void onSwipeUp();
        void onSwipeDown();
        void onSwipeLeft();
        void onSwipeRight();
        void onPress();
        void onRelease();
    }

    public void setOnFingerGestureListener(OnFingerGestureListener l) { this.listener = l; }

    public boolean onTouch(View v, MotionEvent event) { return false; }
}
