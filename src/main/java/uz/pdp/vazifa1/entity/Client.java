package uz.pdp.vazifa1.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Builder(builderMethodName = "childBuilder")
    public Client(Long id, String name, String phoneNumber) {
        super(id, name, true);
        this.phoneNumber = phoneNumber;
    }
}
