package verm.jvrs.com.memours.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import verm.jvrs.com.memours.core.entity.MemoirCategory;

@Repository
public interface MemoirCategoryRepository extends MongoRepository<MemoirCategory, String> {
}
