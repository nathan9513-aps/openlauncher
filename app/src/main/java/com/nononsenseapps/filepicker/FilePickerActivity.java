package com.nononsenseapps.filepicker;

import android.app.Activity;
import android.os.Bundle;

public class FilePickerActivity extends Activity {
    public static final String EXTRA_ALLOW_CREATE_DIR = "EXTRA_ALLOW_CREATE_DIR";
    public static final String EXTRA_MODE = "EXTRA_MODE";
    public static final int MODE_DIR = 1;
    public static final int MODE_FILE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Minimal stub: no UI — finish immediately to avoid runtime issues in CI tests
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
