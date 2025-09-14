package android.support.v7.preference;

/** Lightweight compatibility shim that provides the minimal API used by the app.
 *  Avoids extending AndroidX PreferenceViewHolder to prevent inaccessible-super-constructor issues.
 */
public class PreferenceViewHolder {
    private final android.view.View itemView;

    public PreferenceViewHolder(android.view.View itemView) {
        this.itemView = itemView;
    }

    public <T extends android.view.View> T findViewById(int id) {
        return itemView.findViewById(id);
    }

    public android.view.View getItemView() {
        return itemView;
    }
}
