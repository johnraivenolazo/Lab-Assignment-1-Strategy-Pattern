// --- MAIN APPLICATION CLASS ---
public class GameApp {
    public static void main(String[] args) {
        // 1. Knight: Attacks with sword; uses shield, dodge, and magic barrier
        Character knight = new Character("Knight", new SwingSword());
        knight.addDefenseStrategy(new Shield());
        knight.addDefenseStrategy(new Dodge());
        knight.addDefenseStrategy(new CreateMagic());

        // 2. Wizard: Casts spells; uses magic barrier
        Character wizard = new Character("Wizard", new CastSpell());
        wizard.addDefenseStrategy(new CreateMagic());

        // 3. Archer: Shoots arrows; uses dodge
        Character archer = new Character("Archer", new ShootArrow());
        archer.addDefenseStrategy(new Dodge());

        // Execution
        System.out.println("--- GAME START ---");

        knight.attack();
        knight.defend();

        System.out.println("------------------");

        wizard.attack();
        wizard.defend();

        System.out.println("------------------");

        archer.attack();
        archer.defend();
    }
}