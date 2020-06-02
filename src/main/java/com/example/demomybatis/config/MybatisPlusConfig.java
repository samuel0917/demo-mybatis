package com.example.demomybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@MapperScan("com.example.demomybatis.mapper")
public class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件 `
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        ServletRegistrationBean reg = new ServletRegistrationBean();
//        reg.setServlet(new StatViewServlet());
//        reg.addUrlMappings("/druid/*");
//        //reg.addInitParameter("allow", "127.0.0.1"); //白名单
//        reg.addInitParameter("resetEnable","false");
//        return reg;
//    }
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        Map<String, String> initParams = new HashMap<String, String>();
//        //设置忽略请求
//
//        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
//        filterRegistrationBean.setInitParameters(initParams);
//        filterRegistrationBean.addInitParameter("profileEnable", "true");
//        filterRegistrationBean.addInitParameter("principalCookieName","USER_COOKIE");
//        filterRegistrationBean.addInitParameter("principalSessionName","");
//        filterRegistrationBean.addInitParameter("aopPatterns","com.example.demo.service");
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//    // 配置事物管理器
//    @Bean
//    public DataSourceTransactionManager transactionManager(){
//        return new DataSourceTransactionManager(new DruidDataSource());
//    }

//    @Bean(name = "wenchao")
//    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.wenchao")
//    public DataSource db1() {
//        return DruidDataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "test")
//    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.test")
//    public DataSource db2() {
//        return DruidDataSourceBuilder.create().build();
//    }

//    /**
//     * 动态数据源配置
//     *
//     * @return
//     */
//    @Bean
//    @Primary
//    public DataSource multipleDataSource(@Qualifier("wenchao") DataSource db1,
//                                         @Qualifier("test") DataSource db2) {
//        DynamicDataSource dynamicDataSource = new DynamicDataSource();
//        Map<Object, Object> targetDataSources = new HashMap<>();
//        targetDataSources.put("wenchao", db1);
//        targetDataSources.put("test", db2);
//        dynamicDataSource.setTargetDataSources(targetDataSources);
//        dynamicDataSource.setDefaultTargetDataSource(db1); // 程序默认数据源，这个要根据程序调用数据源频次，经常把常调用的数据源作为默认
//        return dynamicDataSource;
//    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.druid")
//    public DataSource dataSource() {
//
//        DruidDataSource druidDataSource = new DruidDataSource();
//
//        List filterList=new ArrayList<>();
//
//        filterList.add(wallFilter());
//
//        druidDataSource.setProxyFilters(filterList);
//
//        return druidDataSource;
//
//    }

//    @Bean
//    public ServletRegistrationBean druidServlet() {
//        ServletRegistrationBean reg = new ServletRegistrationBean();
//        reg.setServlet(new StatViewServlet());
//        reg.addUrlMappings("/druid/*");
//        //reg.addInitParameter("allow", "127.0.0.1"); //白名单
//        reg.addInitParameter("resetEnable","false");
//        return reg;
//    }
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new WebStatFilter());
//        Map<String, String> initParams = new HashMap<String, String>();
//        //设置忽略请求
//
//        initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
//        filterRegistrationBean.setInitParameters(initParams);
//        filterRegistrationBean.addInitParameter("profileEnable", "true");
//        filterRegistrationBean.addInitParameter("principalCookieName","USER_COOKIE");
//        filterRegistrationBean.addInitParameter("principalSessionName","");
//        filterRegistrationBean.addInitParameter("aopPatterns","com.example.demo.service");
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//    // 配置事物管理器
//    @Bean
//    public DataSourceTransactionManager transactionManager(){
//        return new DataSourceTransactionManager(new DruidDataSource());
//    }

//    @Bean
//    public WallFilter wallFilter(){
//        WallFilter wallFilter = new WallFilter();
//        wallFilter.setConfig(wallConfig());
//        return wallFilter;
//    }
//
//    @Bean
//    public WallConfig wallConfig(){
//        WallConfig wallConfig = new WallConfig();
//        wallConfig.setMultiStatementAllow(true);//允许一次执行多条语句
//        wallConfig.setNoneBaseStatementAllow(true);//是否允许非以上基本语句的其他语句
//        wallConfig.setStrictSyntaxCheck(false);//是否进行严格的语法检测
//        return wallConfig;
//    }
}
