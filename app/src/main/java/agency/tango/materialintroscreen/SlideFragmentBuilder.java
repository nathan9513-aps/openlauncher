package agency.tango.materialintroscreen;

public class SlideFragmentBuilder {
    public SlideFragmentBuilder title(String t) { return this; }
    public SlideFragmentBuilder description(String d) { return this; }
    public SlideFragmentBuilder backgroundColor(int c) { return this; }
    public SlideFragmentBuilder buttonsColor(int c) { return this; }
    public SlideFragmentBuilder image(int res) { return this; }
    public SlideFragment build() { return new SlideFragment(); }
}
