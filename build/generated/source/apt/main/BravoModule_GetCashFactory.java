import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BravoModule_GetCashFactory implements Factory<Cash> {
  private final BravoModule module;

  public BravoModule_GetCashFactory(BravoModule module) {
    this.module = module;
  }

  @Override
  public Cash get() {
    return provideInstance(module);
  }

  public static Cash provideInstance(BravoModule module) {
    return proxyGetCash(module);
  }

  public static BravoModule_GetCashFactory create(BravoModule module) {
    return new BravoModule_GetCashFactory(module);
  }

  public static Cash proxyGetCash(BravoModule instance) {
    return Preconditions.checkNotNull(
        instance.getCash(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
