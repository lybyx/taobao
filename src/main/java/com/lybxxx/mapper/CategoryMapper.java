package com.lybxxx.mapper;

import com.lybxxx.pojo.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lybxxx
 */
public interface CategoryMapper {
//    @Insert("insert into category (name) values (#{name})")
//    public int addProduct(Category category);
//
//    /**
//     * 删除数据
//     * @param id
//     */
//    @Delete("delete from category where id = #{id}")
//    public void deleteProduct(int id);

    /**
     * 查找单个数据
     * @param id
     * @return com.lybxxx.pojo.Category
     */
    @Select("select * form category where id = #{id}")
    public Category get(int id);

    /**
     * 查找所有数据
     * @return
     */
    @Select("select * from category")
    public List<Category> listCategories();

}
