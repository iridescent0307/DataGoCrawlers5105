CREATE DATABASE IF NOT EXISTS DataGoCrawlers;
DROP TABLE IF EXISTS `movies`;
CREATE TABLE `phone` (
  `id` varchar(30) CHARACTER SET armscii8 NOT NULL COMMENT '影视id',
  `episodesInfo` varchar(255) NOT NULL COMMENT '剧集信息',
  `rate` varchar(30) DEFAULT NULL COMMENT '影视评分',
  `title` varchar(30) DEFAULT NULL COMMENT '影视名称',
  `url` varchar(500) DEFAULT NULL COMMENT '影视详情页',
  `playable` INTEGER(10) DEFAULT NULL COMMENT '是否可播放（1：可播放 0：不可播放）',
  `cover` varchar(30) DEFAULT NULL COMMENT '封面地址',
  `url` varchar(500) DEFAULT NULL COMMENT '手机详细信息地址',
  `isNew` INTEGER(30) DEFAULT NULL COMMENT '是否为新上映影视（1：是新影视 0：不是新影视）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SELECT * FROM movies