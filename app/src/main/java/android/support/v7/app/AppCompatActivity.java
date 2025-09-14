package android.support.v7.app;

import android.os.Bundle;

// Compatibility shim: extend AndroidX AppCompatActivity using fully-qualified name to avoid
// importing the same simple name which causes a duplicate-definition in the compilation unit.
public class AppCompatActivity extends androidx.appcompat.app.AppCompatActivity {
    public AppCompatActivity() { super(); }
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }
}
