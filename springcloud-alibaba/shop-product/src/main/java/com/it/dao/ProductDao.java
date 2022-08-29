package com.it.dao;

import com.it.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * dao层继承jpa进行持久化操作
 * JpaRepository<对应的实体,对应实体id的类型>
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
