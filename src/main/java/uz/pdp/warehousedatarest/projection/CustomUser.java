package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Supplier;
import uz.pdp.warehousedatarest.entity.User;
import uz.pdp.warehousedatarest.entity.Warehouse;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;

import java.util.Set;


@Projection(types = User.class)
public interface CustomUser  {
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    Set<Warehouse> getWarehouses();
}
