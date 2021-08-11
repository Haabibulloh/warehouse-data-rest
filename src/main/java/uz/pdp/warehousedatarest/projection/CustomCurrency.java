package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;


@Projection(types = Currency.class)
public interface CustomCurrency extends AbsEntityInterface {
}
