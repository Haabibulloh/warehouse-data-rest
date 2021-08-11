package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;

import java.util.List;


@Projection(types = Product.class)
public interface CustomProduct extends AbsEntityInterface {
    List<Category> getCategory();
    Attachment getPhoto();
    String getCode();
    List<Measurement> getMeasurement();
}
