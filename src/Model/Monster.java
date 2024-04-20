package Model;

public class Monster {
    private String name;
    private String desc;
    private int CR;
    private int HP;
    private String unlock;

    public Monster(String aName, String aDesc, int aCR, int aHP, String aUnlock){
        this.name = aName;
        this.desc = aDesc;
        this.CR = aCR;
        this.HP = aHP;
        this.unlock = aUnlock;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCR() {
        return CR;
    }

    public void setCR(int CR) {
        this.CR = CR;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getUnlock() {
        return unlock;
    }

    public void setUnlock(String unlock) {
        this.unlock = unlock;
    }
}
