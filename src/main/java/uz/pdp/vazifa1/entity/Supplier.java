package uz.pdp.vazifa1.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Builder(builderMethodName = "childBuilder")
    public Supplier(Long id, String name, String phoneNumber) {
        super(id, name, true);
        this.phoneNumber = phoneNumber;
    }
}