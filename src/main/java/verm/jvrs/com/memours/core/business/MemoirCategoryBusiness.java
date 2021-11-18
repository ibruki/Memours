package verm.jvrs.com.memours.core.business;

import org.springframework.stereotype.Service;
import verm.jvrs.com.memours.core.request.MemoirCategoryRequest;
import verm.jvrs.com.memours.core.response.MemoirCategoryResponse;
import verm.jvrs.com.memours.core.service.MemoirCategoryService;
import verm.jvrs.com.memours.core.converter.MemoirCategoryConverter;

@Service
public class MemoirCategoryBusiness {

    private final MemoirCategoryService memoirCategoryService;

    public MemoirCategoryBusiness(MemoirCategoryService memoirCategoryService){
        this.memoirCategoryService = memoirCategoryService;
    }

    public MemoirCategoryResponse create(MemoirCategoryRequest memoirCategoryRequest){
        return MemoirCategoryConverter.convertCreateMemoirCategoryEntityToMemoirCategoryResponse(
                        memoirCategoryService.create(
                                (MemoirCategoryConverter.convertMemoirCategoryRequestToMemoirCategoryEntity(memoirCategoryRequest))));
    }

    public MemoirCategoryResponse addToCategory(String memoir, String category) throws Exception {
        return MemoirCategoryConverter.
                convertMemoirCategoryEntityToMemoirCategoryResponse(memoirCategoryService.addMemoir(memoir, category));
    }


}
