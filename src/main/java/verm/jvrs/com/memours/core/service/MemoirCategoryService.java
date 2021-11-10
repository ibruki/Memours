package verm.jvrs.com.memours.core.service;

import org.springframework.stereotype.Service;
import verm.jvrs.com.memours.core.entity.Memoir;
import verm.jvrs.com.memours.core.entity.MemoirCategory;
import verm.jvrs.com.memours.core.entity.MemoirReference;
import verm.jvrs.com.memours.core.repository.MemoirCategoryRepository;
import verm.jvrs.com.memours.core.repository.MemoirRepository;

@Service
public class MemoirCategoryService {

    private final MemoirCategoryRepository memoirCategoryRepository;
    private final MemoirRepository memoirRepository;

    public MemoirCategoryService(MemoirCategoryRepository memoirCategoryRepository, MemoirRepository memoirRepository){
        this.memoirCategoryRepository = memoirCategoryRepository;
        this.memoirRepository = memoirRepository;
    }

    public MemoirCategory create(MemoirCategory memoirCategory){
        return memoirCategoryRepository.save(memoirCategory);
    }


    //refatorar essa classe no futuro para fazer a montagem do objeto com as memórias de uma forma mais elegante
    public MemoirCategory addMemoir(String memoirId, String category) throws Exception {
        Memoir memoir = memoirRepository.findById(memoirId).
                orElseThrow(() -> new Exception("Memoir não encontrada!"));

        MemoirReference memoirReference = MemoirReference.builder().
                                            memoir(memoir).
                                            build();

        MemoirCategory memoirCategory = memoirCategoryRepository.findById(category).
                orElseThrow(() -> new Exception("Categoria não encontrada!"));

        memoirCategory.getMemoirCategory().add(memoirReference);

        return memoirCategoryRepository.save(memoirCategory);
    }
}
