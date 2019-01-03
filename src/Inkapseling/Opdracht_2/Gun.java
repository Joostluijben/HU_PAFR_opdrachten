package Inkapseling.Opdracht_2;

public class Gun implements Weapon{
    @Override
    public void useWeapon(int strength)
    {
        System.out.println("Fire a gun and kill "+strength);
    }
}
