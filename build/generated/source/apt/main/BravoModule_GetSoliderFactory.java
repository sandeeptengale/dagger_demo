import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BravoModule_GetSoliderFactory implements Factory<Solider> {
  private final BravoModule module;

  public BravoModule_GetSoliderFactory(BravoModule module) {
    this.module = module;
  }

  @Override
  public Solider get() {
    return provideInstance(module);
  }

  public static Solider provideInstance(BravoModule module) {
    return proxyGetSolider(module);
  }

  public static BravoModule_GetSoliderFactory create(BravoModule module) {
    return new BravoModule_GetSoliderFactory(module);
  }

  public static Solider proxyGetSolider(BravoModule instance) {
    return Preconditions.checkNotNull(
        instance.getSolider(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
