package BL.Tiles;

import BL.NumericGenerator;
import BL.Position;
import BL.Resource;
import BL.Tile;
import BL.Tiles.Units.Enemy;
import BL.Tiles.Units.Player;

public abstract class Unit extends Tile {

    // A singleton object for generating numbers - NumericGenerator is an interface, implemented by a RandomGenerator and a DeterministicGenerator
    protected static final NumericGenerator r = NumericGenerator.getInstance();
    protected MessageCallback messageCallback;

    protected String name;
    protected Resource health;
    protected int attack;
    protected int defense;

    public String getName() {
        return name;
    }

    public Resource getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    protected Unit(char tile, String name, int healthCapacity, int attack, int defense) {
        super(tile);
        this.name = name;
        this.health = new Resource(healthCapacity, healthCapacity);
        this.attack = attack;
        this.defense = defense;
    }

    protected void initialize(Position position, MessageCallback messageCallback){
        super.initialize(position);
        this.messageCallback = messageCallback;
    }

    protected int attack(){

    }

    public int defend(){
        ...
    }

    // Should be automatically called once the unit finishes its turn
    public abstract void processStep();

    // What happens when the unit dies
    public abstract void onDeath();

    public void interact(Tile tile){
		...
    }

    public void visit(Empty e){
		...
    }

    public abstract void visit(Player p);
    public abstract void visit(Enemy e);

    protected void battle(Unit u){
        ...
    }


    public String describe() {
        return String.format("%s\t\tHealth: %s\t\tAttack: %d\t\tDefense: %d", getName(), getHealth(), getAttack(), getDefense());
    }


}
