package verm.jvrs.com.memours.core.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@Builder
public class MemoirReference {

    @DBRef
    private Memoir memoir;
}
