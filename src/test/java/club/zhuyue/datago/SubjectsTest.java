package club.zhuyue.datago;

import club.zhuyue.datago.mapper.SubjectsMapper;
import club.zhuyue.datago.pojo.entity.DataGoSubjects;
import club.zhuyue.datago.service.SubjectsTimerTaskService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago
 * @ Author: lyxiaoyu
 * @ Description: 影视业务测试类
 * @ Version: 1.0
 **/
@SpringBootTest
@MapperScan("club.zhuyue.datago.mapper")
public class SubjectsTest {

    @Autowired
    private SubjectsMapper subjectsMapper;

    @Autowired
    private SubjectsTimerTaskService subjectsTimerTaskService;

    @Test
    public void getAllSubjectsTest(){
        List<DataGoSubjects> list = subjectsMapper.getAllSubjects();
        for(DataGoSubjects s : list){
            System.out.println("查询所有影视信息为：" + s);
        }
    }

    @Test
   public void getTvSubjectsTest(){
        subjectsTimerTaskService.getTvSubjects();
   }






}
