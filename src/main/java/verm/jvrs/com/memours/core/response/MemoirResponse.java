package verm.jvrs.com.memours.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoirResponse {
    private String id;
    private String comment;
    private double score;
    private String groupName;
}
