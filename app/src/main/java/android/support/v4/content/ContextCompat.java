package android.support.v4.content;

public final class ContextCompat {
    private ContextCompat() {}
    public static int getColor(android.content.Context ctx, int id) {
        return androidx.core.content.ContextCompat.getColor(ctx, id);
    }
    public static android.graphics.drawable.Drawable getDrawable(android.content.Context ctx, int id) {
        return androidx.core.content.ContextCompat.getDrawable(ctx, id);
    }
}
