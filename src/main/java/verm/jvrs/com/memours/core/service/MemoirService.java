package verm.jvrs.com.memours.core.service;

import org.springframework.stereotype.Service;
import verm.jvrs.com.memours.core.entity.Memoir;
import verm.jvrs.com.memours.core.repository.MemoirRepository;
import verm.jvrs.com.memours.core.response.MemoirResponse;

import java.util.Collection;


@Service
public class MemoirService {

    private MemoirRepository memoirRepository;

    public MemoirService(MemoirRepository memoirRepository){
        this.memoirRepository = memoirRepository;
    }

    public Memoir create(Memoir memoir){
        return memoirRepository.save(memoir);
    }

    public Memoir getOne(String id){
        return memoirRepository.findById(id).get();
    }

    public Collection<Memoir> getAll(){
        return memoirRepository.findAll();
    }

    public void delete(String id){
        memoirRepository.deleteById(id);
    }
}
