package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Output;
import uz.pdp.vazifa1.entity.OutputProduct;
import uz.pdp.vazifa1.entity.Product;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Long getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
