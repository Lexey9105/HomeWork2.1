import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;
    private final int numbFaculty=1;

    public Gryffindor(int magicPower, int transgression, String fullName, int nobility, int honor, int bravery){
        super( magicPower, transgression,fullName);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery=bravery;
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
    public int getNobility(){return nobility;}
    public int getHonor(){return honor;}
    public int getBravery(){return bravery;}

    @Override
    public String setFullName(String fullName){
        return this.fullName=fullName;}
    @Override
    public int setTransgression(int transgression){
        return this.transgression=transgression;}
    public int setMagicPower(int magicPower){
        return this.magicPower=magicPower;}
    public int setNobility(int nobility){
        return this.nobility=nobility;}
    public int setHonor(int honor){
   return this.honor=honor;}
    public int setBravery(int bravery){
       return this.bravery=bravery;}

    @Override
    public String toString() {
        return "Полное имя студента "+fullName+" Магическая сила "+magicPower+" Расстояние трансгресии "+transgression
                +" Благородность "+nobility+" Честь "+honor+" Храбрость "+bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null&&getClass()!=o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return getNobility() == that.getNobility() && getHonor() == that.getHonor() && getBravery() == that.getBravery()
                && getMagicPower() == that.getMagicPower()&& getTransgression() == getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNobility(), getHonor(), getBravery(),getMagicPower(),getTransgression());
    }
    @Override
    public  int totalSkill(){
        int totalSkill=magicPower+transgression;
        return totalSkill;
    }

    public  int totalQuality(){
        int totalQuality=nobility+honor+bravery;
        return totalQuality;
    }

    public  void facultyDuel(Gryffindor other){
        if (this.totalQuality()>other.totalQuality()){
            System.out.println("СТУДЕНТ- "+this+" ПО КАЧЕСТВАМ ФАКУЛЬТЕТА ЛУЧШЕ: "+other);
        } else if (this.totalQuality()<other.totalQuality()){System.out.println("СТУДЕНТ "+this+" ПО КАЧЕСТВАМ ФАКУЛЬТЕТА ХУЖЕ: "+other);}
        else {
            System.out.println("СТУДЕНТЫ РАВНЫ ПО КАЧЕСТВАМ ФАКУЛЬТЕТА");
        }
    }

}
