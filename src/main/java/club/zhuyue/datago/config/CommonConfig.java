package club.zhuyue.datago.config;

import club.zhuyue.datago.pojo.vo.SubjectsConfig;
import club.zhuyue.datago.utils.IdWorker;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.config
 * @ Author: lyxiaoyu
 * @ Description: 公共配置类
 * @ Version: 1.0
 **/
@EnableConfigurationProperties(SubjectsConfig.class)//开启常用参数配置bean
@Configuration
public class CommonConfig {
    @Bean
    public IdWorker idWorker() {
        //指定当前为1号机房的2号机器生成
        return new IdWorker(2L, 1L);
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        // 构建http信息转换对象
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        // 反序列化忽略位置属性
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleModule simpleModule = new SimpleModule();
        // Long / long 类型序列化转String
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        // 注册转换器
        objectMapper.registerModule(simpleModule);
        // 设置序列化实现
        converter.setObjectMapper(objectMapper);
        return converter;
    }


}
