package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;


@Projection(types = Client.class)
public interface CustomClient extends AbsEntityInterface {
    String getPhoneNumber();
}
