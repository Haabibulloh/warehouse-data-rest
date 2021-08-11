package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;

import java.sql.Timestamp;
import java.util.List;


@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    List<Warehouse> getWarehouse();
    List<Client> getClient();
    List<Currency> getCurrency();
    String getFactureNumber();
}
