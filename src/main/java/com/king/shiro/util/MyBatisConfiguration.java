package com.king.shiro.util;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.github.pagehelper.PageHelper;

/**
 * mybatis配置类.
 * @author Angel baby--守护天使
 * @version v.0.1
 * @date 2018年4月8日
 */
@Configuration
public class MyBatisConfiguration {

    /**
     * 注册MyBatis分页插件PageHelper
     * @return
     */
    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
