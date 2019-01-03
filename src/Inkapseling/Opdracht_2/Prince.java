package Inkapseling.Opdracht_2;

public class Prince extends Character{
    public Prince()
    {
        setStrength(3);
    }

    public void fight()
    {
        weapon.useWeapon(strength);
        // other fighting behaviors
    }
}
