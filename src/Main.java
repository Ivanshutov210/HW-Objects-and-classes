//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");


        Book book1 = new Book("Пиковая дама", author1, 1854);
        Book book2 = new Book("Война и мир", author2, 1869);


        book1.setPublicationYear(1934);


        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год публикации: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год публикации: " + book2.getPublicationYear());
    }
}