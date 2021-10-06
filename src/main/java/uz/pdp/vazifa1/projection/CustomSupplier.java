package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Client;

@Projection(types = Client.class)
public interface CustomSupplier {
    Long getId();

    String getName();

    String getPhoneNumber();

    Boolean getActive();
}
