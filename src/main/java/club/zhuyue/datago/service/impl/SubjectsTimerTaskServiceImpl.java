package club.zhuyue.datago.service.impl;

import club.zhuyue.datago.mapper.SubjectsMapper;
import club.zhuyue.datago.pojo.entity.DataGoSubjects;
import club.zhuyue.datago.pojo.vo.SubjectsConfig;
import club.zhuyue.datago.service.SubjectsTimerTaskService;
import club.zhuyue.datago.utils.IdWorker;
import club.zhuyue.datago.utils.SubjectsParser;
import com.alibaba.fastjson.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.security.auth.Subject;
import java.util.List;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.service.impl
 * @ Author: lyxiaoyu
 * @ Description: 影视数据采集服务接口实现类
 * @ Version: 1.0
 **/
@Service
@Slf4j
public class SubjectsTimerTaskServiceImpl implements SubjectsTimerTaskService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private SubjectsConfig subjectsConfig;
    @Autowired
    private SubjectsParser subjectsParser;

    @Autowired
    private SubjectsMapper subjectsMapper;


    private HttpEntity<Object> httpEntity;


    /**
     * @ BelongsProject:
     * @ BelongsPackage:
     * @ methodName: getTvSubjects
     * @ params:
     * @ paramsType:
     * @ return:
     * @ Description: 获取电视剧信息并插入数据库
     **/
    @Override
    public void getTvSubjects() {
        // 1.采集原始数据
        // 1.1 组装url地址
        //String url = subjectsConfig.getTvUrl();
        //String url = "https://movie.douban.com/j/search_subjects?type=movie&tag=%E7%83%AD%E9%97%A8&page_limit=50&page_start=0";
        // 发起请求
        //ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
        // 获取请求状态码
        //int statusCodeValue = responseEntity.getStatusCodeValue();
        // 判断请求是否成功
        /*if (statusCodeValue != 200) {
            // 当前请求失败
            log.error("当前时间点:{},采集失败，http状态码:{}", DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            return;
        }*/
        // 2.获取JS数据
        //String jsData = responseEntity.getBody();
        //log.info("当前时间点，{},采集数据内容{}", DateTime.now().toString("yyyy-MM-dd HH:mm:ss"), jsData);
        // 3.解析数据
        //System.out.println(jsData);
        String url = subjectsConfig.getTvUrl();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Referer", "https://movie.douban.com/");
        headers.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36");
        HttpEntity requestEntity = new HttpEntity<>(headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

        int statusCodeValue = responseEntity.getStatusCodeValue();
        if (statusCodeValue != 200) {
            log.error("当前时间点:{},采集失败，http状态码:{}", DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
            return;
        }
        String jsData = responseEntity.getBody();
        log.info("当前时间点，{},采集数据内容{}", DateTime.now().toString("yyyy-MM-dd HH:mm:ss"), jsData);
        System.out.println(jsData);
        //List<SubjectsConfig> subjectsConfigs = new SubjectsParser().parse(jsData);
        List<DataGoSubjects> subjectsConfigs = new SubjectsParser().parse(jsData);
        if (subjectsConfigs != null) {
            for (DataGoSubjects config : subjectsConfigs) {
                // 处理解析后的数据，例如保存到数据库
                log.info("解析到的电影信息: {}", config);
            }
        }
    }

    @Override
    public void getMovieSubjects() {


    }

    @PostConstruct
    public void initData() {
        //1.2 维护请求头，添加防盗链和用户标识
        HttpHeaders headers = new HttpHeaders();
        // 防盗链
        headers.add("Referer", "https://movie.douban.com/");
        // 用户标识
        headers.add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/135.0.0.0 Safari/537.36");
        // 维护http请求对象
        httpEntity = new HttpEntity<>(headers);
    }





    }
