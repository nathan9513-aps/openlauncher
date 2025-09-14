package com.nononsenseapps.filepicker;

import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String getPathFromUri(Context ctx, Uri uri) {
        return uri != null ? uri.toString() : null;
    }

    public static java.util.List<Uri> getSelectedFilesFromResult(Intent data) {
        // Minimal stub: try to return single data URI if present
        List<Uri> out = new ArrayList<>();
        if (data == null) return out;
        Uri u = data.getData();
        if (u != null) out.add(u);
        return out;
    }

    public static java.io.File getFileForUri(Uri uri) {
        if (uri == null) return null;
        return new java.io.File(uri.getPath() != null ? uri.getPath() : uri.toString());
    }
}
