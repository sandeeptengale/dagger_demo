import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class War_Factory implements Factory<War> {
  private final Provider<Starks> starksProvider;

  private final Provider<Bolts> boltsProvider;

  public War_Factory(Provider<Starks> starksProvider, Provider<Bolts> boltsProvider) {
    this.starksProvider = starksProvider;
    this.boltsProvider = boltsProvider;
  }

  @Override
  public War get() {
    return provideInstance(starksProvider, boltsProvider);
  }

  public static War provideInstance(
      Provider<Starks> starksProvider, Provider<Bolts> boltsProvider) {
    return new War(starksProvider.get(), boltsProvider.get());
  }

  public static War_Factory create(Provider<Starks> starksProvider, Provider<Bolts> boltsProvider) {
    return new War_Factory(starksProvider, boltsProvider);
  }

  public static War newWar(Starks starks, Bolts bolts) {
    return new War(starks, bolts);
  }
}
