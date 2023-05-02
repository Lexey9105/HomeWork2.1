public class Main {
    public static void printStudent(hogwarts[] total,String fullName){

        for (int i=0;i< total.length;i++){
            if(total[i].getFullName()==fullName){
                System.out.println(total[i].toString());
            }
        }
    }
    public static void facultyDuel(hogwarts[] total,int faculty,String firstStudent,String secondStudent){
        int a=0;
        String firstName="";
        int b=0;
        String secondName="";
        for (int i=0;i< total.length;i++) {
            if (faculty == total[i].getNumbFaculty()) {
                if (total[i].getFullName() == firstStudent) {
                    a = total[i].totalQuality();
                    firstName = total[i].getFullName();
                }
                if (total[i].getFullName() == secondStudent) {
                    b = total[i].totalQuality();
                    secondName = total[i].getFullName();
                }
            }
        }
                if (a>b){
                    System.out.println("Студент "+firstName+" по качествам факультета лучше "+secondName);
                } else if (b>a){System.out.println("Студент "+firstName+" по качествам факультета хуже "+secondName);}
                else {
                    System.out.println("Студенты равны по качествам факультета");
                }
        }
public static void hogwartsDuel(hogwarts[] total,String firstStudent,String secondStudent){
    int a=0;
    String firstName="";
    int b=0;
    String secondName="";
    for (int i=0;i< total.length;i++) {
            if (total[i].getFullName() == firstStudent) {
                a = total[i].totalSkill();
                firstName = total[i].getFullName();}
            if (total[i].getFullName() == secondStudent) {
                b = total[i].totalSkill();
                secondName = total[i].getFullName();}
    }
    if (a>b){System.out.println("Студент "+firstName+" по общим качествам лучше "+secondName);
    } else if (b>a){System.out.println("Студент "+firstName+" по общим качествам хуже "+secondName);}
    else {System.out.println("Студенты равны по общим качествам");
    }
}


    public static void main(String[] args) {
        hogwarts[] total=new hogwarts[]{
                new gryffindor(9,9,"Гермиона Грейнджер",9,7,7),
                new gryffindor(7,8,"Гарри Потер",9,9,9),
                new gryffindor(5,5,"Рон Уизли",5,5,5),
                new сlizaren(6,6,"Драко Малфой",7,8,7,8,9),
                new сlizaren(4,4,"Грэхэм Монтекрю",5,5,5,5,9),
                new сlizaren(3,2,"Грегори Гойл",4,4,4,3,2),
                new ravenclaw(7,6,"Чжоу Чан",8,9,6,7),
                new ravenclaw(6,4,"Падма Патил",6,6,5,5),
                new ravenclaw(4,5,"Ммаркус Белби",5,5,6,7),
                new hufflepuff(2,2,"Захария Смит",2,2,4),
                new hufflepuff(8,7,"Седрик Дигори",9,7,8),
                new hufflepuff(3,3,"Дажсти Финч-Флетчи",4,5,4)
        };
        printStudent(total,"Рон Уизли");
        facultyDuel(total,1,"Гарри Потер","Гермиона Грейнджер");
        hogwartsDuel(total,"Гарри Потер","Гермиона Грейнджер");

    }
}