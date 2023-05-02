import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int  wit;
    private int  creativity;
    private final int numbFaculty=3;

    public Ravenclaw(int magicPower, int transgression, String fullName, int mind, int wisdom, int wit,
                     int  creativity){
        super( magicPower, transgression,fullName);
        this.mind=mind;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;
    }

    @Override
    public int getMagicPower() {
        return magicPower;}
    @Override
    public int getTransgression() {
        return transgression;}
    @Override
    public String getFullName(){return fullName;}
    @Override
    public int getNumbFaculty() {
        return numbFaculty;}
    public int getMind(){return mind;}
    public int getWisdom(){return wisdom;}
    public int getWit(){return wit;}
    public int geCreativity(){return creativity;}


    @Override
    public String setFullName(String fullName){
        return this.fullName=fullName;}
    @Override
    public int setTransgression(int transgression){
        return this.transgression=transgression;}
    public int setMagicPower(int magicPower){
        return this.magicPower=magicPower;}
    public int setMind(int mind){
        return this.mind=mind;}
    public int setWisdom(int wisdom){
        return this.wisdom=wisdom;}
    public int setWit(int wit){
        return this.wit=wit;}
    public int setCreativity(int creativity){
        return this.creativity=creativity;}


    @Override
    public String toString() {
        return "Полное имя студента "+fullName+" Магическая сила "+magicPower+" Расстояние трансгресии "+transgression
                +" Ум "+mind+" Мудрость "+wisdom+" Остроумие "+wit
                +" Творчество "+creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null&&getClass()!=o.getClass()) return false;
        Ravenclaw that = (Ravenclaw) o;
        return getMind() == that.getMind() && getWisdom() == that.getWisdom() && getWit() == that.getWit()
                && getMagicPower() == that.getMagicPower()&& getTransgression() == getTransgression()
                && geCreativity() == that.geCreativity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMind(),getWisdom(),getWit(),geCreativity(),getMagicPower(),getTransgression());
    }
    @Override
    public  int totalSkill(){
        int totalSkill=magicPower+transgression;
        return totalSkill;
    }
    public  int totalQuality(){
        int totalQuality=mind+wisdom+wit
                +creativity;
        return totalQuality;
    }

    public  void facultyDuel(Ravenclaw other){
        if (this.totalQuality()>other.totalQuality()){
            System.out.println("СТУДЕНТ- "+this+" ПО КАЧЕСТВАМ ФАКУЛЬТЕТА ЛУЧШЕ: "+other);
        } else if (this.totalQuality()<other.totalQuality()){System.out.println("СТУДЕНТ "+this+" ПО КАЧЕСТВАМ ФАКУЛЬТЕТА ХУЖЕ: "+other);}
        else {
            System.out.println("СТУДЕНТЫ РАВНЫ ПО КАЧЕСТВАМ ФАКУЛЬТЕТА");
        }
    }
}
