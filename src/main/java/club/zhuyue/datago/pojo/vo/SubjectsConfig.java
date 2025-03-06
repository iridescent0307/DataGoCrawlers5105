package club.zhuyue.datago.pojo.vo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.pojo.vo
 * @ Author: lyxiaoyu
 * @ @CreateTime: 2025-03-03 16:08:46
 * @ Description: 豆瓣网站爬取相关信息配置
 * @ Version: 1.0
 **/
@Data
@ConfigurationProperties(prefix = "url")
public class SubjectsConfig {
    /**
     *@ BelongsProject:
     *@ BelongsPackage:
     *@ CreateDate: 2025/03/03 16:21:29
     *@ methodName:
     *@ params:
     *@ paramsType:
     *@ return:
     *@ Description: 电视剧参数Url
     **/
    private String tvUrl;


    /**
     *@ BelongsProject:
     *@ BelongsPackage:
     *@ CreateDate: 2025/03/03 16:22:04
     *@ methodName:
     *@ params:
     *@ paramsType:
     *@ return:
     *@ Description: 电影参数获取Url
     **/
    private String movieUrl;


    /**
     *@ BelongsProject:
     *@ BelongsPackage:
     *@ CreateDate: 2025/03/03 16:22:34
     *@ methodName:
     *@ params:
     *@ paramsType:
     *@ return:
     *@ Description: 主体参数url
     **/
    private String mainUrl;

}
