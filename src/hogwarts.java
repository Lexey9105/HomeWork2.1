public abstract class hogwarts {

    protected int magicPower;
    protected int transgression;
    protected String fullName;
    protected int numbFaculty;


    public hogwarts(int magicPower,int transgression,String fullName){
        this.magicPower=magicPower;
        this.transgression=transgression;
        this.fullName=fullName;
    }

    public abstract int getMagicPower();
    public abstract int getTransgression();
    public abstract String getFullName();
    public abstract int getNumbFaculty();

    public abstract int setMagicPower(int magicPower);
    public abstract int setTransgression(int transgression);
    public abstract String setFullName(String fullName);

    public abstract String toString();
    public abstract boolean equals(Object other);
    public abstract int hashCode();

    public abstract int totalSkill();
    public abstract  int totalQuality();
}

