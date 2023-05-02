import java.util.Objects;

public class hufflepuff extends hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;
    private final int numbFaculty=4;

    public hufflepuff (int magicPower,int transgression,String fullName,int diligence,int loyalty,int honesty){
        super( magicPower, transgression,fullName);
        this.diligence=diligence;
        this.loyalty=loyalty;
        this.honesty=honesty;
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
    public int getDiligence(){return diligence;}
    public int getLoyalty(){return loyalty;}
    public int getHonesty(){return honesty;}

    @Override
    public String setFullName(String fullName){
        return this.fullName=fullName;}
    @Override
    public int setTransgression(int transgression){
        return this.transgression=transgression;}
    public int setMagicPower(int magicPower){
        return this.magicPower=magicPower;}
    public int setDiligence(int diligence){
        return this.diligence=diligence;}
    public int setLoyalty(int loyalty){
        return this.loyalty=loyalty;}
    public int setHonesty(int honesty){
        return this.honesty=honesty;}

    @Override
    public String toString() {
        return "Полное имя студента"+fullName+"Магическая сила"+magicPower+"Расстояние трансгресии"+transgression
                +"Трудолюбие"+diligence+"Верность"+loyalty+"Честность"+honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null&&getClass()!=o.getClass()) return false;
        hufflepuff that = (hufflepuff) o;
        return getDiligence() == that.getDiligence() && getLoyalty() == that.getLoyalty() && getHonesty() == that.getHonesty()
                && getMagicPower() == that.getMagicPower()&& getTransgression() == getTransgression();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiligence(), getLoyalty(), getHonesty(),getMagicPower(),getTransgression());
    }
    @Override
    public  int totalSkill(){
        int totalSkill=magicPower+transgression;
        return totalSkill;
    }
    public  int totalQuality(){
        int totalQuality=diligence+loyalty+honesty;
        return totalQuality;
    }
}

