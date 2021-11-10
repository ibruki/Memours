package verm.jvrs.com.memours.core.controller;


import org.springframework.web.bind.annotation.*;
import verm.jvrs.com.memours.core.business.MemoirBusiness;
import verm.jvrs.com.memours.core.request.MemoirRequest;
import verm.jvrs.com.memours.core.response.MemoirResponse;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api/memoir")
public class MemoirController {

    MemoirBusiness memoirBusiness;

    public MemoirController(MemoirBusiness memoirBusiness){
        this.memoirBusiness = memoirBusiness;
    }

    @PostMapping("/create")
    public MemoirResponse create(@Valid @RequestBody MemoirRequest memoirRequest){
        return memoirBusiness.create(memoirRequest);
    }

    @GetMapping("/{id}")
    public MemoirResponse getById(@Valid @PathVariable("id") String id){
        return memoirBusiness.getOne(id);
    }

    @GetMapping("/getAll")
    public Collection<MemoirResponse> getALl(){
        return memoirBusiness.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @PathVariable("id") String id){
        memoirBusiness.delete(id);
        System.out.println("Memória: " + id + "deletada.");
    }
}
