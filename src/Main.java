public class Main {
    public static void main(String[] args) {

        Boss boss=new Boss();
        boss.setJak(456);
        boss.setHealth(500);

        Weapon weapon=new Weapon();
        weapon.setADSM("ADSM");
        weapon.setAvtomat("Автомат");

        boss.setWeapon(weapon);
        System.out.println(boss.getJak());
        System.out.println(boss.getHealth());
        System.out.println(boss.getWeapon().getAvtomat());
        System.out.println(boss.getWeapon().getADSM());
    }
}