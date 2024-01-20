package Northwind.com.API;

import Northwind.com.Entity.Concrete.Category;
import Northwind.com.Services.Concrete.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {
    @Autowired
    ServiceManager serviceManager;
    @GetMapping("/getAll")
    public List<Category> getAllCategories()
    {

        return serviceManager.getAll();
    }
    @GetMapping("/getById")
    public Category getCategoryById(Integer id)
    {

        return serviceManager.getById(id);
    }
    @GetMapping("/setNewCategory")
    public void setNewCategory(Category category)
    {

         serviceManager.setNewRow(category);
    }
    @GetMapping("/deleteRow")
    public String deleteCategory(Integer id)
    {

        return serviceManager.deleteRow(id);
    }
    @GetMapping("/updateRow")
    public String updateCategory(Category category)
    {

        return serviceManager.UpdateRow(category);
    }
    
}
