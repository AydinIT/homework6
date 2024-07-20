public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(30);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.STEEL_ARMS);
        bossWeapon.setName("knife");
        boss.setWeapon(bossWeapon);



        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(30);
        skeleton1.setDamage(10);
        skeleton1.setArrowsAmount(12);

        Weapon skeleton1Weapon = new Weapon();
        skeleton1Weapon.setWeaponType(WeaponType.FIREARMS);
        skeleton1Weapon.setName("bow");
        skeleton1.setWeapon(skeleton1Weapon);



        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(40);
        skeleton2.setDamage(15);
        skeleton2.setArrowsAmount(7);

        Weapon skeleton2Weapon = new Weapon();
        skeleton2Weapon.setWeaponType(WeaponType.FIREARMS);
        skeleton2Weapon.setName("bow");
        skeleton2.setWeapon(skeleton2Weapon);



        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());


    }
}