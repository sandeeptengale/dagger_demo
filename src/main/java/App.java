
public class App {
    public static void main(String[] args) {
        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.ready();
    }
}
