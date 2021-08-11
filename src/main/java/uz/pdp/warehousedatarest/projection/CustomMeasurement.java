package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.entity.Measurement;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;


@Projection(types = Measurement.class)
public interface CustomMeasurement extends AbsEntityInterface {
}
