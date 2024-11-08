package org.example.task1_1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Петя", "001");
        Student student3 = new Student("Катя");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        studentManager.removeStudent("id_Катя");

        System.out.print(studentManager.getStudents());

        Book book = new Book("Pushkin", "Skazki");
        Book book1 = new Book("Gogol", "Dushi");
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(book);
        bookCollection.addBook(book1);
        bookCollection.removeBooks("Skazki");
        bookCollection.checkBook("Dushi");

        Product product = new Product("Kolbasa", 100.2);
        Product product1 = new Product("Kola", 50.9);
        PriceList priceList = new PriceList();
        priceList.addPriceProduct(product.getName(), product.getPrice());
        priceList.addPriceProduct(product1.getName(), product1.getPrice());
        priceList.changeProductPrice(product.getName(), 202.0);
        priceList.getProductPrice(product.getName());
    }
}
