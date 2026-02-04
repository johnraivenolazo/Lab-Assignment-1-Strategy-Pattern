import java.util.ArrayList;
import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = new ArrayList<>();
    }

    public void addDefenseStrategy(DefenseStrategy strategy) {
        this.defenseStrategies.add(strategy);
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}
