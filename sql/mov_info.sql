/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : cloud_data_info

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2020-07-29 14:53:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `mov_info`
-- ----------------------------
DROP TABLE IF EXISTS `mov_info`;
CREATE TABLE `mov_info` (
  `movie_num` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `movie_name` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '电影名称',
  `movie_year` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '年份',
  `movie_country` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '国家',
  `movie_type` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '类型',
  `movie_director` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '导演',
  `movie_assess` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '评价人数',
  `movie_score` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '评分',
  `movie_url` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT 'url',
  `movie_intro` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`movie_num`)
) ENGINE=InnoDB AUTO_INCREMENT=251 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of mov_info
-- ----------------------------
INSERT INTO `mov_info` VALUES ('1', '肖申克的救赎', '1994', '美国', '犯罪 剧情', ' 弗兰克·德拉邦特 Frank Darabont', '1241123', '9.6', 'https://movie.douban.com/subject/1292052/', '希望让人自由。');
INSERT INTO `mov_info` VALUES ('2', '霸王别姬', '1993', '中国大陆 香港', '剧情 爱情 同性', ' 陈凯歌 Kaige Chen', '914326', '9.6', 'https://movie.douban.com/subject/1291546/', '风华绝代。');
INSERT INTO `mov_info` VALUES ('3', '这个杀手不太冷', '1994', '法国', '剧情 动作 犯罪', ' 吕克·贝松 Luc Besson', '1140705', '9.4', 'https://movie.douban.com/subject/1295644/', '怪蜀黍和小萝莉不得不说的故事。');
INSERT INTO `mov_info` VALUES ('4', '阿甘正传', '1994', '美国', '剧情 爱情', ' Robert Zemeckis', '978580', '9.4', 'https://movie.douban.com/subject/1292720/', '一部美国近现代史。');
INSERT INTO `mov_info` VALUES ('5', '美丽人生', '1997', '意大利', '剧情 喜剧 爱情 战争', ' 罗伯托·贝尼尼 Roberto Benigni', '571904', '9.5', 'https://movie.douban.com/subject/1292063/', '最美的谎言。');
INSERT INTO `mov_info` VALUES ('6', '泰坦尼克号', '1997', '美国', '剧情 爱情 灾难', ' 詹姆斯·卡梅隆 James Cameron', '914275', '9.3', 'https://movie.douban.com/subject/1292722/', '失去的才是永恒的。 ');
INSERT INTO `mov_info` VALUES ('7', '千与千寻', '2001', '日本', '剧情 动画 奇幻', ' 宫崎骏 Hayao Miyazaki', '908660', '9.3', 'https://movie.douban.com/subject/1291561/', '最好的宫崎骏，最好的久石让。 ');
INSERT INTO `mov_info` VALUES ('8', '辛德勒的名单', '1993', '美国', '剧情 历史 战争', ' 史蒂文·斯皮尔伯格 Steven Spielberg', '513558', '9.5', 'https://movie.douban.com/subject/1295124/', '拯救一个人，就是拯救整个世界。');
INSERT INTO `mov_info` VALUES ('9', '盗梦空间', '2010', '美国 英国', '剧情 科幻 悬疑 冒险', ' 克里斯托弗·诺兰 Christopher Nolan', '994109', '9.3', 'https://movie.douban.com/subject/3541415/', '诺兰给了我们一场无法盗取的梦。');
INSERT INTO `mov_info` VALUES ('10', '机器人总动员', '2008', '美国', '爱情 科幻 动画 冒险', ' 安德鲁·斯坦顿 Andrew Stanton', '659888', '9.3', 'https://movie.douban.com/subject/2131459/', '小瓦力，大人生。');
INSERT INTO `mov_info` VALUES ('11', '忠犬八公的故事', '2009', '美国 英国', '剧情', ' 莱塞·霍尔斯道姆 Lasse Hallström', '645681', '9.3', 'https://movie.douban.com/subject/3011091/', '永远都不能忘记你所爱的人。');
INSERT INTO `mov_info` VALUES ('12', '三傻大闹宝莱坞', '2009', '印度', '剧情 喜剧 爱情 歌舞', ' 拉库马·希拉尼 Rajkumar Hirani', '889275', '9.2', 'https://movie.douban.com/subject/3793023/', '英俊版憨豆，高情商版谢耳朵。');
INSERT INTO `mov_info` VALUES ('13', '海上钢琴师', '1998', '意大利', '剧情 音乐', ' 朱塞佩·托纳多雷 Giuseppe Tornatore', '742080', '9.2', 'https://movie.douban.com/subject/1292001/', '每个人都要走一条自己坚定了的路，就算是粉身碎骨。 ');
INSERT INTO `mov_info` VALUES ('14', '放牛班的春天', '2004', '法国 瑞士 德国', '剧情 音乐', ' 克里斯托夫·巴拉蒂 Christophe Barratier', '612500', '9.2', 'https://movie.douban.com/subject/1291549/', '天籁一般的童声，是最接近上帝的存在。 ');
INSERT INTO `mov_info` VALUES ('15', '大话西游之大圣娶亲', '1995', '香港 中国大陆', '喜剧 爱情 奇幻 冒险', ' 刘镇伟 Jeffrey Lau', '679599', '9.2', 'https://movie.douban.com/subject/1292213/', '一生所爱。');
INSERT INTO `mov_info` VALUES ('16', '楚门的世界', '1998', '美国', '剧情 科幻', ' 彼得·威尔 Peter Weir', '660931', '9.2', 'https://movie.douban.com/subject/1292064/', '如果再也不能见到你，祝你早安，午安，晚安。');
INSERT INTO `mov_info` VALUES ('17', '龙猫', '1988', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '590502', '9.1', 'https://movie.douban.com/subject/1291560/', '人人心中都有个龙猫，童年就永远不会消失。');
INSERT INTO `mov_info` VALUES ('18', '星际穿越', '2014', '美国 英国 加拿大 冰岛', '剧情 科幻 冒险', ' 克里斯托弗·诺兰 Christopher Nolan', '673846', '9.2', 'https://movie.douban.com/subject/1889243/', '爱是一种力量，让我们超越时空感知它的存在。');
INSERT INTO `mov_info` VALUES ('19', '教父', '1972', '美国', '剧情 犯罪', ' 弗朗西斯·福特·科波拉 Francis Ford Coppola', '449881', '9.2', 'https://movie.douban.com/subject/1291841/', '千万不要记恨你的对手，这样会让你失去理智。');
INSERT INTO `mov_info` VALUES ('20', '熔炉', '2011', '韩国', '剧情', ' 黄东赫 Dong-hyuk Hwang', '384570', '9.3', 'https://movie.douban.com/subject/5912992/', '我们一路奋战不是为了改变世界，而是为了不让世界改变我们。');
INSERT INTO `mov_info` VALUES ('21', '无间道', '2002', '香港', '剧情 犯罪 悬疑', ' 刘伟强 / 麦兆辉', '558867', '9.1', 'https://movie.douban.com/subject/1307914/', '香港电影史上永不过时的杰作。');
INSERT INTO `mov_info` VALUES ('22', '当幸福来敲门', '2006', '美国', '剧情 传记 家庭', ' 加布里尔·穆奇诺 Gabriele Muccino', '719097', '9.0', 'https://movie.douban.com/subject/1849031/', '平民励志片。 ');
INSERT INTO `mov_info` VALUES ('23', '触不可及', '2011', '法国', '剧情 喜剧', ' 奥利维·那卡什 Olivier Nakache / 艾力克·托兰达 Eric Toledano', '476954', '9.2', 'https://movie.douban.com/subject/6786002/', '满满温情的高雅喜剧。');
INSERT INTO `mov_info` VALUES ('24', '怦然心动', '2010', '美国', '剧情 喜剧 爱情', ' 罗伯·莱纳 Rob Reiner', '777055', '9.0', 'https://movie.douban.com/subject/3319755/', '真正的幸福是来自内心深处。');
INSERT INTO `mov_info` VALUES ('25', '疯狂动物城', '2016', '美国', '喜剧 动画 冒险', ' 拜伦·霍华德 Byron Howard / 瑞奇·摩尔 Rich Moore', '742716', '9.2', 'https://movie.douban.com/subject/25662329/', '迪士尼给我们营造的乌托邦就是这样，永远善良勇敢，永远出乎意料。');
INSERT INTO `mov_info` VALUES ('26', '乱世佳人', '1939', '美国', '剧情 历史 爱情 战争', ' 维克多·弗莱明 Victor Fleming / 乔治·库克 George Cukor', '340228', '9.2', 'https://movie.douban.com/subject/1300267/', 'Tomorrow is another day.');
INSERT INTO `mov_info` VALUES ('27', '蝙蝠侠：黑暗骑士', '2008', '美国 英国', '剧情 动作 科幻 犯罪 惊悚', ' 克里斯托弗·诺兰 Christopher Nolan', '449338', '9.1', 'https://movie.douban.com/subject/1851857/', '无尽的黑暗。');
INSERT INTO `mov_info` VALUES ('28', '活着', '1994', '中国大陆 香港', '剧情 历史 家庭', ' 张艺谋 Yimou Zhang', '369584', '9.2', 'https://movie.douban.com/subject/1292365/', '张艺谋最好的电影。');
INSERT INTO `mov_info` VALUES ('29', '天堂电影院', '1988', '意大利 法国', '剧情 爱情', ' 朱塞佩·托纳多雷 Giuseppe Tornatore', '372896', '9.1', 'https://movie.douban.com/subject/1291828/', '那些吻戏，那些青春，都在影院的黑暗里被泪水冲刷得无比清晰。');
INSERT INTO `mov_info` VALUES ('30', '少年派的奇幻漂流', '2012', '美国 台湾 英国 加拿大', '剧情 奇幻 冒险', ' 李安 Ang Lee', '734377', '9.0', 'https://movie.douban.com/subject/1929463/', '瑰丽壮观、无人能及的冒险之旅。');
INSERT INTO `mov_info` VALUES ('31', '十二怒汉', '1957', '美国', '剧情', ' Sidney Lumet', '219070', '9.4', 'https://movie.douban.com/subject/1293182/', '1957年的理想主义。 ');
INSERT INTO `mov_info` VALUES ('32', '鬼子来了', '2000', '中国大陆', '剧情 历史 战争', ' 姜文 Wen Jiang', '305034', '9.2', 'https://movie.douban.com/subject/1291858/', '对敌人的仁慈，就是对自己残忍。');
INSERT INTO `mov_info` VALUES ('33', '指环王3：王者无敌', '2003', '美国 新西兰', '剧情 动作 奇幻 冒险', ' 彼得·杰克逊 Peter Jackson', '365281', '9.1', 'https://movie.douban.com/subject/1291552/', '史诗的终章。');
INSERT INTO `mov_info` VALUES ('34', '控方证人', '1957', '美国', '剧情 犯罪 悬疑', ' 比利·怀尔德 Billy Wilder', '150506', '9.6', 'https://movie.douban.com/subject/1296141/', '比利·怀德满分作品。');
INSERT INTO `mov_info` VALUES ('35', '天空之城', '1986', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '426646', '9.0', 'https://movie.douban.com/subject/1291583/', '对天空的追逐，永不停止。 ');
INSERT INTO `mov_info` VALUES ('36', '搏击俱乐部', '1999', '美国 德国', '剧情 动作 悬疑 惊悚', ' 大卫·芬奇 David Fincher', '480381', '9.0', 'https://movie.douban.com/subject/1292000/', '邪恶与平庸蛰伏于同一个母体，在特定的时间互相对峙。');
INSERT INTO `mov_info` VALUES ('37', '飞屋环游记', '2009', '美国', '剧情 喜剧 动画 冒险', ' 彼特·道格特 Pete Docter / 鲍勃·彼德森 Bob Peterson', '648949', '8.9', 'https://movie.douban.com/subject/2129039/', '最后那些最无聊的事情，才是最值得怀念的。 ');
INSERT INTO `mov_info` VALUES ('38', '大话西游之月光宝盒', '1995', '香港 中国大陆', '喜剧 爱情 奇幻 冒险', ' 刘镇伟 Jeffrey Lau', '547570', '8.9', 'https://movie.douban.com/subject/1299398/', '旷古烁今。');
INSERT INTO `mov_info` VALUES ('39', '罗马假日', '1953', '美国', '喜剧 剧情 爱情', ' 威廉·惠勒 William Wyler', '490574', '9.0', 'https://movie.douban.com/subject/1293839/', '爱情哪怕只有一天。');
INSERT INTO `mov_info` VALUES ('40', '摔跤吧！爸爸', '2016', '印度', '剧情 传记 运动 家庭', ' 涅提·蒂瓦里 Nitesh Tiwari', '667212', '9.1', 'https://movie.douban.com/subject/26387939/', '你不是在为你一个人战斗，你要让千千万万的女性看到女生并不是只能相夫教子。');
INSERT INTO `mov_info` VALUES ('41', '窃听风暴', '2006', '德国', '剧情 悬疑', ' 弗洛里安·亨克尔·冯·多纳斯马 Florian Henckel von Donnersmarck', '291367', '9.1', 'https://movie.douban.com/subject/1900841/', '别样人生。');
INSERT INTO `mov_info` VALUES ('42', '哈尔的移动城堡', '2004', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '464571', '8.9', 'https://movie.douban.com/subject/1308807/', '带着心爱的人在天空飞翔。');
INSERT INTO `mov_info` VALUES ('43', '辩护人', '2013', '韩国', '剧情', ' 杨宇硕 Woo-seok Yang', '288609', '9.2', 'https://movie.douban.com/subject/21937445/', '电影的现实意义大过电影本身。');
INSERT INTO `mov_info` VALUES ('44', '闻香识女人', '1992', '美国', '剧情', ' 马丁·布莱斯 Martin Brest', '416660', '9.0', 'https://movie.douban.com/subject/1298624/', '史上最美的探戈。');
INSERT INTO `mov_info` VALUES ('45', '两杆大烟枪', '1998', '英国', '剧情 喜剧 犯罪', ' Guy Ritchie', '328970', '9.1', 'https://movie.douban.com/subject/1293350/', '4个臭皮匠顶个诸葛亮，盖·里奇果然不是盖的。');
INSERT INTO `mov_info` VALUES ('46', '飞越疯人院', '1975', '美国', '剧情', ' 米洛斯·福尔曼 Miloš Forman', '332801', '9.0', 'https://movie.douban.com/subject/1292224/', '自由万岁。');
INSERT INTO `mov_info` VALUES ('47', '死亡诗社', '1989', '美国', '剧情', ' 彼得·威尔 Peter Weir', '356795', '9.0', 'https://movie.douban.com/subject/1291548/', '当一个死水般的体制内出现一个活跃的变数时，所有的腐臭都站在了光明的对面。');
INSERT INTO `mov_info` VALUES ('48', 'V字仇杀队', '2005', '美国 英国 德国', '剧情 动作 科幻 惊悚', ' 詹姆斯·麦克特格 James McTeigue', '540699', '8.8', 'https://movie.douban.com/subject/1309046/', '一张面具背后的理想与革命。');
INSERT INTO `mov_info` VALUES ('49', '指环王2：双塔奇兵', '2002', '美国 新西兰', '剧情 动作 奇幻 冒险', ' 彼得·杰克逊 Peter Jackson', '342610', '9.0', 'https://movie.douban.com/subject/1291572/', '承前启后的史诗篇章。');
INSERT INTO `mov_info` VALUES ('50', '海豚湾', '2009', '美国', '纪录片', ' Louie Psihoyos', '219062', '9.3', 'https://movie.douban.com/subject/3442220/', '海豚的微笑，是世界上最高明的伪装。');
INSERT INTO `mov_info` VALUES ('51', '教父2', '1974', '美国', '剧情 犯罪', ' 弗朗西斯·福特·科波拉 Francis Ford Coppola', '243400', '9.1', 'https://movie.douban.com/subject/1299131/', '优雅的孤独。');
INSERT INTO `mov_info` VALUES ('52', '指环王1：魔戒再现', '2001', '新西兰 美国', '剧情 动作 奇幻 冒险', ' 彼得·杰克逊 Peter Jackson', '383586', '8.9', 'https://movie.douban.com/subject/1291571/', '传说的开始。');
INSERT INTO `mov_info` VALUES ('53', '饮食男女', '1994', '台湾 美国', '剧情 家庭', ' 李安 Ang Lee', '263813', '9.1', 'https://movie.douban.com/subject/1291818/', '人生不能像做菜，把所有的料都准备好了才下锅。');
INSERT INTO `mov_info` VALUES ('54', '美丽心灵', '2001', '美国', '传记 剧情', ' 朗·霍华德 Ron Howard', '380243', '8.9', 'https://movie.douban.com/subject/1306029/', '爱是一切逻辑和原由。');
INSERT INTO `mov_info` VALUES ('55', '素媛', '2013', '韩国', '剧情', ' 李濬益 Jun-ik Lee', '250571', '9.1', 'https://movie.douban.com/subject/21937452/', '受过伤害的人总是笑得最开心，因为他们不愿意让身边的人承受一样的痛苦。');
INSERT INTO `mov_info` VALUES ('56', '情书', '1995', '日本', '剧情 爱情', ' 岩井俊二 Shunji Iwai', '471145', '8.8', 'https://movie.douban.com/subject/1292220/', '暗恋的极致。');
INSERT INTO `mov_info` VALUES ('57', '狮子王', '1994', '美国', '剧情 动画 冒险 歌舞 家庭', ' Roger Allers / 罗伯·明可夫 Rob Minkoff', '362175', '8.9', 'https://movie.douban.com/subject/1301753/', '动物版《哈姆雷特》。');
INSERT INTO `mov_info` VALUES ('58', '末代皇帝', '1987', '英国 意大利 中国大陆 法国 美国', '剧情 传记 历史', ' 贝纳尔多·贝托鲁奇 Bernardo Bertolucci', '258262', '9.1', 'https://movie.douban.com/subject/1293172/', '“不要跟我比惨，我比你更惨”再适合这部电影不过了。');
INSERT INTO `mov_info` VALUES ('59', '钢琴家', '2002', '法国 德国 英国 波兰', '剧情 传记 历史 战争 音乐', ' 罗曼·波兰斯基 Roman Polanski', '250821', '9.1', 'https://movie.douban.com/subject/1296736/', '音乐能化解仇恨。');
INSERT INTO `mov_info` VALUES ('60', '美国往事', '1984', '意大利 美国', '犯罪 剧情', ' 赛尔乔·莱翁内 Sergio Leone', '215943', '9.1', 'https://movie.douban.com/subject/1292262/', '往事如烟，无处祭奠。');
INSERT INTO `mov_info` VALUES ('61', '小鞋子', '1997', '伊朗', '剧情 家庭 儿童', ' 马基德·马基迪 Majid Majidi', '182242', '9.2', 'https://movie.douban.com/subject/1303021/', '奔跑的孩子是天使。');
INSERT INTO `mov_info` VALUES ('62', '七宗罪', '1995', '美国', '剧情 犯罪 悬疑 惊悚', ' 大卫·芬奇 David Fincher', '523928', '8.8', 'https://movie.douban.com/subject/1292223/', '警察抓小偷，老鼠玩死猫。');
INSERT INTO `mov_info` VALUES ('63', '本杰明·巴顿奇事', '2008', '美国', '剧情 爱情 奇幻', ' 大卫·芬奇 David Fincher', '489812', '8.8', 'https://movie.douban.com/subject/1485260/', '在时间之河里感受溺水之苦。');
INSERT INTO `mov_info` VALUES ('64', '被嫌弃的松子的一生', '2006', '日本', '剧情 歌舞', ' 中岛哲也 Tetsuya Nakashima', '378270', '8.9', 'https://movie.douban.com/subject/1787291/', '以戏谑来戏谑戏谑。');
INSERT INTO `mov_info` VALUES ('65', '致命魔术', '2006', '美国 英国', '剧情 悬疑 惊悚', ' 克里斯托弗·诺兰 Christopher Nolan', '428939', '8.8', 'https://movie.douban.com/subject/1780330/', '孪生蝙蝠侠大战克隆金刚狼。');
INSERT INTO `mov_info` VALUES ('66', '西西里的美丽传说', '2000', '意大利 美国', '剧情 战争 情色', ' 朱塞佩·托纳多雷 Giuseppe Tornatore', '456413', '8.8', 'https://movie.douban.com/subject/1292402/', '美丽无罪。');
INSERT INTO `mov_info` VALUES ('67', '黑客帝国', '1999', '美国 澳大利亚', '动作 科幻', ' 安迪·沃卓斯基 Andy Wachowski / 拉娜·沃卓斯基 Lana Wachowski', '360606', '8.9', 'https://movie.douban.com/subject/1291843/', '视觉革命。');
INSERT INTO `mov_info` VALUES ('68', '让子弹飞', '2010', '中国大陆 香港', '剧情 喜剧 动作 西部', ' 姜文 Wen Jiang', '798108', '8.7', 'https://movie.douban.com/subject/3742360/', '你给我翻译翻译，神马叫做TMD的惊喜。');
INSERT INTO `mov_info` VALUES ('69', '看不见的客人', '2016', '西班牙', '剧情 犯罪 悬疑 惊悚', ' 奥里奥尔·保罗 Oriol Paulo', '490333', '8.7', 'https://movie.douban.com/subject/26580232/', '你以为你以为的就是你以为的。');
INSERT INTO `mov_info` VALUES ('70', '拯救大兵瑞恩', '1998', '美国', '剧情 历史 战争', ' 史蒂文·斯皮尔伯格 Steven Spielberg', '309191', '8.9', 'https://movie.douban.com/subject/1292849/', '美利坚精神输出大片No1.');
INSERT INTO `mov_info` VALUES ('71', '天使爱美丽', '2001', '法国 德国', '喜剧 爱情', ' 让-皮埃尔·热内 Jean-Pierre Jeunet', '581214', '8.7', 'https://movie.douban.com/subject/1292215/', '法式小清新。 ');
INSERT INTO `mov_info` VALUES ('72', '音乐之声', '1965', '美国', '剧情 传记 爱情 歌舞', ' Robert Wise', '287163', '8.9', 'https://movie.douban.com/subject/1294408/', '用音乐化解仇恨，让歌声串起美好。');
INSERT INTO `mov_info` VALUES ('73', '低俗小说', '1994', '美国', '剧情 喜剧 犯罪', ' 昆汀·塔伦蒂诺 Quentin Tarantino', '420362', '8.8', 'https://movie.douban.com/subject/1291832/', '故事的高级讲法。');
INSERT INTO `mov_info` VALUES ('74', '大闹天宫', '1961(中国大陆) / 1964(中国大陆) / 1978(中国大陆) / 2004(中国大陆)', '中国大陆', '动画 奇幻', ' 万籁鸣 Laiming Wan / 唐澄 Cheng  Tang', '142037', '9.3', 'https://movie.douban.com/subject/1418019/', '经典之作，历久弥新。');
INSERT INTO `mov_info` VALUES ('75', '勇敢的心', '1995', '美国', '动作 传记 剧情 历史 战争', ' 梅尔·吉布森 Mel Gibson', '348303', '8.8', 'https://movie.douban.com/subject/1294639/', '史诗大片的典范。');
INSERT INTO `mov_info` VALUES ('76', '剪刀手爱德华', '1990', '美国', '剧情 奇幻 爱情', ' Tim Burton', '591957', '8.7', 'https://movie.douban.com/subject/1292370/', '浪漫忧郁的成人童话。');
INSERT INTO `mov_info` VALUES ('77', '哈利·波特与魔法石', '2001', '美国 英国', '奇幻 冒险', ' Chris Columbus', '365184', '8.8', 'https://movie.douban.com/subject/1295038/', '童话世界的开端。');
INSERT INTO `mov_info` VALUES ('78', '沉默的羔羊', '1991', '美国', '剧情 犯罪 惊悚', ' 乔纳森·戴米 Jonathan Demme', '428290', '8.8', 'https://movie.douban.com/subject/1293544/', '安东尼·霍普金斯的顶级表演。');
INSERT INTO `mov_info` VALUES ('79', '蝴蝶效应', '2004', '美国 加拿大', '剧情 悬疑 科幻 惊悚', ' 埃里克·布雷斯 Eric Bress / J·麦基·格鲁伯 J. Mackye Gruber', '471539', '8.7', 'https://movie.douban.com/subject/1292343/', '人的命运被自己瞬间的抉择改变。');
INSERT INTO `mov_info` VALUES ('80', '春光乍泄', '1997', '香港 日本 韩国', '剧情 爱情 同性', ' 王家卫 Kar Wai Wong', '310563', '8.9', 'https://movie.douban.com/subject/1292679/', '爱情纠缠，男女一致。');
INSERT INTO `mov_info` VALUES ('81', '心灵捕手', '1997', '美国', '剧情', ' 格斯·范·桑特 Gus Van Sant', '342319', '8.8', 'https://movie.douban.com/subject/1292656/', '人生中应该拥有这样的一段豁然开朗。');
INSERT INTO `mov_info` VALUES ('82', '入殓师', '2008', '日本', '剧情', ' 泷田洋二郎 Yôjirô Takita', '367013', '8.8', 'https://movie.douban.com/subject/2149806/', '死可能是一道门，逝去并不是终结，而是超越，走向下一程。');
INSERT INTO `mov_info` VALUES ('83', '猫鼠游戏', '2002', '美国 加拿大', '传记 犯罪 剧情', ' 史蒂文·斯皮尔伯格 Steven Spielberg', '312136', '8.8', 'https://movie.douban.com/subject/1305487/', '骗子大师和执著警探的你追我跑故事。 ');
INSERT INTO `mov_info` VALUES ('84', '布达佩斯大饭店', '2014', '美国 德国 英国', '剧情 喜剧 冒险', ' 韦斯·安德森 Wes Anderson', '412951', '8.8', 'https://movie.douban.com/subject/11525673/', '小清新的故事里注入了大历史的情怀。');
INSERT INTO `mov_info` VALUES ('85', '禁闭岛', '2010', '美国', '剧情 悬疑 惊悚', ' Martin Scorsese', '453792', '8.7', 'https://movie.douban.com/subject/2334904/', '昔日翩翩少年，今日大腹便便。');
INSERT INTO `mov_info` VALUES ('86', '玛丽和马克思', '2009', '澳大利亚', '剧情 动画', ' 亚当·艾略特 Adam Elliot', '265479', '8.9', 'https://movie.douban.com/subject/3072124/', '你是我最好的朋友，你是我唯一的朋友 。');
INSERT INTO `mov_info` VALUES ('87', '阳光灿烂的日子', '1994', '中国大陆 香港', '剧情', ' 姜文 Wen Jiang', '334562', '8.8', 'https://movie.douban.com/subject/1291875/', '一场华丽的意淫。');
INSERT INTO `mov_info` VALUES ('88', '幽灵公主', '1997', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '288292', '8.8', 'https://movie.douban.com/subject/1297359/', '人与自然的战争史诗。');
INSERT INTO `mov_info` VALUES ('89', '第六感', '1999', '美国', '剧情 悬疑 惊悚', ' M·奈特·沙马兰 M. Night Shyamalan', '286565', '8.8', 'https://movie.douban.com/subject/1297630/', '深入内心的恐怖，出人意料的结局。');
INSERT INTO `mov_info` VALUES ('90', '狩猎', '2012', '丹麦 瑞典', '剧情', ' 托马斯·温特伯格 Thomas Vinterberg', '169366', '9.1', 'https://movie.douban.com/subject/6985810/', '人言可畏。');
INSERT INTO `mov_info` VALUES ('91', '重庆森林', '1994', '香港', '剧情 爱情', ' 王家卫 Kar Wai Wong', '407843', '8.7', 'https://movie.douban.com/subject/1291999/', '寂寞没有期限。');
INSERT INTO `mov_info` VALUES ('92', '穿条纹睡衣的男孩', '2008', '英国 美国', '剧情 战争', ' 马克·赫门 Mark Herman', '200411', '9.0', 'https://movie.douban.com/subject/3008247/', '尽管有些不切实际的幻想，这部电影依旧是一部感人肺腑的佳作。');
INSERT INTO `mov_info` VALUES ('93', '致命ID', '2003', '美国', '剧情 悬疑 惊悚', ' James Mangold', '394741', '8.7', 'https://movie.douban.com/subject/1297192/', '最不可能的那个人永远是最可能的。');
INSERT INTO `mov_info` VALUES ('94', '断背山', '2005', '美国 加拿大', '剧情 爱情 同性 家庭', ' 李安 Ang Lee', '391667', '8.7', 'https://movie.douban.com/subject/1418834/', '每个人心中都有一座断背山。');
INSERT INTO `mov_info` VALUES ('95', '加勒比海盗', '2003', '美国', '动作 冒险 奇幻', ' 戈尔·维宾斯基 Gore Verbinski', '436975', '8.6', 'https://movie.douban.com/subject/1298070/', '约翰尼·德普的独角戏。');
INSERT INTO `mov_info` VALUES ('96', '阿凡达', '2009', '美国 英国', '动作 战争 科幻 冒险', ' 詹姆斯·卡梅隆 James Cameron', '653987', '8.6', 'https://movie.douban.com/subject/1652587/', '绝对意义上的美轮美奂。');
INSERT INTO `mov_info` VALUES ('97', '摩登时代', '1936', '美国', '喜剧 剧情 爱情', ' 查理·卓别林 Charles Chaplin', '118952', '9.2', 'https://movie.douban.com/subject/1294371/', '大时代中的人生，小人物的悲喜。');
INSERT INTO `mov_info` VALUES ('98', '大鱼', '2003', '美国', '剧情 家庭 奇幻 冒险', ' 蒂姆·波顿 Tim Burton', '305335', '8.7', 'https://movie.douban.com/subject/1291545/', '抱着梦想而活着的人是幸福的，怀抱梦想而死去的人是不朽的。');
INSERT INTO `mov_info` VALUES ('99', '告白', '2010', '日本', '剧情 惊悚', ' 中岛哲也 Tetsuya Nakashima', '413539', '8.7', 'https://movie.douban.com/subject/4268598/', '没有一人完全善，也没有一人完全恶。');
INSERT INTO `mov_info` VALUES ('100', '寻梦环游记', '2017', '美国', '喜剧 动画 奇幻 音乐', ' 李·昂克里奇 Lee Unkrich / 阿德里安·莫利纳 Adrian Molina', '620370', '9.0', 'https://movie.douban.com/subject/20495023/', '死亡不是真的逝去，遗忘才是永恒的消亡。');
INSERT INTO `mov_info` VALUES ('101', '一一', '2000', '台湾 日本', '剧情 爱情 家庭', ' 杨德昌 Edward Yang', '186528', '9.0', 'https://movie.douban.com/subject/1292434/', '我们都曾经是一一。');
INSERT INTO `mov_info` VALUES ('102', '射雕英雄传之东成西就', '1993', '香港', '喜剧 古装', ' 刘镇伟 Jeffrey Lau', '333389', '8.7', 'https://movie.douban.com/subject/1316510/', '百看不厌。 ');
INSERT INTO `mov_info` VALUES ('103', '甜蜜蜜', '1996', '香港', '剧情 爱情', ' 陈可辛 Peter Chan', '273473', '8.8', 'https://movie.douban.com/subject/1305164/', '相逢只要一瞬间，等待却像是一辈子。');
INSERT INTO `mov_info` VALUES ('104', '阳光姐妹淘', '2011', '韩国', '剧情 喜剧', ' 姜炯哲 Hyeong-Cheol Kang', '328363', '8.8', 'https://movie.douban.com/subject/4917726/', '再多各自牛逼的时光，也比不上一起傻逼的岁月。 ');
INSERT INTO `mov_info` VALUES ('105', '消失的爱人', '2014', '美国', '剧情 犯罪 悬疑 惊悚', ' 大卫·芬奇 David Fincher', '446354', '8.7', 'https://movie.douban.com/subject/21318488/', '年度最佳date movie。');
INSERT INTO `mov_info` VALUES ('106', '爱在黎明破晓前', '1995', '美国 奥地利 瑞士', '剧情 爱情', ' 理查德·林克莱特 Richard Linklater', '273924', '8.7', 'https://movie.douban.com/subject/1296339/', '缘分是个连绵词，最美不过一瞬。');
INSERT INTO `mov_info` VALUES ('107', '上帝之城', '2002', '巴西 法国', '犯罪 剧情', ' Kátia Lund / Fernando Meirelles', '181261', '8.9', 'https://movie.douban.com/subject/1292208/', '被上帝抛弃了的上帝之城。');
INSERT INTO `mov_info` VALUES ('108', '喜剧之王', '1999', '香港', '喜剧 剧情 爱情', ' 周星驰 Stephen Chow / 李力持 Lik-Chi Lee', '406518', '8.6', 'https://movie.douban.com/subject/1302425/', '我是一个演员。');
INSERT INTO `mov_info` VALUES ('109', '小森林 夏秋篇', '2014', '日本', '剧情', ' 森淳一 Junichi Mori', '180703', '8.9', 'https://movie.douban.com/subject/25814705/', '那些静得只能听见呼吸的日子里，你明白孤独即生活。');
INSERT INTO `mov_info` VALUES ('110', '侧耳倾听', '1995', '日本', '剧情 爱情 动画', ' 近藤喜文 Yoshifumi Kondo', '213964', '8.8', 'https://movie.douban.com/subject/1297052/', '少女情怀总是诗。');
INSERT INTO `mov_info` VALUES ('111', '风之谷', '1984', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '213538', '8.8', 'https://movie.douban.com/subject/1291585/', '动画片的圣经。');
INSERT INTO `mov_info` VALUES ('112', '恐怖直播', '2013', '韩国', '剧情 犯罪 悬疑', ' 金秉祐 Byeong-woo Kim', '291016', '8.7', 'https://movie.douban.com/subject/21360417/', '恐怖分子的“秋菊打官司”。');
INSERT INTO `mov_info` VALUES ('113', '倩女幽魂', '1987', '香港', '剧情 爱情 武侠 古装', ' 程小东 Siu-Tung Ching', '330169', '8.7', 'https://movie.douban.com/subject/1297447/', '两张绝世的脸。 ');
INSERT INTO `mov_info` VALUES ('114', '超脱', '2011', '美国', '剧情', ' 托尼·凯耶 Tony Kaye', '218524', '8.8', 'https://movie.douban.com/subject/5322596/', '穷尽一生，我们要学会的，不过是彼此拥抱。');
INSERT INTO `mov_info` VALUES ('115', '红辣椒', '2006', '日本', '动画 悬疑 科幻 惊悚', ' 今敏 Satoshi Kon', '172454', '8.9', 'https://movie.douban.com/subject/1865703/', '梦的勾结。');
INSERT INTO `mov_info` VALUES ('116', '爱在日落黄昏时', '2004', '美国', '剧情 爱情', ' 理查德·林克莱特 Richard Linklater', '241670', '8.8', 'https://movie.douban.com/subject/1291990/', '九年后的重逢是世俗和责任的交叠，没了悸动和青涩，沧桑而温暖。');
INSERT INTO `mov_info` VALUES ('117', '菊次郎的夏天', '1999', '日本', '剧情 喜剧', ' 北野武 Takeshi Kitano', '234144', '8.8', 'https://movie.douban.com/subject/1293359/', '从没见过那么流氓的温柔，从没见过那么温柔的流氓。');
INSERT INTO `mov_info` VALUES ('118', '驯龙高手', '2010', '美国', '喜剧 动画 奇幻 冒险', ' 迪恩·德布洛斯 Dean DeBlois / 克里斯·桑德斯 Chris Sanders', '354219', '8.7', 'https://movie.douban.com/subject/2353023/', '和谐的生活离不开摸头与被摸头。');
INSERT INTO `mov_info` VALUES ('119', '幸福终点站', '2004', '美国', '喜剧 剧情 爱情', ' 史蒂文·斯皮尔伯格 Steven Spielberg', '270037', '8.7', 'https://movie.douban.com/subject/1292274/', '有时候幸福需要等一等。 ');
INSERT INTO `mov_info` VALUES ('120', '神偷奶爸', '2010', '美国 法国', '喜剧 动画 冒险', ' 皮艾尔·柯芬 Pierre Coffin / 克里斯·雷纳德 Chris Renaud', '478080', '8.5', 'https://movie.douban.com/subject/3287562/', 'Mr. I Don\'t Care其实也有Care的时候。');
INSERT INTO `mov_info` VALUES ('121', '借东西的小人阿莉埃蒂', '2010', '日本', '动画 奇幻 冒险', ' 米林宏昌 Hiromasa Yonebayashi', '264195', '8.7', 'https://movie.douban.com/subject/4202302/', '曾经的那段美好会沉淀为一辈子的记忆。');
INSERT INTO `mov_info` VALUES ('122', '杀人回忆', '2003', '韩国', '犯罪 剧情 悬疑 惊悚', ' 奉俊昊 Joon-ho Bong', '255524', '8.7', 'https://movie.douban.com/subject/1300299/', '关于连环杀人悬案的集体回忆。');
INSERT INTO `mov_info` VALUES ('123', '请以你的名字呼唤我', '2017', '意大利 法国 巴西 美国', '剧情 爱情 同性', ' 卢卡·圭达尼诺 Luca Guadagnino', '247153', '8.8', 'https://movie.douban.com/subject/26799731/', '沉醉在电影的情感和视听氛围中无法自拔。');
INSERT INTO `mov_info` VALUES ('124', '哈利·波特与死亡圣器(下)', '2011', '美国 英国', '剧情 悬疑 奇幻 冒险', ' 大卫·叶茨 David Yates', '342886', '8.7', 'https://movie.douban.com/subject/3011235/', '10年的完美句点。');
INSERT INTO `mov_info` VALUES ('125', '七武士', '1954', '日本', '动作 冒险 剧情', ' 黑泽明 Akira Kurosawa', '95248', '9.2', 'https://movie.douban.com/subject/1295399/', '时代悲歌。');
INSERT INTO `mov_info` VALUES ('126', '岁月神偷', '2010', '香港 中国大陆', '剧情 家庭', ' 罗启锐 Alex Law', '355013', '8.6', 'https://movie.douban.com/subject/3792799/', '岁月流逝，来日可追。');
INSERT INTO `mov_info` VALUES ('127', '小森林 冬春篇', '2015', '日本', '剧情', ' 森淳一 Junichi Mori', '156728', '9.0', 'https://movie.douban.com/subject/25814707/', '尊敬他人，尊敬你生活的这片土地，明白孤独是人生的常态。');
INSERT INTO `mov_info` VALUES ('128', '怪兽电力公司', '2001', '美国', '儿童 喜剧 动画 奇幻 冒险', ' 彼特·道格特 Pete Docter / 大卫·斯沃曼 David Silverman', '304583', '8.6', 'https://movie.douban.com/subject/1291579/', '不要给它起名字，起了名字就有感情了。');
INSERT INTO `mov_info` VALUES ('129', '萤火虫之墓', '1988', '日本', '动画 剧情 战争', ' 高畑勋 Isao Takahata', '241131', '8.7', 'https://movie.douban.com/subject/1293318/', '幸福是生生不息，却难以触及的远。 ');
INSERT INTO `mov_info` VALUES ('130', '谍影重重3', '2007', '美国 德国', '动作 悬疑 惊悚', ' 保罗·格林格拉斯 Paul Greengrass', '220107', '8.7', 'https://movie.douban.com/subject/1578507/', '像吃了苏打饼一样干脆的电影。');
INSERT INTO `mov_info` VALUES ('131', '电锯惊魂', '2004', '美国', '悬疑 惊悚 恐怖', ' 詹姆斯·温 James Wan', '240333', '8.7', 'https://movie.douban.com/subject/1417598/', '真相就在眼前。');
INSERT INTO `mov_info` VALUES ('132', '7号房的礼物', '2013', '韩国', '剧情 喜剧 家庭', ' 李焕庆 Hwan-kyeong Lee', '224225', '8.7', 'https://movie.douban.com/subject/10777687/', '《我是山姆》的《美丽人生》。');
INSERT INTO `mov_info` VALUES ('133', '东邪西毒', '1994', '香港 台湾', '剧情 动作 爱情 武侠 古装', ' 王家卫 Kar Wai Wong', '309515', '8.6', 'https://movie.douban.com/subject/1292328/', '电影诗。');
INSERT INTO `mov_info` VALUES ('134', '喜宴', '1993', '台湾 美国', '剧情 喜剧 爱情 同性 家庭', ' 李安 Ang Lee', '169612', '8.8', 'https://movie.douban.com/subject/1303037/', '中国家庭的喜怒哀乐忍。');
INSERT INTO `mov_info` VALUES ('135', '疯狂原始人', '2013', '美国', '喜剧 动画 冒险', ' 科克·德·米科 Kirk De Micco / 克里斯·桑德斯 Chris Sanders', '445214', '8.7', 'https://movie.douban.com/subject/1907966/', '老少皆宜，这就是好莱坞动画的魅力。');
INSERT INTO `mov_info` VALUES ('136', '贫民窟的百万富翁', '2008', '英国 美国', '剧情 爱情', ' 丹尼·鲍尔 Danny Boyle / 洛芙琳·坦丹 Loveleen Tandan', '451405', '8.5', 'https://movie.douban.com/subject/2209573/', '上帝之城+猜火车+阿甘正传+开心辞典=山寨富翁');
INSERT INTO `mov_info` VALUES ('137', '萤火之森', '2011', '日本', '剧情 爱情 动画 奇幻', ' 大森贵弘 Takahiro Omori', '206954', '8.8', 'https://movie.douban.com/subject/5989818/', '触不到的恋人。');
INSERT INTO `mov_info` VALUES ('138', '记忆碎片', '2000', '美国', '犯罪 剧情 悬疑 惊悚', ' 克里斯托弗·诺兰 Christopher Nolan', '330990', '8.6', 'https://movie.douban.com/subject/1304447/', '一个针管引发的血案。');
INSERT INTO `mov_info` VALUES ('139', '黑天鹅', '2010', '美国', '剧情 惊悚', ' 达伦·阿罗诺夫斯基 Darren Aronofsky', '488855', '8.5', 'https://movie.douban.com/subject/1978709/', '黑暗之美。');
INSERT INTO `mov_info` VALUES ('140', '真爱至上', '2003', '英国 美国 法国', '喜剧 剧情 爱情', ' 理查德·柯蒂斯 Richard Curtis', '372789', '8.5', 'https://movie.douban.com/subject/1292401/', '爱，是个动词。');
INSERT INTO `mov_info` VALUES ('141', '超能陆战队', '2014', '美国', '喜剧 动作 科幻 动画 冒险', ' 唐·霍尔 Don Hall / 克里斯·威廉姆斯 Chris Williams', '465982', '8.6', 'https://movie.douban.com/subject/11026735/', 'Balalala~~~');
INSERT INTO `mov_info` VALUES ('142', '英雄本色', '1986', '香港', '动作 犯罪', ' 吴宇森 John Woo', '222479', '8.6', 'https://movie.douban.com/subject/1297574/', '英雄泪短，兄弟情长。 ');
INSERT INTO `mov_info` VALUES ('143', '唐伯虎点秋香', '1993', '香港', '喜剧 爱情 古装', ' 李力持 Lik-Chi Lee', '434662', '8.5', 'https://movie.douban.com/subject/1306249/', '华太师是黄霑，吴镇宇四大才子之一。');
INSERT INTO `mov_info` VALUES ('144', '蝙蝠侠：黑暗骑士崛起', '2012', '美国 英国', '剧情 动作 科幻 犯罪 惊悚', ' 克里斯托弗·诺兰 Christopher Nolan', '354272', '8.6', 'https://movie.douban.com/subject/3395373/', '诺兰就是保证。');
INSERT INTO `mov_info` VALUES ('145', '雨人', '1988', '美国', '剧情', ' 巴瑞·莱文森 Barry Levinson', '239656', '8.7', 'https://movie.douban.com/subject/1291870/', '生活在自己的世界里，也可以让周围的人显得可笑和渺小。');
INSERT INTO `mov_info` VALUES ('146', '心迷宫', '2014', '中国大陆', '剧情 犯罪 悬疑', ' 忻钰坤 Yukun Xin', '230381', '8.7', 'https://movie.douban.com/subject/25917973/', '荒诞讽刺，千奇百巧，抽丝剥茧，百转千回。');
INSERT INTO `mov_info` VALUES ('147', '卢旺达饭店', '2004', '英国 南非 意大利 美国', '剧情 历史 战争', ' 特瑞·乔治 Terry George', '143820', '8.9', 'https://movie.douban.com/subject/1291822/', '当这个世界闭上双眼，他却敞开了怀抱。');
INSERT INTO `mov_info` VALUES ('148', '傲慢与偏见', '2005', '法国 英国 美国', '剧情 爱情', ' 乔·怀特 Joe Wright', '367570', '8.5', 'https://movie.douban.com/subject/1418200/', '爱是摈弃傲慢与偏见之后的曙光。');
INSERT INTO `mov_info` VALUES ('149', '荒蛮故事', '2014', '阿根廷 西班牙', '剧情 喜剧 犯罪', ' 达米安·斯兹弗隆 Damián Szifron', '184683', '8.8', 'https://movie.douban.com/subject/24750126/', '始于荒诞，止于更荒诞。');
INSERT INTO `mov_info` VALUES ('150', '海洋', '2009', '法国 瑞士 西班牙 美国 阿联酋', '纪录片', ' 雅克·贝汉 Jacques Perrin / 雅克·克鲁奥德 Jacques Cluzaud', '108335', '9.0', 'https://movie.douban.com/subject/3443389/', '大海啊，不全是水。');
INSERT INTO `mov_info` VALUES ('151', '纵横四海', '1991', '香港', '剧情 喜剧 动作 犯罪', ' 吴宇森 John Woo', '187377', '8.7', 'https://movie.douban.com/subject/1295409/', '香港浪漫主义警匪动作片的巅峰之作。');
INSERT INTO `mov_info` VALUES ('152', '无人知晓', '2004', '日本', '剧情', ' 是枝裕和 Hirokazu Koreeda', '97099', '9.1', 'https://movie.douban.com/subject/1292337/', '我的平常生活就是他人的幸福。');
INSERT INTO `mov_info` VALUES ('153', '时空恋旅人', '2013', '英国', '剧情 爱情 奇幻', ' 理查德·柯蒂斯 Richard Curtis', '252929', '8.7', 'https://movie.douban.com/subject/10577869/', '把每天当作最后一天般珍惜度过，积极拥抱生活，就是幸福。');
INSERT INTO `mov_info` VALUES ('154', '海边的曼彻斯特', '2016', '美国', '剧情 家庭', ' 肯尼斯·罗纳根 Kenneth Lonergan', '252397', '8.6', 'https://movie.douban.com/subject/25980443/', '我们都有权利不与自己的过去和解。');
INSERT INTO `mov_info` VALUES ('155', '教父3', '1990', '美国', '剧情 犯罪', ' 弗朗西斯·福特·科波拉 Francis Ford Coppola', '160909', '8.8', 'https://movie.douban.com/subject/1294240/', '任何信念的力量，都无法改变命运。');
INSERT INTO `mov_info` VALUES ('156', '玩具总动员3', '2010', '美国', '喜剧 动画 奇幻 冒险', ' 李·昂克里奇 Lee Unkrich', '230298', '8.8', 'https://movie.douban.com/subject/1858711/', '跨度十五年的欢乐与泪水。');
INSERT INTO `mov_info` VALUES ('157', '完美的世界', '1993', '美国', '剧情 犯罪', ' 克林特·伊斯特伍德 Clint Eastwood', '100994', '9.0', 'https://movie.douban.com/subject/1300992/', '坏人的好总是比好人的好来得更感人。');
INSERT INTO `mov_info` VALUES ('158', '花样年华', '2000', '香港', '剧情 爱情', ' 王家卫 Kar Wai Wong', '294474', '8.6', 'https://movie.douban.com/subject/1291557/', '偷情本没有这样美。');
INSERT INTO `mov_info` VALUES ('159', '虎口脱险', '1966', '法国 英国', '喜剧 战争', ' 杰拉尔·乌里 Gérard Oury', '124418', '8.9', 'https://movie.douban.com/subject/1296909/', '永远看不腻的喜剧。');
INSERT INTO `mov_info` VALUES ('160', '血战钢锯岭', '2016', '美国 澳大利亚', '剧情 传记 历史 战争', ' 梅尔·吉布森 Mel Gibson', '396908', '8.7', 'https://movie.douban.com/subject/26325320/', '优秀的战争片不会美化战场，不会粉饰死亡，不会矮化敌人，不会无视常识，最重要的，不会宣扬战争。');
INSERT INTO `mov_info` VALUES ('161', '达拉斯买家俱乐部', '2013', '美国', '剧情 传记 同性', ' 让-马克·瓦雷 Jean-Marc Vallée', '227528', '8.7', 'https://movie.douban.com/subject/1793929/', 'Jared Leto的腿比女人还美！');
INSERT INTO `mov_info` VALUES ('162', '恋恋笔记本', '2004', '美国', '剧情 爱情', ' 尼克·卡索维茨 Nick Cassavetes', '337818', '8.5', 'https://movie.douban.com/subject/1309163/', '爱情没有那么多借口，如果不能圆满，只能说明爱的不够。 ');
INSERT INTO `mov_info` VALUES ('163', '燃情岁月', '1994', '美国', '剧情 爱情 西部 家庭', ' 爱德华·兹威克 Edward Zwick', '167766', '8.7', 'https://movie.douban.com/subject/1295865/', '传奇，不是每个人都可以拥有。');
INSERT INTO `mov_info` VALUES ('164', '二十二', '2015', '中国大陆', '纪录片', ' 郭柯 Ke Guo', '136594', '8.7', 'https://movie.douban.com/subject/26430107/', '有一些东西不应该被遗忘。');
INSERT INTO `mov_info` VALUES ('165', '雨中曲', '1952', '美国', '喜剧 歌舞 爱情', ' Stanley Donen / Gene Kelly', '108628', '9.0', 'https://movie.douban.com/subject/1293460/', '骨灰级歌舞片。');
INSERT INTO `mov_info` VALUES ('166', '冰川时代', '2002', '美国', '喜剧 动画 冒险', ' 卡洛斯·沙尔丹哈 Carlos Saldanha / 克里斯·韦奇 Chris Wedge', '327327', '8.5', 'https://movie.douban.com/subject/1291578/', '松鼠才是角儿。');
INSERT INTO `mov_info` VALUES ('167', '魂断蓝桥', '1940', '美国', '剧情 战争 爱情', ' Mervyn LeRoy', '148603', '8.8', 'https://movie.douban.com/subject/1293964/', '中国式内在的美国电影。');
INSERT INTO `mov_info` VALUES ('168', '我是山姆', '2001', '美国', '剧情 家庭', ' 杰茜·尼尔森 Jessie Nelson', '128055', '8.8', 'https://movie.douban.com/subject/1306861/', '爱并不需要智商 。');
INSERT INTO `mov_info` VALUES ('169', '穿越时空的少女', '2006', '日本', '剧情 爱情 科幻 动画', ' 细田守 Mamoru Hosoda', '217273', '8.6', 'https://movie.douban.com/subject/1937946/', '爱上未来的你。 ');
INSERT INTO `mov_info` VALUES ('170', '猜火车', '1996', '英国', '犯罪 剧情', ' 丹尼·博伊尔 Danny Boyle', '281556', '8.5', 'https://movie.douban.com/subject/1292528/', '不可猜的青春迷笛。 ');
INSERT INTO `mov_info` VALUES ('171', '人工智能', '2001', '美国', '冒险 剧情 科幻', ' 史蒂文·斯皮尔伯格 Steven Spielberg', '226012', '8.6', 'https://movie.douban.com/subject/1302827/', '对爱的执着，可以超越一切。');
INSERT INTO `mov_info` VALUES ('172', '头脑特工队', '2015', '美国', '喜剧 动画 冒险', ' 彼特·道格特 Pete Docter / 罗纳尔多·德尔·卡门 Ronaldo Del Carmen  &nb...', '285464', '8.7', 'https://movie.douban.com/subject/10533913/', '愿我们都不用长大，每一座城堡都能永远存在。');
INSERT INTO `mov_info` VALUES ('173', '被解救的姜戈', '2012', '美国', '剧情 动作 西部 冒险', ' 昆汀·塔伦蒂诺 Quentin Tarantino', '306746', '8.6', 'https://movie.douban.com/subject/6307447/', '热血沸腾，那个低俗、性感的无耻混蛋又来了。');
INSERT INTO `mov_info` VALUES ('174', '爆裂鼓手', '2014', '美国', '剧情 音乐', ' 达米安·沙泽勒 Damien Chazelle', '282699', '8.6', 'https://movie.douban.com/subject/25773932/', '这个世界从不善待努力的人，努力了也不一定会成功，但是知道自己在努力，就是活下去的动力。');
INSERT INTO `mov_info` VALUES ('175', '未麻的部屋', '1997', '日本', '动画 奇幻 惊悚', ' 今敏 Satoshi Kon', '122003', '8.9', 'https://movie.douban.com/subject/1395091/', '好的剧本是，就算你猜到了结局也猜不到全部。');
INSERT INTO `mov_info` VALUES ('176', '你的名字。', '2016', '日本', '剧情 爱情 动画', ' 新海诚 Makoto Shinkai', '608652', '8.4', 'https://movie.douban.com/subject/26683290/', '穿越错位的时空，仰望陨落的星辰，你没留下你的名字，我却无法忘记那句“我爱你”。');
INSERT INTO `mov_info` VALUES ('177', '无敌破坏王', '2012', '美国', '喜剧 动画 奇幻 冒险', ' 瑞奇·莫尔 Rich Moore', '247524', '8.7', 'https://movie.douban.com/subject/6534248/', '迪士尼和皮克斯拿错剧本的产物。');
INSERT INTO `mov_info` VALUES ('178', '罗生门', '1950', '日本', '犯罪 剧情 悬疑', ' 黑泽明 Akira Kurosawa', '152479', '8.7', 'https://movie.douban.com/subject/1291879/', '人生的N种可能性。');
INSERT INTO `mov_info` VALUES ('179', '浪潮', '2008', '德国', '剧情 惊悚', ' 丹尼斯·甘塞尔 Dennis Gansel', '154994', '8.7', 'https://movie.douban.com/subject/2297265/', '世界离独裁只有五天。');
INSERT INTO `mov_info` VALUES ('180', '阿飞正传', '1990', '香港', '犯罪 剧情 爱情', ' 王家卫 Kar Wai Wong', '252384', '8.5', 'https://movie.douban.com/subject/1305690/', '王家卫是一种风格，张国荣是一个代表。');
INSERT INTO `mov_info` VALUES ('181', '香水', '2006', '德国 法国 西班牙 美国', '剧情 犯罪 奇幻', ' 汤姆·提克威 Tom Tykwer', '321818', '8.4', 'https://movie.douban.com/subject/1760622/', '一个单凭体香达到高潮的男人。');
INSERT INTO `mov_info` VALUES ('182', '朗读者', '2008', '美国 德国', '剧情 爱情', ' 史蒂芬·戴德利 Stephen Daldry', '309401', '8.5', 'https://movie.douban.com/subject/2213597/', '当爱情跨越年龄的界限，它似乎能变得更久远一点，成为一种责任，一种水到渠成的相濡以沫。 ');
INSERT INTO `mov_info` VALUES ('183', '房间', '2015', '爱尔兰 加拿大 英国 美国', '剧情 家庭', ' 伦尼·阿伯拉罕森 Lenny Abrahamson', '193303', '8.8', 'https://movie.douban.com/subject/25724855/', '被偷走的岁月，被伤害的生命，被禁锢的灵魂，终将被希望和善意救赎。');
INSERT INTO `mov_info` VALUES ('184', '模仿游戏', '2014', '英国 美国', '剧情 传记 战争 同性', ' 莫腾·泰杜姆 Morten Tyldum', '307281', '8.6', 'https://movie.douban.com/subject/10463953/', '他给机器起名“克里斯托弗”，因为这是他初恋的名字。');
INSERT INTO `mov_info` VALUES ('185', '恐怖游轮', '2009', '英国 澳大利亚', '剧情 悬疑 惊悚', ' 克里斯托弗·史密斯 Christopher Smith', '391719', '8.4', 'https://movie.douban.com/subject/3011051/', '不要企图在重复中寻找已经失去的爱。');
INSERT INTO `mov_info` VALUES ('186', '一个叫欧维的男人决定去死', '2015', '瑞典', '剧情', ' 汉内斯·赫尔姆 Hannes Holm', '157985', '8.8', 'https://movie.douban.com/subject/26628357/', '惠及一生的美丽。');
INSERT INTO `mov_info` VALUES ('187', '可可西里', '2004', '中国大陆 香港', '剧情 犯罪', ' 陆川 Chuan Lu', '152283', '8.7', 'https://movie.douban.com/subject/1308857/', '坚硬的信仰。');
INSERT INTO `mov_info` VALUES ('188', '忠犬八公物语', '1987', '日本', '剧情', ' Seijirô Kôyama', '77862', '9.1', 'https://movie.douban.com/subject/1959195/', '养狗三日，便会对你终其一生。');
INSERT INTO `mov_info` VALUES ('189', '魔女宅急便', '1989', '日本', '动画 奇幻 冒险', ' 宫崎骏 Hayao Miyazaki', '236394', '8.5', 'https://movie.douban.com/subject/1307811/', '宫崎骏的电影总让人感觉世界是美好的，阳光明媚的。');
INSERT INTO `mov_info` VALUES ('190', '战争之王', '2005', '美国 法国', '剧情 犯罪', ' 安德鲁·尼科尔 Andrew Niccol', '199929', '8.6', 'https://movie.douban.com/subject/1419936/', '做一颗让别人需要你的棋子。');
INSERT INTO `mov_info` VALUES ('191', '一次别离', '2011', '伊朗 法国', '剧情 家庭', ' 阿斯哈·法哈蒂  Asghar Farhadi', '152593', '8.7', 'https://movie.douban.com/subject/5964718/', '只有有信仰的人才能说出事实真相。');
INSERT INTO `mov_info` VALUES ('192', '哪吒闹海', '1979', '中国大陆', '冒险 动画 奇幻', ' 严定宪 Dingxian Yan / 王树忱 Shuchen Wang', '101224', '8.9', 'https://movie.douban.com/subject/1307315/', '想你时你在闹海。');
INSERT INTO `mov_info` VALUES ('193', '完美陌生人', '2016', '意大利', '剧情 喜剧', ' 保罗·格诺维瑟 Paolo Genovese', '260730', '8.6', 'https://movie.douban.com/subject/26614893/', '来啊，互相伤害啊！');
INSERT INTO `mov_info` VALUES ('194', '谍影重重', '2002', '美国 德国 捷克', '动作 悬疑 惊悚', ' 道格·里曼 Doug Liman', '227964', '8.5', 'https://movie.douban.com/subject/1304102/', '哗啦啦啦啦，天在下雨，哗啦啦啦啦，云在哭泣……找自己。');
INSERT INTO `mov_info` VALUES ('195', '追随', '1998', '英国', '犯罪 悬疑 惊悚', ' 克里斯托弗·诺兰 Christopher Nolan', '95740', '8.9', 'https://movie.douban.com/subject/1397546/', '诺兰的牛逼来源于内心散发出的恐惧。');
INSERT INTO `mov_info` VALUES ('196', '谍影重重2', '2004', '美国 德国', '动作 悬疑 惊悚', ' 保罗·格林格拉斯 Paul Greengrass', '189976', '8.6', 'https://movie.douban.com/subject/1308767/', '谁说王家卫镜头很晃？');
INSERT INTO `mov_info` VALUES ('197', '地球上的星星', '2007', '印度', '剧情 儿童 家庭', ' 阿米尔·汗 Aamir Khan', '102254', '8.9', 'https://movie.douban.com/subject/2363506/', '天使保护事件始末。');
INSERT INTO `mov_info` VALUES ('198', '牯岭街少年杀人事件', '1991', '台湾', '剧情 犯罪', ' 杨德昌 Edward Yang', '128382', '8.8', 'https://movie.douban.com/subject/1292329/', '弱者送给弱者的一刀。');
INSERT INTO `mov_info` VALUES ('199', '撞车', '2004', '美国 德国', '犯罪 剧情', ' 保罗·哈吉斯 Paul Haggis', '198763', '8.6', 'https://movie.douban.com/subject/1388216/', '天使与魔鬼的冲撞。');
INSERT INTO `mov_info` VALUES ('200', '黑客帝国3：矩阵革命', '2003', '美国 澳大利亚', '动作 科幻', ' Andy Wachowski / Larry Wachowski', '188958', '8.6', 'https://movie.douban.com/subject/1302467/', '不得不说，《黑客帝国》系列是商业片与科幻、哲学完美结合的典范。');
INSERT INTO `mov_info` VALUES ('201', '惊魂记', '1960', '美国', '悬疑 惊悚 恐怖', ' Alfred Hitchcock', '102302', '8.9', 'https://movie.douban.com/subject/1293181/', '故事的反转与反转，分裂电影的始祖。');
INSERT INTO `mov_info` VALUES ('202', '青蛇', '1993', '香港', '剧情 奇幻 古装', ' 徐克 Hark Tsui', '265583', '8.5', 'https://movie.douban.com/subject/1303394/', '人生如此，浮生如斯。谁人言，花彼岸，此生情长意短。谁都是不懂爱的罢了。');
INSERT INTO `mov_info` VALUES ('203', '梦之安魂曲', '2000', '美国', '剧情', ' 达伦·阿伦诺夫斯基 Darren Aronofsky', '129619', '8.7', 'https://movie.douban.com/subject/1292270/', '一场没有春天的噩梦。');
INSERT INTO `mov_info` VALUES ('204', '海街日记', '2015', '日本', '剧情 家庭', ' 是枝裕和 Hirokazu Koreeda', '172443', '8.7', 'https://movie.douban.com/subject/25895901/', '是枝裕和的家庭习作。');
INSERT INTO `mov_info` VALUES ('205', '小萝莉的猴神大叔', '2015', '印度', '剧情 喜剧 动作', ' 卡比尔·汗 Kabir Khan', '214699', '8.5', 'https://movie.douban.com/subject/26393561/', '宝莱坞的萝莉与大叔。');
INSERT INTO `mov_info` VALUES ('206', '再次出发之纽约遇见你', '2013', '美国', '喜剧 爱情 音乐', ' 约翰·卡尼 John Carney', '209281', '8.5', 'https://movie.douban.com/subject/6874403/', '爱我就给我看你的播放列表。');
INSERT INTO `mov_info` VALUES ('207', '新龙门客栈', '1992', '香港 中国大陆', '剧情 动作 武侠 古装', ' 李惠民 Raymond Lee', '222035', '8.5', 'https://movie.douban.com/subject/1292287/', '嬉笑怒骂，调风动月。');
INSERT INTO `mov_info` VALUES ('208', '步履不停', '2008', '日本', '剧情 家庭', ' 是枝裕和 Hirokazu Koreeda', '110452', '8.8', 'https://movie.douban.com/subject/2222996/', '日本的家庭电影已经是世界巅峰了，步履不停是巅峰中的佳作。');
INSERT INTO `mov_info` VALUES ('209', '源代码', '2011', '美国 加拿大', '科幻 悬疑 惊悚', ' 邓肯·琼斯 Duncan Jones', '465689', '8.4', 'https://movie.douban.com/subject/3075287/', '邓肯·琼斯继《月球》之后再度奉献出一部精彩绝伦的科幻佳作。');
INSERT INTO `mov_info` VALUES ('210', '终结者2：审判日', '1991', '美国 法国', '动作 科幻', ' 詹姆斯·卡梅隆 James Cameron', '167932', '8.6', 'https://movie.douban.com/subject/1291844/', '少见的超越首部的续集，动作片中的经典。');
INSERT INTO `mov_info` VALUES ('211', '东京物语', '1953', '日本', '剧情 家庭', ' 小津安二郎 Yasujirô Ozu', '62144', '9.2', 'https://movie.douban.com/subject/1291568/', '东京那么大，如果有一天走失了，恐怕一辈子不能再相见。');
INSERT INTO `mov_info` VALUES ('212', '初恋这件小事', '2010', '泰国', '剧情 喜剧 爱情', ' 普特鹏·普罗萨卡·那·萨克那卡林 Puttipong Promsaka Na Sakolnakorn / 华森·波克彭...', '544400', '8.3', 'https://movie.douban.com/subject/4739952/', '黑小鸭速效美白记。');
INSERT INTO `mov_info` VALUES ('213', '疯狂的石头', '2006', '中国大陆 香港', '喜剧 犯罪', ' 宁浩 Hao Ning', '380155', '8.3', 'https://movie.douban.com/subject/1862151/', '中国版《两杆大烟枪》。');
INSERT INTO `mov_info` VALUES ('214', '城市之光', '1931', '美国', '喜剧 剧情 爱情', ' Charles Chaplin', '54980', '9.2', 'https://movie.douban.com/subject/1293908/', '永远的小人物，伟大的卓别林。');
INSERT INTO `mov_info` VALUES ('215', '绿里奇迹', '1999', '美国', '犯罪 剧情 奇幻 悬疑', ' Frank Darabont', '125861', '8.7', 'https://movie.douban.com/subject/1300374/', '天使暂时离开。');
INSERT INTO `mov_info` VALUES ('216', '爱在午夜降临前', '2013', '美国', '剧情 爱情', ' 理查德·林克莱特 Richard Linklater', '140485', '8.8', 'https://movie.douban.com/subject/10808442/', '所谓爱情，就是话唠一路，都不会心生腻烦，彼此嫌弃。');
INSERT INTO `mov_info` VALUES ('217', '无耻混蛋', '2009', '美国 德国', '剧情 犯罪', ' Quentin Tarantino', '258347', '8.5', 'https://movie.douban.com/subject/1438652/', '昆汀同学越来越变态了，比北野武还杜琪峰。');
INSERT INTO `mov_info` VALUES ('218', '末路狂花', '1991', '美国 法国', '犯罪 剧情 惊悚', ' 雷德利·斯科特 Ridley Scott', '121968', '8.7', 'https://movie.douban.com/subject/1291992/', '没有了退路，只好飞向自由。');
INSERT INTO `mov_info` VALUES ('219', '这个男人来自地球', '2007', '美国', '剧情 科幻', ' 理查德·沙因克曼 Richard Schenkman', '214196', '8.5', 'https://movie.douban.com/subject/2300586/', '科幻真正的魅力不是视觉效果能取代的。 ');
INSERT INTO `mov_info` VALUES ('220', '秒速5厘米', '2007', '日本', '动画 剧情 爱情', ' 新海诚 Makoto Shinkai', '357487', '8.3', 'https://movie.douban.com/subject/2043546/', '青春就是放弃和怀念。');
INSERT INTO `mov_info` VALUES ('221', '勇闯夺命岛', '1996', '美国', '动作 冒险', ' 迈克尔·贝 Michael Bay', '162727', '8.6', 'https://movie.douban.com/subject/1292728/', '类型片的极致。 ');
INSERT INTO `mov_info` VALUES ('222', 'E.T. 外星人', '1982', '美国', '剧情 科幻', ' Steven Spielberg', '182177', '8.5', 'https://movie.douban.com/subject/1294638/', '生病的E.T.皮肤的颜色就像柿子饼。');
INSERT INTO `mov_info` VALUES ('223', '变脸', '1997', '美国', '动作 科幻 犯罪 惊悚', ' 吴宇森 John Woo', '244790', '8.4', 'https://movie.douban.com/subject/1292659/', '当发哥的风衣、墨镜出现在了凯奇身上⋯⋯');
INSERT INTO `mov_info` VALUES ('224', '彗星来的那一夜', '2013', '美国 英国', '科幻 悬疑 惊悚', ' 詹姆斯·沃德·布柯特 James Ward Byrkit', '226362', '8.4', 'https://movie.douban.com/subject/25807345/', '小成本大魅力。');
INSERT INTO `mov_info` VALUES ('225', '碧海蓝天', '1988', '法国 美国 意大利', '剧情 爱情', ' Luc Besson', '116386', '8.7', 'https://movie.douban.com/subject/1300960/', '在那片深蓝中，感受来自大海的忧伤寂寞与美丽自由。');
INSERT INTO `mov_info` VALUES ('226', '卡萨布兰卡', '1942', '美国', '剧情 爱情 战争', ' Michael Curtiz', '143052', '8.6', 'https://movie.douban.com/subject/1296753/', '世界上有那么多女人那么多酒馆，但她偏偏走进我的这家。');
INSERT INTO `mov_info` VALUES ('227', '黄金三镖客', '1966', '意大利 西班牙 西德', '冒险 西部', ' Sergio Leone', '61480', '9.1', 'https://movie.douban.com/subject/1401118/', '最棒的西部片。');
INSERT INTO `mov_info` VALUES ('228', '发条橙', '1971', '英国 美国', '犯罪 剧情 科幻', ' Stanley Kubrick', '211358', '8.5', 'https://movie.douban.com/subject/1292233/', '我完全康复了。');
INSERT INTO `mov_info` VALUES ('229', '聚焦', '2015', '美国', '剧情 传记', ' 托马斯·麦卡锡 Thomas McCarthy', '151680', '8.8', 'https://movie.douban.com/subject/25954475/', '新闻人的理性求真。');
INSERT INTO `mov_info` VALUES ('230', '血钻', '2006', '美国 德国', '剧情 惊悚 冒险', ' 爱德华·兹威克 Edward Zwick', '161457', '8.6', 'https://movie.douban.com/subject/1428175/', '每个美丽事物背后都是滴血的现实。');
INSERT INTO `mov_info` VALUES ('231', '美国丽人', '1999', '美国', '剧情 爱情 家庭', ' 萨姆·门德斯 Sam Mendes', '212572', '8.5', 'https://movie.douban.com/subject/1292062/', '每个人的内心都是深不可测的大海。 ');
INSERT INTO `mov_info` VALUES ('232', '国王的演讲', '2010', '英国 澳大利亚 美国', '剧情 传记 历史', ' 汤姆·霍珀 Tom Hooper', '390431', '8.3', 'https://movie.douban.com/subject/4023638/', '皇上无话儿。');
INSERT INTO `mov_info` VALUES ('233', '海盗电台', '2009', '英国 德国 法国', '剧情 喜剧 音乐', ' 理查德·柯蒂斯 Richard Curtis', '182372', '8.6', 'https://movie.douban.com/subject/3007773/', '生命不止，摇滚不死。');
INSERT INTO `mov_info` VALUES ('234', '非常嫌疑犯', '1995', '德国 美国', '剧情 犯罪 悬疑 惊悚', ' 布莱恩·辛格 Bryan Singer', '139545', '8.6', 'https://movie.douban.com/subject/1292214/', '我不信仰上帝，但我敬畏上帝。');
INSERT INTO `mov_info` VALUES ('235', '荒野生存', '2007', '美国', '冒险 传记 剧情', ' 西恩·潘 Sean Penn', '146286', '8.6', 'https://movie.douban.com/subject/1905462/', '出门必备：本草纲目。');
INSERT INTO `mov_info` VALUES ('236', '黑鹰坠落', '2001', '美国', '动作 历史 战争', ' 雷德利·斯科特 Ridley Scott', '141428', '8.6', 'https://movie.douban.com/subject/1291824/', '还原真实而残酷的战争。');
INSERT INTO `mov_info` VALUES ('237', '我爱你', '2011', '韩国', '剧情 爱情', ' 秋昌民 Chang-min Choo', '70872', '9.0', 'https://movie.douban.com/subject/5908478/', '你要相信，这世上真的有爱存在，不管在什么年纪 ');
INSERT INTO `mov_info` VALUES ('238', '千钧一发', '1997', '美国', '剧情 科幻 惊悚', ' 安德鲁·尼科尔 Andrew Niccol', '107925', '8.7', 'https://movie.douban.com/subject/1300117/', '一部能引人思考的科幻励志片。');
INSERT INTO `mov_info` VALUES ('239', '英国病人', '1996', '美国 英国', '爱情 剧情 战争', ' 安东尼·明格拉 Anthony Minghella', '194093', '8.5', 'https://movie.douban.com/subject/1291853/', 'In memory');
INSERT INTO `mov_info` VALUES ('240', '遗愿清单', '2007', '美国', '冒险 喜剧 剧情', ' 罗伯·莱纳 Rob Reiner', '156798', '8.5', 'https://movie.douban.com/subject/1867345/', '用剩余不多的时间，去燃烧整个生命。');
INSERT INTO `mov_info` VALUES ('241', '2001太空漫游', '1968', '英国 美国', '科幻 惊悚 冒险', ' 斯坦利·库布里克 Stanley Kubrick', '116259', '8.7', 'https://movie.douban.com/subject/1292226/', '现代科幻电影的开山之作，最伟大导演的最伟大影片。');
INSERT INTO `mov_info` VALUES ('242', '荒岛余生', '2000', '美国', '冒险 剧情', ' 罗伯特·泽米吉斯 Robert Zemeckis', '160063', '8.5', 'https://movie.douban.com/subject/1298653/', '一个人的独角戏。');
INSERT INTO `mov_info` VALUES ('243', '迁徙的鸟', '2001', '法国 德国 意大利 西班牙 瑞士', '纪录片', ' 雅克·贝汉 Jacques Perrin / 雅克·克鲁奥德 Jacques Cluzaud', '57062', '9.1', 'https://movie.douban.com/subject/1292281/', '最美的飞翔。');
INSERT INTO `mov_info` VALUES ('244', '勇士', '2011', '美国', '剧情 运动 家庭', ' 加文·欧康诺 Gavin O\'Connor', '98407', '8.9', 'https://movie.douban.com/subject/3217169/', '热血沸腾，相当完美的娱乐拳击大餐。');
INSERT INTO `mov_info` VALUES ('245', '枪火', '1999', '香港', '剧情 动作 犯罪', ' 杜琪峰 Johnnie To', '116499', '8.7', 'https://movie.douban.com/subject/1300741/', '一群演技精湛的戏骨，奉献出一个精致的黑帮小品，成就杜琪峰群戏的巅峰之作。');
INSERT INTO `mov_info` VALUES ('246', '海蒂和爷爷', '2015', '德国 瑞士 南非', '剧情 冒险 家庭', ' 阿兰·葛斯彭纳 Alain Gsponer', '67111', '9.0', 'https://movie.douban.com/subject/25958717/', 'None');
INSERT INTO `mov_info` VALUES ('247', '叫我第一名', '2008', '美国', '剧情 传记', ' 彼得·维纳 Peter Werner', '122730', '8.6', 'https://movie.douban.com/subject/4798888/', '乐观比一切都有力量。');
INSERT INTO `mov_info` VALUES ('248', '燕尾蝶', '1996', '日本', '犯罪 剧情', ' 岩井俊二 Shunji Iwai', '117108', '8.6', 'https://movie.douban.com/subject/1307793/', '现实与童话交相辉映的旅程。');
INSERT INTO `mov_info` VALUES ('249', '穆赫兰道', '2001', '法国 美国', '剧情 悬疑 惊悚', ' 大卫·林奇 David Lynch', '266268', '8.3', 'https://movie.douban.com/subject/1292217/', '大卫·林奇的梦境迷宫。');
INSERT INTO `mov_info` VALUES ('250', '大卫·戈尔的一生', '2003', '美国 德国 英国', '剧情 犯罪 悬疑', ' Alan Parker', '113783', '8.6', 'https://movie.douban.com/subject/1305725/', '捍卫人权只是信仰，一点不妨碍其行为的残忍。');
