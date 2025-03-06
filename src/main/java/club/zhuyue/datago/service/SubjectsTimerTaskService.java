package club.zhuyue.datago.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.service
 * @ Author: lyxiaoyu
 * @ Description: 影视数据采集服务接口
 * @ Version: 1.0
 **/
public interface SubjectsTimerTaskService {

    public void getTvSubjects();

    public void getMovieSubjects();


}
