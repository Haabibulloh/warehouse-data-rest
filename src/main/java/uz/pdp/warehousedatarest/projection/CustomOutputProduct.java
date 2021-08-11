package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.*;

import java.util.Date;
import java.util.List;


@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    List<Product> getProduct();
    Double getAmount();
    Double getPrice();
    List<Output> getOutput();
}
