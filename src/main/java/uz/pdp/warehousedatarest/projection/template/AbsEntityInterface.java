package uz.pdp.warehousedatarest.projection.template;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Category;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;

@Projection(types = AbsEntity.class)
public interface AbsEntityInterface {
    Integer getId();

    String getName();
}
