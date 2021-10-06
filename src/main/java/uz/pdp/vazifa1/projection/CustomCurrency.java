package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Long getId();

    String getName();

    Boolean getActive();
}
