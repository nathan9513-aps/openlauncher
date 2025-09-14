package com.nononsenseapps.filepicker;

import android.content.Context;
import android.net.Uri;

public class Utils {
    public static String getPathFromUri(Context ctx, Uri uri) {
        return uri != null ? uri.toString() : null;
    }
}
