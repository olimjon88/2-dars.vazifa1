package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Currency;
import uz.pdp.vazifa1.entity.Input;
import uz.pdp.vazifa1.entity.Supplier;
import uz.pdp.vazifa1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Long getId();

    Timestamp getReceiveDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    Integer getFactureNumber();

    Integer getCode();
}
