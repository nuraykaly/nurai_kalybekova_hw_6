public class Main {
    public static void main(String[] args) {
        // Создание и настройка босса
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        boss.setWeapon(bossWeapon);

        boss.printInfo();
        
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(300);
        skeleton1.setDamage(50);
        skeleton1.setArrowCount(20);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        skeleton1.setWeapon(skeletonWeapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(250);
        skeleton2.setDamage(40);
        skeleton2.setArrowCount(15);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Bone Bow");
        skeleton2.setWeapon(skeletonWeapon2);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
