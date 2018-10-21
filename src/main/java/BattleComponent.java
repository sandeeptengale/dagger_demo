import dagger.Component;

@Component(modules = BravoModule.class)
public interface BattleComponent {
    War getWar();
    Cash getCash();
    Solider getSolider();
}
