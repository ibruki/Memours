package verm.jvrs.com.memours.core.business;

import org.springframework.stereotype.Service;
import verm.jvrs.com.memours.core.converter.MemoirConverter;
import verm.jvrs.com.memours.core.request.MemoirRequest;
import verm.jvrs.com.memours.core.response.MemoirResponse;
import verm.jvrs.com.memours.core.service.MemoirService;

import java.util.Collection;

@Service
public class MemoirBusiness {

    MemoirService memoirService;

    public MemoirBusiness(MemoirService memoirService){
        this.memoirService = memoirService;
    }

    public MemoirResponse create(MemoirRequest memoirRequest){
        return MemoirConverter.convertMemoirEntityToMemoirResponse(
                memoirService.create(MemoirConverter.convertMemoirRequestToMemoirEntity(memoirRequest)));
    }

    public MemoirResponse getOne(String id){
        return MemoirConverter.convertMemoirEntityToMemoirResponse(
                memoirService.getOne(id));
    }

    public Collection<MemoirResponse> getAll(){
        return MemoirConverter.convertMemoirEntityListToMemoirResponseList(memoirService.getAll());
    }

    public void delete(String id){
        memoirService.delete(id);
    }
}
