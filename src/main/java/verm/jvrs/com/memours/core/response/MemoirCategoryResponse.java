package verm.jvrs.com.memours.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoirCategoryResponse {

    @NotBlank
    private String id;

    private Collection<MemoirResponse> categoryResponseCollection;
}
