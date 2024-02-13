package bibblan_backend.demo.repository;

import bibblan_backend.demo.models.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

// this is always an interface
// repository = interface
// for mongodb it has to implement MongoRepository
public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
}
