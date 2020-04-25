package user.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @id
    private String Username;

    @Column(nullable=false)
    private String Password;

    @Version
    @Setter(AccessLevel.NONE)
    private long Version;
}
