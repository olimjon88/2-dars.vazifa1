package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Category;
import uz.pdp.vazifa1.entity.Measurement;
import uz.pdp.vazifa1.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Long getId();

    String getName();

    Category getCategory();

    Boolean getActive();

    Measurement getMeasurement();

    Integer getCode();
}
