package verm.jvrs.com.memours.core.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import verm.jvrs.com.memours.core.entity.Memoir;
import verm.jvrs.com.memours.core.request.MemoirRequest;
import verm.jvrs.com.memours.core.response.MemoirResponse;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class MemoirConverter {

    private static final ModelMapper defaultModelMapper = new ModelMapper();

    public static Memoir convertMemoirRequestToMemoirEntity(MemoirRequest memoirRequest){
        return defaultModelMapper.map(memoirRequest, Memoir.class);
    }

    public static MemoirResponse convertMemoirEntityToMemoirResponse(Memoir memoir){
        return defaultModelMapper.map(memoir, MemoirResponse.class);
    }

    public static Collection<MemoirResponse> convertMemoirEntityListToMemoirResponseList(Collection<Memoir> memoirList){
        return memoirList.stream().
                map(memoir -> defaultModelMapper.map(memoir, MemoirResponse.class)).
                collect(Collectors.toList());
    }
}
