import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Bolts_Factory implements Factory<Bolts> {
  private static final Bolts_Factory INSTANCE = new Bolts_Factory();

  @Override
  public Bolts get() {
    return provideInstance();
  }

  public static Bolts provideInstance() {
    return new Bolts();
  }

  public static Bolts_Factory create() {
    return INSTANCE;
  }

  public static Bolts newBolts() {
    return new Bolts();
  }
}
