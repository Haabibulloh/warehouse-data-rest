package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;

import java.sql.Timestamp;
import java.util.List;


@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    List<Warehouse> getWarehouse();
    List<Supplier> getSupplier();
    List<Currency> getCurrency();
    String getFactureNumber();
}
