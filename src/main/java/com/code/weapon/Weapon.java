package main.java.com.code.weapon;public class Weapon {    private final AttackPower attackPower;    public Weapon(AttackPower attackPower) {        this.attackPower = attackPower;    }    public Weapon increment(AttackPower increment) {        final AttackPower reinforced = attackPower.reinforce(increment);        return new Weapon(reinforced);    }    @Override    public String toString() {        return "Weapon{" +                "attackPower=" + attackPower +                '}';    }}