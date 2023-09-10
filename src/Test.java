
public class Test {

    public static void main(String[] args) throws Exception {
        PersonManager personManager = new PersonManager();

        personManager.personAdd("Samet", "Keskin", "123456");
        personManager.personAdd("Kaan", "Keskin", "123456");
        personManager.personAdd("Talha", "Keskin", "123456");
        personManager.personAdd("Omer", "Keskin", "123456");
        personManager.personShowList();
    }
}
