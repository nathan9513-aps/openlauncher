package android.support.v4.app;

// Compatibility shim: extend AndroidX Fragment using fully-qualified name to avoid importing
// the same simple name which can cause duplicate-definition errors during compilation.
public class Fragment extends androidx.fragment.app.Fragment {
    // shim
}
