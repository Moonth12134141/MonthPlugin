package Month.Main;

public final class MonthPlugin extends MonthJavaPlugin {

    @Override
    public final void onLoad() {
        System.out.println("onLoad !");
    }

    @Override
    public final void onEnable() {
        System.out.println("onEnable !");
    }

    @Override
    public final void onDisable() {
        System.out.println("onDisable !");
    }

    @Override
    public final void onReload() {
        System.out.println("onReload !");
    }

}
