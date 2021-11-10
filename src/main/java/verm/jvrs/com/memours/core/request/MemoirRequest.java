package verm.jvrs.com.memours.core.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoirRequest {

    @NotBlank
    private String id;
    private String comment;
    private double score;
    private String groupName;
}
