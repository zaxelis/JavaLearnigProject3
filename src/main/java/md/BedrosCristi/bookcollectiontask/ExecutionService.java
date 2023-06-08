package md.BedrosCristi.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book laRascruceDeVinturiBook = new Book("La rascruce de vinturi", "Emily Bronte");
        Book mizerabiliiBook = new Book("Mizerabilii", "Victor Hugo");
        Book artaNegocieriiBook = new Book("Arta negocierii", "Roger Fisher");
        Book temaPentruAcasaBook = new Book("Tema pentru acasa", "Nicolae Dabija");
        Book ionBook = new Book("Ion", "Liviu Reabreanu");

        Library proNoiLibrary = new Library("ProNoi");
        proNoiLibrary.addBook(laRascruceDeVinturiBook);
        proNoiLibrary.addBook(mizerabiliiBook);
        proNoiLibrary.addBook(artaNegocieriiBook);
        proNoiLibrary.addBook(temaPentruAcasaBook);
        proNoiLibrary.addBook(ionBook);
        proNoiLibrary.addBook(mizerabiliiBook);

        //      System.out.println("The number of books in the ProNoi library is " + proNoiLibrary.returnNumberOfBooks());

        //       proNoiLibrary.printAllTheBooks();

//        proNoiLibrary.removeBook(5);
//        System.out.println("The number of books after deleting in the ProNoi library is " + proNoiLibrary.returnNumberOfBooks());
//
//        proNoiLibrary.removeBook1(laRascruceDeVinturiBook);
//        System.out.println("The number of books after deleting in the ProNoi library is " + proNoiLibrary.returnNumberOfBooks());

     //   proNoiLibrary.containsBook(ionBook);
      //  System.out.println("You can find this book on our Library: " + proNoiLibrary.containsBook(ionBook));


//        Library librariusLibrary = new Library("Librarius");
//        librariusLibrary.addBook(laRascruceDeVinturiBook);
//        librariusLibrary.addBook(mizerabiliiBook);
//        librariusLibrary.addBook(artaNegocieriiBook);
//        librariusLibrary.addBook(temaPentruAcasaBook);
//        librariusLibrary.addBook(ionBook);
//
//        System.out.println(librariusLibrary.returnNumberOfBooks());

//        Map<String, Library> librariesNetwork = new HashMap<>();
//        librariesNetwork.put("str. Cuza Voda 13", proNoiLibrary);
//        librariesNetwork.put("str. Ion Creanga 42", librariusLibrary);
//
//        librariesNetwork.get("str. Ion Creanga 42").addBook(ionBook);
//        librariesNetwork.get("str. Cuza Voda 13").printAllTheBooks();
//
//        librariesNetwork.get("str. Cuza Voda 13").addAnotherListOfBooksIntoTheLibraryList(proNoiLibrary.getBookList());
//        librariesNetwork.get("str. Cuza Voda 13").printAllTheBooks();
    }

}
