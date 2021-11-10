package verm.jvrs.com.memours.core.entity;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "memoir")
public class Memoir {

    @Id
    @NotBlank(message = "É necessário inserir um nome para sua memória")
    private String id;

    @Field(value = "comment")
    private String comment;

    @Field(value = "score")
    private double score;

    @Field(value = "groupName")
    private String groupName;
}
