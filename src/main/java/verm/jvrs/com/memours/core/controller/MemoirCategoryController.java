package verm.jvrs.com.memours.core.controller;

import org.springframework.web.bind.annotation.*;
import verm.jvrs.com.memours.core.business.MemoirCategoryBusiness;
import verm.jvrs.com.memours.core.request.MemoirCategoryRequest;
import verm.jvrs.com.memours.core.response.MemoirCategoryResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/memoirCategory")
public class MemoirCategoryController {

    private final MemoirCategoryBusiness memoirCategoryBusiness;

    public MemoirCategoryController(MemoirCategoryBusiness memoirCategoryBusiness){
        this.memoirCategoryBusiness = memoirCategoryBusiness;
    }

    @PostMapping("/create")
    public MemoirCategoryResponse create(@Valid @RequestBody MemoirCategoryRequest memoirCategoryRequest){
        return memoirCategoryBusiness.create(memoirCategoryRequest);
    }

    @PutMapping("/addMemoirToGroup/{category}/{memoir}")
    public MemoirCategoryResponse addMemoir(@Valid @PathVariable("memoir") String memoir,
                                            @Valid @PathVariable("category") String category) throws Exception {
        return memoirCategoryBusiness.addToCategory(memoir, category);
    }

}
