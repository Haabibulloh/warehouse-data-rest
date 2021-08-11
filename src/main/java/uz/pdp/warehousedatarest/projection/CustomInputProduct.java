package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.entity.Input;
import uz.pdp.warehousedatarest.entity.InputProduct;
import uz.pdp.warehousedatarest.entity.Product;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;

import java.util.Date;
import java.util.List;


@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    List<Product> getProduct();
    Double getAmount();
    Double getPrice();
    Date getExpireDate();
    List<Input> getInput();
}
