package uz.pdp.vazifa1.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Warehouse extends AbsEntity {
    @Builder(builderMethodName = "childBuilder")
    public Warehouse(Long id, String name){
        super(id, name, true);
    }
}
