package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBoostrap(AuthorRepository authorRepository, BookRepository bookRepository) {

        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        intData();
    }

    private void intData() {

        //eric
        Author eric = new Author("Erick", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Colins");
        Set<Book> books = eric.getBooks();
        books.add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development withoit EJB", "23444", "Worx");
        Set<Book> books1 = rod.getBooks();
        books1.add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
