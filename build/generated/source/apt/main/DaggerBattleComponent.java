import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBattleComponent implements BattleComponent {
  private BravoModule bravoModule;

  private DaggerBattleComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.bravoModule = builder.bravoModule;
  }

  @Override
  public War getWar() {
    return new War(new Starks(), new Bolts());
  }

  @Override
  public Cash getCash() {
    return BravoModule_GetCashFactory.proxyGetCash(bravoModule);
  }

  @Override
  public Solider getSolider() {
    return BravoModule_GetSoliderFactory.proxyGetSolider(bravoModule);
  }

  public static final class Builder {
    private BravoModule bravoModule;

    private Builder() {}

    public BattleComponent build() {
      if (bravoModule == null) {
        throw new IllegalStateException(BravoModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerBattleComponent(this);
    }

    public Builder bravoModule(BravoModule bravoModule) {
      this.bravoModule = Preconditions.checkNotNull(bravoModule);
      return this;
    }
  }
}
