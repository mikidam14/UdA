/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;
import myapp.model.Category;

/**
 *
 * @author michele
 */
public interface CategoryService {
    Category findById(int id);
    List<Category> findAllCategories();
}
