package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Input;
import uz.pdp.vazifa1.entity.InputProduct;
import uz.pdp.vazifa1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
