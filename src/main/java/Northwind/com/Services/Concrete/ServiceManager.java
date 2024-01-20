package Northwind.com.Services.Concrete;

import Northwind.com.Entity.Concrete.Category;
import Northwind.com.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceManager {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Category> getAll()
    {
        return categoryRepository.findAll();

    }
    public Category getById(int id)
    {
        return categoryRepository.findById(id).get();
    }

    public void  setNewRow(Category category)
    {
        categoryRepository.save(category);
    }
    public String deleteRow(int id)
    {
        categoryRepository.deleteById(id);
        return "deleted succesfully";
    }
    public String UpdateRow(Category category)
    {
        Category tempCategory = getById(category.getId());
        tempCategory.setCategoryName(category.getCategoryName());
        tempCategory.setDescription(category.getDescription());
        setNewRow(tempCategory);
        return "Category has been updated succesfully";
    }
}
