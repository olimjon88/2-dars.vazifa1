package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.User;
import uz.pdp.vazifa1.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Long getId();

    String getFirstName();

    String getLastName();

    String getCode();

    String getPassword();

    Set<Warehouse> getWarehouses();

    String getPhoneNumber();

    Boolean getActive();
}
