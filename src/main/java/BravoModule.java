import dagger.Module;
import dagger.Provides;

@Module
public class BravoModule {
    private Cash cash;
    private Solider solider;

    public BravoModule(Cash cash, Solider solider) {
        this.cash = cash;
        this.solider = solider;
    }

    @Provides
    public Cash getCash() {
        return cash;
    }

    @Provides
    public Solider getSolider() {
        return solider;
    }
}

