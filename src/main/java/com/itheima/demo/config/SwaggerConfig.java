package com.itheima.demo.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Miao
 * @Date: 2019/3/2 15:34
 * @Desc:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())// 对所有api进行监控
                .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
//                .paths(PathSelectors.regex("/.*"))
                .build();
    }
    //设置swagger的一些信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Swagger API")
//                .contact(new Contact("TestGroup","","zengjin@essa.cn"))
                .description("Swagger Demo UI 界面")
                .version("1.0")
                .build();
    }
}
