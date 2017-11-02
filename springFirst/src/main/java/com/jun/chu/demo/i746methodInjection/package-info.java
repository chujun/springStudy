/**
 * Created by chujun on 2017/11/2.
 * 需求:bean和依赖的bean生命周期不同,例如一个单例bean依赖原型bean,该怎么处理
 * 方法1:通过实现ApplicationContextAware接口
 * 方法二:Lookup method injection
 * 说明:
 * 符合条件的方法签名
 * <public|protected> [abstract] <return-type> theMethodName(no-arguments);
 * 原理:使用cglib库产生字节码动态生成子类来覆盖该方法
 * 方法:具体实现方式
 * <lookup-method name="createCommand" bean="myCommand"/>
 * @see com.jun.chu.demo.i746methodInjection.CommandManagerV2
 * https://docs.spring.io/spring/docs/4.3.12.RELEASE/spring-framework-reference/htmlsingle/#beans-factory-method-injection
 */
package com.jun.chu.demo.i746methodInjection;
