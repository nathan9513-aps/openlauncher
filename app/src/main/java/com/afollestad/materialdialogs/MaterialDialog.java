package com.afollestad.materialdialogs;

import android.content.Context;
import android.view.View;

public class MaterialDialog {
    public interface SingleButtonCallback {
        void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which);
    }

    public interface ListCallback {
        void onSelection(MaterialDialog dialog, View itemView, int position, CharSequence text);
    }

    public interface InputCallback {
        void onInput(@NonNull MaterialDialog dialog, CharSequence input);
    }

    public static class Builder {
        private final Context ctx;

        public Builder(Context c) { this.ctx = c; }

        public Builder title(CharSequence t) { return this; }
        public Builder content(CharSequence c) { return this; }
        public Builder positiveText(CharSequence p) { return this; }
        public Builder negativeText(CharSequence n) { return this; }
        public Builder items(int resId) { return this; }
        public Builder items(CharSequence[] items) { return this; }
        public Builder itemsCallback(ListCallback cb) { return this; }
        public Builder adapter(Object adapter, Object layoutManager) { return this; }
        public Builder input(CharSequence hint, CharSequence prefill, InputCallback cb) { return this; }
        public Builder onPositive(SingleButtonCallback cb) { return this; }
        public MaterialDialog build() { return new MaterialDialog(); }
        public MaterialDialog show() { return build(); }
    }

    public static class DialogAction {}

}
