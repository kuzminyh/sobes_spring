package aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
   public void getBook(Book book) {
       System.out.println("Мы берём книгу "+ book.getName());
   }
}
