package com.jd.spring5webapp.bootstrap;

import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.domain.User.UserAddress;
import com.jd.spring5webapp.domain.books.Author;
import com.jd.spring5webapp.domain.books.Publisher;
import com.jd.spring5webapp.repository.AuthorRepository;
import com.jd.spring5webapp.repository.PublisherRepository;
import com.jd.spring5webapp.repository.UserRepository;
import com.jd.spring5webapp.domain.books.Book;
import com.jd.spring5webapp.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;
    private UserRepository userRepository;

    public DevBoostrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, UserRepository userRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        if (authorRepository.count() == 0 || bookRepository.count() == 0 || publisherRepository.count() == 0) {
            intData();

        }

        if (userRepository.count() == 0) {

            initUsers();
        }
    }


    private void intData() {

        //smith
        Publisher publisher = new Publisher();
        publisher.setAdress("2301 Avenue");
        publisher.setName("John Smith");
        publisherRepository.save(publisher);

        //smith
        Publisher publisherTwo = new Publisher();
        publisherTwo.setName("Micke Oclahoma");
        publisherTwo.setAdress("22 missisipystreet");
        publisherRepository.save(publisherTwo);

        //eric
        Author eric = new Author("Erick", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        Set<Book> books = eric.getBooks();
        books.add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development withoit EJB", "23444", publisherTwo);
        Set<Book> books1 = rod.getBooks();
        books1.add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


    }

    private void initUsers() {
        User user = new User();
        UserAddress userAddress = new UserAddress();
        userAddress.setCity("Lodz");
        userAddress.setCountry("Polska");
        userAddress.setPostalCode("91-498");
        userAddress.setStreet("Jasinskiego");

        user.setPasswordHash("1231231231");
        user.setEmail("jacek@placek.pl");
        user.setUserAddress(userAddress);

        userRepository.save(user);
    }
}
