//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");


        Book book1 = new Book("Пиковая дама", author1, 1854);
        Book book2 = new Book("Война и мир", author2, 1869);
        Book book3 =new Book("Мертвые Души",new Author("Николай","Гогль"),1835);

        System.out.println("Книга 1: " + book1);
        System.out.println("Книга 2: " + book2);

        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
    }
}