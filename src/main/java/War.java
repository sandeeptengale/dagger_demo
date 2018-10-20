import javax.inject.Inject;

public class War {
    private Starks starks;
    private Bolts bolts;

    @Inject
    public War(Starks starks, Bolts bolts) {
        this.starks = starks;
        this.bolts = bolts;
    }

    public void prepare() {
        starks.prepareForWar();
        bolts.prepareForWar();
    }

    public void ready() {
        starks.readyForWar();
        bolts.readyForWar();
    }
}
