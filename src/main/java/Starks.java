import javax.inject.Inject;

public class Starks implements Battle {

    @Inject
    public Starks() {
    }

    @Override
    public void readyForWar() {
        System.out.println(this.getClass().getSimpleName() + " ready for war");
    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName() + " prepared for war");
    }
}
