package club.zhuyue.datago.utils;

import club.zhuyue.datago.pojo.entity.DataGoSubjects;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.config
 * @ Author: lyxiaoyu
 * @ Description: json解析类
 * @ Version: 1.0
 **/
@Component
public class SubjectsParser {

    /*public List<Subject> parse(String json) {
        try {
            JSONArray jsonArray = JSON.parseArray(json);
            List<Subject> subjects = new ArrayList<>();
            for (Object item : jsonArray) {
                Subject subject = JSON.toJavaObject(item, DataGoSubjects.class);
                subjects.add(subject);
            }
            return subjects;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/
    /*public List<DataGoSubjects> parse(String json) {
        try {
            TypeReference<List<DataGoSubjects>> typeRef = new TypeReference<>(List.class, DataGoSubjects.class);
            List<DataGoSubjects> subjects = JSON.parseArray(json, typeRef);
            return subjects;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/
    /*public List<DataGoSubjects> parse(String json) {
        try {
            JSONArray jsonArray = JSON.parseArray(json);
            List<DataGoSubjects> subjects = new ArrayList<>();
            for (Object item : jsonArray) {
                DataGoSubjects subject = JSON.toJavaObject(item, DataGoSubjects.class);
                subjects.add(subject);
            }
            return subjects;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
*/
   /* public List<DataGoSubjects> parse(String json) {
        try {
            JSONArray jsonArray = JSON.parseArray(json);
            List<DataGoSubjects> subjects = new ArrayList<>();
            for (Object item : jsonArray) {
                DataGoSubjects subject = JSON.toJavaObject(item, DataGoSubjects.class);
                subjects.add(subject);
            }
            return subjects;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/
    public List<DataGoSubjects> parse(String json) {
        try {
            // 直接解析 JSON 数组为 DataGoSubjects 列表
            List<DataGoSubjects> subjects = JSON.parseArray(json, DataGoSubjects.class);
            return subjects;
        } catch (Exception e) {
            return null;
        }
    }


}
