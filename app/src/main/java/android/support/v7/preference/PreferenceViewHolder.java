package android.support.v7.preference;

/** Public shim to match android.support.v7.preference.PreferenceViewHolder API expected by app code */
public class PreferenceViewHolder extends androidx.preference.PreferenceViewHolder {
    public PreferenceViewHolder(android.view.View itemView) { super(itemView); }
}
