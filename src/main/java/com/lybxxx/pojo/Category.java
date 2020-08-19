package com.lybxxx.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author lybxxx
 */
@Getter
@Setter
@ToString
public class Category {
    private int id;
    private String name;
    private List<Product> productList;
}
