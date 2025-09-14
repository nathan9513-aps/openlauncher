package in.championswimmer.sfg.lib;

import android.view.MotionEvent;
import android.view.View;

public class SimpleFingerGestures {
    private OnFingerGestureListener listener;

    public interface OnFingerGestureListener {
        boolean onSwipeUp(int fingers, long time, double distance);
        boolean onSwipeDown(int fingers, long time, double distance);
        boolean onSwipeLeft(int fingers, long time, double distance);
        boolean onSwipeRight(int fingers, long time, double distance);
        boolean onPinch(int fingers, long time, double distance);
        boolean onUnpinch(int fingers, long time, double distance);
        boolean onDoubleTap(int fingers);
        boolean onPress();
        boolean onRelease();
    }

    public void setOnFingerGestureListener(OnFingerGestureListener l) { this.listener = l; }

    public boolean onTouch(View v, MotionEvent event) { return false; }
}
