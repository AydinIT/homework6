public class Boss extends GameEntity{

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "health: " + getHealth() + ", damage: " + getDamage() + ", weapon type: " + getWeapon().getWeaponType() + ", weapon name: " + getWeapon().getName();
    }
}
