package verm.jvrs.com.memours.core.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import verm.jvrs.com.memours.core.entity.MemoirCategory;
import verm.jvrs.com.memours.core.request.MemoirCategoryRequest;
import verm.jvrs.com.memours.core.response.MemoirCategoryResponse;
import verm.jvrs.com.memours.core.response.MemoirResponse;

import java.util.stream.Collectors;

@Component
public class MemoirCategoryConverter {

    private static final ModelMapper defaultModelMapper = new ModelMapper();

    public static MemoirCategoryResponse convertMemoirCategoryEntityToMemoirCategoryResponse(MemoirCategory memoirCategory){
        MemoirCategoryResponse memoirCategoryResponse = defaultModelMapper.map(memoirCategory, MemoirCategoryResponse.class);

        memoirCategoryResponse.setCategoryResponseCollection(memoirCategory.
                getMemoirCategory().stream().
                map(memoir -> defaultModelMapper.map(memoir, MemoirResponse.class)).
                collect(Collectors.toList()));

        return memoirCategoryResponse;
    }

    public static MemoirCategoryResponse convertCreateMemoirCategoryEntityToMemoirCategoryResponse(MemoirCategory memoirCategory){
        MemoirCategoryResponse memoirCategoryResponse = defaultModelMapper.map(memoirCategory, MemoirCategoryResponse.class);

        return memoirCategoryResponse;
    }

    public static MemoirCategory convertMemoirCategoryRequestToMemoirCategoryEntity(MemoirCategoryRequest memoirCategoryRequest){
        return defaultModelMapper.map(memoirCategoryRequest, MemoirCategory.class);
    }
}
