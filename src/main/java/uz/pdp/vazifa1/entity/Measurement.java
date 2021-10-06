package uz.pdp.vazifa1.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Measurement extends AbsEntity {
    @Builder(builderMethodName = "childBuilder")
    public Measurement(Long id, String name) {
        super(id, name, true);
    }
}
