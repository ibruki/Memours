package verm.jvrs.com.memours.core.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "memoirCategory")
public class MemoirCategory {

    @Id
    @NotBlank(message = "É preciso dizer o nome da sua categoria.")
    private String id;

    @Field(value = "memoirCategory")
    Collection<MemoirReference> memoirCategory;
}
