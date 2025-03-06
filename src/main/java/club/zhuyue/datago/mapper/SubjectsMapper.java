package club.zhuyue.datago.mapper;

import club.zhuyue.datago.pojo.entity.DataGoSubjects;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.mapper
 * @ Author: lyxiaoyu
 * @ Description: 影视Mapper类
 * @ Version: 1.0
 **/
@Mapper
public interface SubjectsMapper {

    /**
     *@ BelongsProject:
     *@ BelongsPackage:
     *@ methodName: getAllSubjects
     *@ params:
     *@ paramsType:
     *@ return:
     *@ Description: 查找所有的影视信息
     **/
    public  List<DataGoSubjects> getAllSubjects();


    public int insertSubjects(DataGoSubjects record);










}
