import java.util.Objects;

public class сlizaren extends hogwarts {
    private int cunning;
    private int determination;
    private int  ambition;
    private int  resourcefulness;
    private int  thirstPower;
    private final int numbFaculty=2;

    public сlizaren (int magicPower,int transgression,String fullName,int cunning,int determination,int ambition,
                       int  resourcefulness,int  thirstPower){
        super( magicPower, transgression,fullName);
        this.cunning=cunning;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.thirstPower=thirstPower;
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
    public int getCunning(){return cunning;}
    public int getDetermination(){return determination;}
    public int getAmbition(){return ambition;}
    public int getResourcefulness(){return resourcefulness;}
    public int getThirstPower(){return thirstPower;}

    @Override
    public String setFullName(String fullName){
        return this.fullName=fullName;}
    @Override
    public int setTransgression(int transgression){
        return this.transgression=transgression;}
    public int setMagicPower(int magicPower){
        return this.magicPower=magicPower;}
    public int setCunning(int cunning){
        return this.cunning=cunning;}
    public int setDetermination(int determination){
        return this.determination=determination;}
    public int setAmbition(int ambition){
        return this.ambition=ambition;}
    public int setResourcefulness(int resourcefulness){
        return this.resourcefulness=resourcefulness;}
    public int setThirstPower(int thirstPower){
        return this.thirstPower=thirstPower;}

    @Override
    public String toString() {
        return "Полное имя студента"+fullName+"Магическая сила"+magicPower+"Расстояние трансгресии"+transgression
                +"Хитрость"+cunning+"Решительность"+determination+"Амбициозность"+ambition
                +"Решительность"+resourcefulness+"Жажда власти"+thirstPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null&&getClass()!=o.getClass()) return false;
        сlizaren that = (сlizaren) o;
        return getCunning() == that.getCunning() && getDetermination() == that.getDetermination() && getAmbition() == that.getAmbition()
                && getMagicPower() == that.getMagicPower()&& getTransgression() == getTransgression()
                && getResourcefulness() == that.getResourcefulness()&& getThirstPower() == that.getThirstPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCunning(), getDetermination(), getAmbition(),getResourcefulness(),getThirstPower(),getMagicPower(),getTransgression());
    }
    @Override
    public  int totalSkill(){
        int totalSkill=magicPower+transgression;
        return totalSkill;
    }
    public  int totalQuality(){
        int totalQuality=cunning+determination+ambition
                +resourcefulness+thirstPower;
        return totalQuality;
    }
}