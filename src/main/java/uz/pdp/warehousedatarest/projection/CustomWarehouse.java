package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.entity.Warehouse;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;


@Projection(types = Warehouse.class)
public interface CustomWarehouse extends AbsEntityInterface {
}
