import javax.inject.Inject;

public class Bolts implements Battle {

    @Inject
    public Bolts() {

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
