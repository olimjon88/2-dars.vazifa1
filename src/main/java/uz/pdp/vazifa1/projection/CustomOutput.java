package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Client;
import uz.pdp.vazifa1.entity.Currency;
import uz.pdp.vazifa1.entity.Output;
import uz.pdp.vazifa1.entity.Warehouse;

import java.security.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Long getId();

    Timestamp getSoldDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
