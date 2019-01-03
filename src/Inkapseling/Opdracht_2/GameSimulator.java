package Inkapseling.Opdracht_2;

public class GameSimulator {
    public static void main(String[] args)
    {
        Character arthur = new King();
        Weapon excalibur = new Sword();
        Weapon dagger = new Knife();
        arthur.setWeapon(excalibur);
        arthur.fight();
        arthur.setWeapon(dagger);
        arthur.fight();

        Character guy = new Prince();
        Weapon gun = new Gun();
        guy.setWeapon(gun);
        guy.fight();
    }
}
