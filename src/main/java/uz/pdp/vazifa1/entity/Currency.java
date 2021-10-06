package uz.pdp.vazifa1.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Currency extends AbsEntity {
    @Builder(builderMethodName = "childBuilder")
    public Currency(Long id, String name){
        super(id, name, true);
    }
}
