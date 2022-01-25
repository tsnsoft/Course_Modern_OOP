package tsn_java_basics;

interface IHuman { // Интерфейс "человек"

    void talk(); // Метод "сказать" 

    void walk();  // Метод "идти"
}

interface IFemale { // Интерфейс "женщина"

    void birth(); // Метод "родить"

    void breastfeed(); // Метод "кормить"  
}

interface IMan { // Интерфейс "мужчина"

    void shave();  // Метод "бриться"
}

/**
 * ИНТЕРФЕЙСЫ
 *
 */
class Human implements IHuman {

    @Override
    public void talk() {
        System.out.println(getClass() + ": " + "Human talk!");
    }

    @Override
    public void walk() {
        System.out.println(getClass() + ": " + "Human walk...");
    }

}

class Women extends Human implements IFemale {

    @Override
    public void birth() {
        System.out.println(getClass() + ": " + "Women birth...");
    }

    @Override
    public void breastfeed() {
        System.out.println(getClass() + ": " + "Women breastfeed...");
    }

}

class Men extends Human implements IMan {

    @Override
    public void shave() {
        System.out.println(getClass() + ": " + "Men shave...");
    }

}

abstract class FemalAnimal implements IFemale {

    @Override
    public void birth() {
        System.out.println(getClass() + ": " + "FemalAnimal birth...");
    }

    @Override
    public void breastfeed() {
        System.out.println(getClass() + ": " + "FemalAnimal breastfeed...");
    }

    public abstract void gestation(); // Метод "беременность"

}

class Hippo extends FemalAnimal {

    @Override
    public void gestation() {
        System.out.println(getClass() + ": " + "Hippo gestation...");
    }

}

/**
 * @author Talipov
 *
 */
public class DemoInterface {

    public DemoInterface() {
        Men men = new Men();
        Women women = new Women();
        men.talk();
        men.shave();
        women.breastfeed();
        Human oldMen = new Men();
        oldMen.talk();
        IHuman girl = new Women();
        girl.walk();
        Hippo hippo = new Hippo();
        hippo.gestation();
        FemalAnimal hippo2 = new Hippo();
        hippo2.gestation();
        new Hippo().birth();

        FemalAnimal penguin = new FemalAnimal() {
            @Override
            public void gestation() {
                System.out.println(getClass() + ": " + "Penguin gestation...");
            }

        };

        penguin.gestation();
        penguin.breastfeed();
    }
}
