import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Starks_Factory implements Factory<Starks> {
  private static final Starks_Factory INSTANCE = new Starks_Factory();

  @Override
  public Starks get() {
    return provideInstance();
  }

  public static Starks provideInstance() {
    return new Starks();
  }

  public static Starks_Factory create() {
    return INSTANCE;
  }

  public static Starks newStarks() {
    return new Starks();
  }
}
