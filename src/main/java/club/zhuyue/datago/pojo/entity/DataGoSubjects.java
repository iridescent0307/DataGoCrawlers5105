package club.zhuyue.datago.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ BelongsProject: dataGo-DecentralizedWebCrawler
 * @ BelongsPackage: club.zhuyue.datago.pojo.entity
 * @ Author: lyxiaoyu
 * @ Description: 影视数据实体类
 * @ Version: 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataGoSubjects {

    private Long id; // 影视ID

    private String episodesInfo; // 剧集信息

    private String rate; // 影视评分

    private Long coverX; // 封面宽度

    private Long coverY; // 封面高度

    private String title; // 影视名称

    private String url; // 影视详情页

    private Integer playable; // 是否可播放(1: 可播放 0： 不可播放)

    private String cover; // 封面地址

    private Integer isNew; // 是否为新上映影视(1：是新影视 0：不是新影视)

    @Override
    public String toString() {
        return "DataGoSubjects{" +
                "id=" + id +
                ", episodesInfo='" + episodesInfo + '\'' +
                ", rate='" + rate + '\'' +
                ", coverX=" + coverX +
                ", coverY=" + coverY +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", playable=" + playable  +
                ", cover='" + cover + '\'' +
                ", isNew=" + isNew +
                '}';
    }

}
