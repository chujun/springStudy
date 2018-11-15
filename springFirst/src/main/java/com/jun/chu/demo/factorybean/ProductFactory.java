package com.jun.chu.demo.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chujun on 2018/11/15.
 */
public class ProductFactory implements FactoryBean<Product> {

    @Override
    public Product getObject() throws Exception {
        return new Product();
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public static void main(String[] args) {
        //这儿不适用ApplicationContext容器,而是用最基本的DefaultListableBeanFactory容器,手动加载资源
        ClassPathResource res = new ClassPathResource("application/factorybean/application.xml");

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        reader.loadBeanDefinitions(res);

        Product product = (Product) factory.getBean("productFactory");

        System.out.println(product);
        ProductFactory productFactory = (ProductFactory) factory.getBean("&productFactory");
        System.out.println(productFactory);
    }
}
/**
 * 输出结果 <br/>
 * com.jun.chu.demo.factorybean.Product@525f1e4e
 * com.jun.chu.demo.factorybean.ProductFactory@75f9eccc
 */
