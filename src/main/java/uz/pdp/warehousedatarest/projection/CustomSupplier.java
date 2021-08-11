package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.entity.Supplier;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;


@Projection(types = Supplier.class)
public interface CustomSupplier extends AbsEntityInterface {
    String getPhoneNumber();
}
