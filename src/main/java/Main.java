import com.lybxxx.mapper.CategoryMapper;
import com.lybxxx.pojo.Category;
import com.lybxxx.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lybxxx
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categories = session.selectList("listCategories");
        for (Category category : categories){
            System.out.println(category.getName());
            for (Product product : category.getProductList()){
                System.out.println(product.getName());
            }
        }
        List<Product> products = session.selectList("listProducts");
        for (Product p : products){
            System.out.println(p.getName()+":"+p.getCategory().getName());
        }


        System.out.println("多条件查询：");
        Map<String,Object> parms = new HashMap<>();
        parms.put("name","pro");
        parms.put("price",10);
        List<Product> list = session.selectList("listProductByNameOrPrice",parms);
        for (Product product : list){
            System.out.println(product.getName()+":"+product.getPrice());
        }
        Product product = new Product();
        product.setPrice(99.99);
        product.setId(1);
        session.update("updateProduct",product);
        System.out.println("分页显示");


        Map<String,Object> map = new HashMap<>();
        map.put("start",0);
        map.put("count",5);
        List<Category> list1 = session.selectList("listCategoriesByPage",map);
        for (Category c : list1){
            System.out.println(c.getName());
        }
        session.commit();
        session.close();
    }

//    private static void getCategory(CategoryMapper mapper){
//        Category c = mapper.get(1);
//        System.out.println(c.getName());
//    }
}
