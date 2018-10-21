
public class App {
    public static void main(String[] args) {
        Cash cash = new Cash();
        Solider solider = new Solider();

        BattleComponent component = DaggerBattleComponent.builder()
                .bravoModule(new BravoModule(cash, solider)).build();
        War war = component.getWar();

        war.prepare();
        war.ready();

        component.getCash();
        component.getSolider();

    }
}
