package com.lb.lbservice.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;


/**
 * 类描述：数据库配置类
 * 创建人：yyf
 * 创建时间：2018/7/30 0030下午 02:10
 */
@Configuration
@MapperScan(basePackages = "com.lb.lbservice.dao",sqlSessionFactoryRef = "lbserviceSqlSessionFactory")
public class ActivityDataSourceConfig {
    @Bean(name = "lbserviceDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.lbserviceDataSource.druid")
    public DataSource dataSource(){
            return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "lbserviceSqlSessionFactory")
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.lb.lbservice.model");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("mapper/*.xml"));
        return sessionFactory.getObject();
    }

}
