package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Category;
import uz.pdp.warehousedatarest.projection.template.AbsEntityInterface;

import java.util.List;

@Projection(types = Category.class)
public interface CustomCategory extends AbsEntityInterface {
    List<Category> getParentCategories();
}
