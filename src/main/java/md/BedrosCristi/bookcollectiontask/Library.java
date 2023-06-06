package md.BedrosCristi.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    private String name;

    public Library(String inputName) {
        this.name = inputName;
        bookList = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        bookList.add(inputBook);
    }

    public int returnNumberOfBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deletedBook = bookList.remove(elementPosition);
            System.out.println("The following book was deleted " + deletedBook.getTitle());
        } catch (IndexOutOfBoundsException exceptionObject) {
            System.out.println("You have entered a nonexistent number, please review the index: " + exceptionObject.getMessage());
        }
    }
    public void removeBook1(Book removedBook) {
        boolean isDeleted = bookList.remove(removedBook);
        if(isDeleted){
            System.out.println("The book was deleted: " + removedBook.getTitle());
        } else System.out.println("There is not the book you entered: " + removedBook.getAuthor());
    }

    public boolean containsBook(Book book) {
        return bookList.contains(book);

    }


    public void printAllTheBooks(){
        for(int i = 0; i < bookList.size(); i++){
            System.out.println("The book nr: " + i + bookList.get(i).getTitle() + " by " + bookList.get(i).getAuthor());
        }

    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks){
        this.bookList.addAll(anotherListOfBooks);
    }
    public List<Book> getBookList(){
        return this.bookList;
    }

}
