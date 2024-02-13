package bibblan_backend.demo.services;

import bibblan_backend.demo.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostService {
    // in a service class you alway autowire the repositories you need
    @Autowired
    BlogPostRepository blogPostRepository;

    // create BlogPost
    // when you added code for creating a BlogPost
    // you go into BlogPostController before putting more in your service


    // get all BlogPosts

    // get BlogPost by id

    // update BlogPost

    // remove BlogPost



    // when you start on assignment first thing is to have a clear view of what you are goin to do
    // what models do you need?
    // User
    // Book
    // BorrowedBook

    // always with the easiest which is User and Book, they will be exactly like BlogPost but
    // with different fields ofc.

    // if you need all of your models to be saved separate in your DB then you probably need
    // repository, service and controller for each model

    // you have 2 options for BorrowedBook either referens User and Book with ObjectId or embed

}