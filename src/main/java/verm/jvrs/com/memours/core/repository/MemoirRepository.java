package verm.jvrs.com.memours.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import verm.jvrs.com.memours.core.entity.Memoir;

@Repository
public interface MemoirRepository extends MongoRepository<Memoir, String> {
}
