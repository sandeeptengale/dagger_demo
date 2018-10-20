import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();
    Starks getStarks();
    Bolts getBolts();
}
