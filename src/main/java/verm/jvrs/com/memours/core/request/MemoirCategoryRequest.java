package verm.jvrs.com.memours.core.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoirCategoryRequest {

    @NotBlank
    private String id;
}
