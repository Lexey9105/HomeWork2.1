public class Main {
    public static void main(String[] args) {
        Gryffindor germ=    new Gryffindor(9,9,"Гермиона Грейнджер",9,7,7);
        Gryffindor garry=  new Gryffindor(7,8,"Гарри Потер",9,9,9);
        Gryffindor ron=  new Gryffindor(5,5,"Рон Уизли",5,5,5);
        Slizaren drako= new Slizaren(6,6,"Драко Малфой",7,8,7,8,9);
        Slizaren grek=new Slizaren(4,4,"Грэхэм Монтекрю",5,5,5,5,9);
        Slizaren goil= new Slizaren(3,2,"Грегори Гойл",4,4,4,3,2);
        Ravenclaw chan=new Ravenclaw(7,6,"Чжоу Чан",8,9,6,7);
        Ravenclaw padma= new Ravenclaw(6,4,"Падма Патил",6,6,5,5);
        Ravenclaw belb=new Ravenclaw(4,5,"Ммаркус Белби",5,5,6,7);
        Hufflepuff smit=new Hufflepuff(2,2,"Захария Смит",2,2,4);
        Hufflepuff dig=  new Hufflepuff(8,7,"Седрик Дигори",9,7,8);
        Hufflepuff finch=new Hufflepuff(3,3,"Дажсти Финч-Флетчи",4,5,4);
        ron.printStudent();
        drako.facultyDuel(goil);
        garry.hogwartsDuel(chan);

    }
}