package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Long getId();

    String getName();

    Boolean getActive();
}
