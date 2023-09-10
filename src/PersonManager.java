
import java.util.LinkedList;
import java.util.ListIterator;

public class PersonManager {
    private LinkedList<Person> personsList = new LinkedList<>();

    public void personAdd(String newPersonName, String newPersonSurname, String newPersonTelephoneNo) {
        // Bu fonksiyon her çalıştıgında yeni bir Person nesnesi oluşturacak
        // (Her bir kişi için ayrı ayrı)
        Person newPerson = new Person(newPersonName, newPersonSurname, newPersonTelephoneNo);

        // Iteratorım ise personsList içerisinde bulunan Person ların üzerinde gezecek.
        ListIterator<Person> iterator = personsList.listIterator();

        while (iterator.hasNext()) {

            int result = iterator.next().getName().compareTo(newPersonName);

            if (result > 0) {
                // o zaman iterator kaldıgı yerden bir geri gitmeli
                iterator.previous();
                iterator.add(newPerson);

                return; // metoddan çıktım

            } else if (result < 0) {
                // Döngüden çıkıp ekleme yapacak.
            }

            else if (result == 0) {
                System.out.println(newPersonName + " isimli kayıt zaten var.Ekleme Yapılmadı \n");
                return;
            }

        }
        iterator.add(newPerson);

    }

    public void personShowList() {
        // Bu ListIterator, LinkedList içindeki elemanlar üzerinde dolaşmak için

        ListIterator<Person> iterator = personsList.listIterator();

        while (iterator.hasNext()) {
            // Foreach kullanılarak da yapılabilir fakat amacımız data structer mantıgı

            // Sıradaki Person nesnesini alacak ve person adında bir değişkene atayacak
            // Yani bir sonraki elemanın adresini person'a atamış olacak
            Person person = iterator.next();
            System.out.println("Name:" + person.getName());
            System.out.println("Surname:" + person.getSurname());
            System.out.println("Telephone No:" + person.getTelephoneNo());
            System.out.println("_________________________");
        }

    }

}
