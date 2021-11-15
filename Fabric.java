public class Fabric {
    public static void main(String[] args)
    {

        SuperHero batman = new SuperHero();
        batman.setType(SuperHero.Type.DC);
        batman.setName("Бэтман");
        batman.setLevel(8);
        System.out.println(batman);


        SuperHero aquaman = new SuperHero();
        aquaman.setType(SuperHero.Type.DC);
        aquaman.setName("Аквамен");
        aquaman.setLevel(8);
        System.out.println(aquaman);


        SuperHero halk = new SuperHero();
        halk.setType(SuperHero.Type.Marvel);
        halk.setName("Халк");
        halk.setLevel(9);
        System.out.println(halk);


        SuperHero spiderman = new SuperHero();
        spiderman.setType(SuperHero.Type.Marvel);
        spiderman.setName("Человек-паук");
        spiderman.setLevel(10);
        System.out.println(spiderman);


        SuperHero  rasomakh = new SuperHero();
        rasomakh.setType(SuperHero.Type.Marvel);
        rasomakh.setName("Расомаха");
        rasomakh.setLevel(9);
        System.out.println(rasomakh);


        SuperHero  superman = new SuperHero();
        superman.setType(SuperHero.Type.Marvel);
        superman.setName("Супермен");
        superman.setLevel(10);
        System.out.println(superman);

        Ulita ulita = new Ulita();

        ulita.setName("Тепловое зрение");
        batman.sposob(ulita);

        ulita.setName("Повелитель воды");
        aquaman.sposob(ulita);

        ulita.setName("Сила");
        halk.sposob(ulita);

        ulita.setName("Паучье чутьё");
        spiderman.sposob(ulita);

        ulita.setName("Регенирация");
        rasomakh.sposob(ulita);

        ulita.setName("Летать");
        superman.sposob(ulita);


























    }
}
