public class HeadlightControl {

    private boolean enabled;

    public HeadlightControl() {
        this.enabled = false;
    }

    public void turnLightsOn() {
        enabled = true;
        System.out.println("Os farois estão ligados");
    }
    public void turnLightsOff() {
        enabled = false;
        System.out.println("Os farois estão desligados");
    }
}
