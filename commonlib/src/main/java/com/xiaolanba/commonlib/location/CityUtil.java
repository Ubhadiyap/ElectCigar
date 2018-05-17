package com.xiaolanba.commonlib.location;


import java.util.ArrayList;

/**
 * 本地城市列表，如果不需要默认的城市列表可忽略
 */
public class CityUtil {

    private static ArrayList<CityEntity> cityList = new ArrayList<CityEntity>();

    static {
        //		cityList.add(new CityEntity(110000, "北京", "北京", "bj", "Beijing", 131));
        cityList.add(new CityEntity(110100, "北京", "北京", "bj", "Beijing", 131));
        //		cityList.add(new CityEntity(120000, "天津", "天津", "tj", "Tianjin", 332));
        cityList.add(new CityEntity(120100, "天津", "天津", "tj", "Tianjin", 332));
        //		cityList.add(new CityEntity(130000, "河北", "河北", "hb", "Hebei", 25));
        cityList.add(new CityEntity(130100, "石家庄", "河北", "sjz", "Shijiazhuang", 150));
        cityList.add(new CityEntity(130200, "唐山", "河北", "ts", "Tangshan", 265));
        cityList.add(new CityEntity(130300, "秦皇岛", "河北", "qhd", "Qinhuangdao", 148));
        cityList.add(new CityEntity(130400, "邯郸", "河北", "hd", "Handan", 151));
        cityList.add(new CityEntity(130500, "邢台", "河北", "xt", "Xingtai", 266));
        cityList.add(new CityEntity(130600, "保定", "河北", "bd", "Baoding", 307));
        cityList.add(new CityEntity(130700, "张家口", "河北", "zjk", "Zhangjiakou", 264));
        cityList.add(new CityEntity(130800, "承德", "河北", "cd", "Chengde", 207));
        cityList.add(new CityEntity(130900, "沧州", "河北", "cz", "Cangzhou", 149));
        cityList.add(new CityEntity(131000, "廊坊", "河北", "lf", "Langfang", 191));
        cityList.add(new CityEntity(131100, "衡水", "河北", "hs", "Hengshui", 208));
        //		cityList.add(new CityEntity(140000, "山西", "山西", "sx", "Shanxi", 10));
        cityList.add(new CityEntity(140100, "太原", "山西", "ty", "Taiyuan", 176));
        cityList.add(new CityEntity(140200, "大同", "山西", "dt", "Datong", 355));
        cityList.add(new CityEntity(140300, "阳泉", "山西", "yq", "Yangquan", 357));
        cityList.add(new CityEntity(140400, "长治", "山西", "cz", "Changzhi", 356));
        cityList.add(new CityEntity(140500, "晋城", "山西", "jc", "Jincheng", 290));
        cityList.add(new CityEntity(140600, "朔州", "山西", "sz", "Shuozhou", 237));
        cityList.add(new CityEntity(140700, "晋中", "山西", "jz", "Jinzhong", 238));
        cityList.add(new CityEntity(140800, "运城", "山西", "yc", "Yuncheng", 328));
        cityList.add(new CityEntity(140900, "忻州", "山西", "xz", "Xinzhou", 367));
        cityList.add(new CityEntity(141000, "临汾", "山西", "lf", "Linfen", 368));
        cityList.add(new CityEntity(141100, "吕梁", "山西", "ll", "Lvliang", 327));
        //		cityList.add(new CityEntity(150000, "内蒙古", "内蒙古", "nmg", "neimenggu", 22));
        cityList.add(new CityEntity(150100, "呼和浩特", "内蒙古", "hhht", "Huhehaote", 321));
        cityList.add(new CityEntity(150200, "包头", "内蒙古", "bt", "Baotou", 229));
        cityList.add(new CityEntity(150300, "乌海", "内蒙古", "wh", "Wuhai", 123));
        cityList.add(new CityEntity(150400, "赤峰", "内蒙古", "cf", "Chifeng", 297));
        cityList.add(new CityEntity(150500, "通辽", "内蒙古", "tl", "Tongliao", 64));
        cityList.add(new CityEntity(150600, "鄂尔多斯", "内蒙古", "eeds", "eerduosi", 283));
        cityList.add(new CityEntity(150700, "呼伦贝尔", "内蒙古", "hlbe", "Hulunber", 61));
        cityList.add(new CityEntity(150800, "巴彦淖尔", "内蒙古", "byne", "Bayannaoer", 169));
        cityList.add(new CityEntity(150900, "乌兰察布", "内蒙古", "wlcb", "Wulanchabu", 168));
        cityList.add(new CityEntity(152200, "兴安盟", "内蒙古", "xam", "Xinganmeng", 62));
        cityList.add(new CityEntity(152500, "锡林郭勒盟", "内蒙古", "xlglm", "Xilinguolemeng", 63));
        cityList.add(new CityEntity(152900, "阿拉善盟", "内蒙古", "alsm", "Alashanmeng", 230));
        //		cityList.add(new CityEntity(210000, "辽宁", "辽宁", "ln", "Liaoning", 19));
        cityList.add(new CityEntity(210100, "沈阳", "辽宁", "sy", "Shenyang", 58));
        cityList.add(new CityEntity(210200, "大连", "辽宁", "dl", "Dalian", 167));
        cityList.add(new CityEntity(210300, "鞍山", "辽宁", "as", "Anshan", 320));
        cityList.add(new CityEntity(210400, "抚顺", "辽宁", "fs", "Fushun", 184));
        cityList.add(new CityEntity(210500, "本溪", "辽宁", "bx", "Benxi", 227));
        cityList.add(new CityEntity(210600, "丹东", "辽宁", "dd", "Dandong", 282));
        cityList.add(new CityEntity(210700, "锦州", "辽宁", "jz", "Jinzhou", 166));
        cityList.add(new CityEntity(210800, "营口", "辽宁", "yk", "Yingkou", 281));
        cityList.add(new CityEntity(210900, "阜新", "辽宁", "fx", "Fuxin", 59));
        cityList.add(new CityEntity(211000, "辽阳", "辽宁", "ly", "Liaoyang", 351));
        cityList.add(new CityEntity(211100, "盘锦", "辽宁", "pj", "Panjin", 228));
        cityList.add(new CityEntity(211200, "铁岭", "辽宁", "tl", "Tieling", 60));
        cityList.add(new CityEntity(211300, "朝阳", "辽宁", "cy", "Chaoyang", 280));
        cityList.add(new CityEntity(211400, "葫芦岛", "辽宁", "hld", "Huludao", 319));
        //		cityList.add(new CityEntity(220000, "吉林", "吉林", "jl", "Jilin", 9));
        cityList.add(new CityEntity(220100, "长春", "吉林", "cc", "Changchun", 53));
        cityList.add(new CityEntity(220300, "四平", "吉林", "sp", "Siping", 56));
        cityList.add(new CityEntity(220400, "辽源", "吉林", "ly", "Liaoyuan", 183));
        cityList.add(new CityEntity(220500, "通化", "吉林", "th", "Tonghua", 165));
        cityList.add(new CityEntity(220600, "白山", "吉林", "bs", "Baishan", 57));
        cityList.add(new CityEntity(220700, "松原", "吉林", "sy", "Songyuan", 52));
        cityList.add(new CityEntity(220800, "白城", "吉林", "bc", "Baicheng", 51));
        //		cityList.add(new CityEntity(230000, "黑龙江", "黑龙江", "hlj", "Heilongjiang", 2));
        cityList.add(new CityEntity(230100, "哈尔滨", "黑龙江", "heb", "Harbin", 48));
        cityList.add(new CityEntity(230200, "齐齐哈尔", "黑龙江", "qqhe", "Qiqihar", 41));
        cityList.add(new CityEntity(230300, "鸡西", "黑龙江", "jx", "Jixi", 46));
        cityList.add(new CityEntity(230400, "鹤岗", "黑龙江", "hg", "Hegang", 43));
        cityList.add(new CityEntity(230500, "双鸭山", "黑龙江", "sys", "Shuangyashan", 45));
        cityList.add(new CityEntity(230600, "大庆", "黑龙江", "dq", "Daqing", 50));
        cityList.add(new CityEntity(230700, "伊春", "黑龙江", "yc", "Yichun", 40));
        cityList.add(new CityEntity(230800, "佳木斯", "黑龙江", "jms", "Jiamusi", 42));
        cityList.add(new CityEntity(230900, "七台河", "黑龙江", "qth", "Qitaihe", 47));
        cityList.add(new CityEntity(231000, "牡丹江", "黑龙江", "mdj", "Mudanjiang", 49));
        cityList.add(new CityEntity(231100, "黑河", "黑龙江", "hh", "Heihe", 39));
        cityList.add(new CityEntity(231200, "绥化", "黑龙江", "sh", "Suihua", 44));
        //		cityList.add(new CityEntity(310000, "上海", "上海", "sh", "Shanghai", 289));
        cityList.add(new CityEntity(310100, "上海", "上海", "sh", "Shanghai", 289));
        //		cityList.add(new CityEntity(320000, "江苏", "江苏", "js", "Jiangsu", 18));
        cityList.add(new CityEntity(320100, "南京", "江苏", "nj", "Nanjing", 315));
        cityList.add(new CityEntity(320200, "无锡", "江苏", "wx", "Wuxi", 317));
        cityList.add(new CityEntity(320300, "徐州", "江苏", "xz", "Xuzhou", 316));
        cityList.add(new CityEntity(320400, "常州", "江苏", "cz", "Changzhou", 348));
        cityList.add(new CityEntity(320500, "苏州", "江苏", "sz", "Suzhou", 224));
        cityList.add(new CityEntity(320600, "南通", "江苏", "nt", "Nantong", 161));
        cityList.add(new CityEntity(320700, "连云港", "江苏", "lyg", "Lianyungang", 347));
        cityList.add(new CityEntity(320800, "淮安", "江苏", "ha", "Huai'an", 162));
        cityList.add(new CityEntity(320900, "盐城", "江苏", "yc", "Yancheng", 223));
        cityList.add(new CityEntity(321000, "扬州", "江苏", "yz", "Yangzhou", 346));
        cityList.add(new CityEntity(321100, "镇江", "江苏", "zj", "Zhenjiang", 160));
        cityList.add(new CityEntity(321200, "泰州", "江苏", "tz", "Taizhou", 276));
        cityList.add(new CityEntity(321300, "宿迁", "江苏", "sq", "Suqian", 277));
        //		cityList.add(new CityEntity(330000, "浙江", "浙江", "zj", "Zhejiang", 29));
        cityList.add(new CityEntity(330100, "杭州", "浙江", "hz", "Hangzhou", 179));
        cityList.add(new CityEntity(330200, "宁波", "浙江", "nb", "Ningbo", 180));
        cityList.add(new CityEntity(330300, "温州", "浙江", "wz", "Wenzhou", 178));
        cityList.add(new CityEntity(330400, "嘉兴", "浙江", "jx", "Jiaxing", 334));
        cityList.add(new CityEntity(330500, "湖州", "浙江", "hz", "Huzhou", 294));
        cityList.add(new CityEntity(330600, "绍兴", "浙江", "sx", "Shaoxing", 293));
        cityList.add(new CityEntity(330700, "金华", "浙江", "jh", "Jinhua", 333));
        cityList.add(new CityEntity(330800, "衢州", "浙江", "qz", "Quzhou", 243));
        cityList.add(new CityEntity(330900, "舟山", "浙江", "zs", "Zhoushan", 245));
        cityList.add(new CityEntity(331000, "台州", "浙江", "tz", "Taizhou", 244));
        cityList.add(new CityEntity(331100, "丽水", "浙江", "ls", "Lishui", 292));
        //		cityList.add(new CityEntity(340000, "安徽", "安徽", "ah", "Anhui", 23));
        cityList.add(new CityEntity(340100, "合肥", "安徽", "hf", "Hefei", 127));
        cityList.add(new CityEntity(340200, "芜湖", "安徽", "wh", "Wuhu", 129));
        cityList.add(new CityEntity(340300, "蚌埠", "安徽", "bb", "Bengbu", 126));
        cityList.add(new CityEntity(340400, "淮南", "安徽", "hn", "Huainan", 250));
        cityList.add(new CityEntity(340500, "马鞍山", "安徽", "mas", "Ma'anshan", 358));
        cityList.add(new CityEntity(340600, "淮北", "安徽", "hb", "Huaibei", 253));
        cityList.add(new CityEntity(340700, "铜陵", "安徽", "tl", "Tongling", 337));
        cityList.add(new CityEntity(340800, "安庆", "安徽", "aq", "Anqing", 130));
        cityList.add(new CityEntity(341000, "黄山", "安徽", "hs", "Huangshan", 252));
        cityList.add(new CityEntity(341100, "滁州", "安徽", "cz", "Chuzhou", 189));
        cityList.add(new CityEntity(341200, "阜阳", "安徽", "fy", "Fuyang", 128));
        cityList.add(new CityEntity(341300, "宿州", "安徽", "sz", "Suzhou", 370));
        cityList.add(new CityEntity(341500, "六安", "安徽", "la", "Lu'an", 298));
        cityList.add(new CityEntity(341600, "亳州", "安徽", "bz", "Bozhou", 188));
        cityList.add(new CityEntity(341700, "池州", "安徽", "cz", "Chizhou", 299));
        cityList.add(new CityEntity(341800, "宣城", "安徽", "xc", "Xuancheng", 190));
        //		cityList.add(new CityEntity(350000, "福建", "福建", "fj", "Fujian", 16));
        cityList.add(new CityEntity(350100, "福州", "福建", "fz", "Fuzhou", 300));
        cityList.add(new CityEntity(350200, "厦门", "福建", "xm", "Xiamen", 194));
        cityList.add(new CityEntity(350300, "莆田", "福建", "pt", "Putian", 195));
        cityList.add(new CityEntity(350400, "三明", "福建", "sm", "Sanming", 254));
        cityList.add(new CityEntity(350500, "泉州", "福建", "qz", "Quanzhou", 134));
        cityList.add(new CityEntity(350600, "漳州", "福建", "zz", "Zhangzhou", 255));
        cityList.add(new CityEntity(350700, "南平", "福建", "np", "Nanping", 133));
        cityList.add(new CityEntity(350800, "龙岩", "福建", "ly", "Longyan", 193));
        cityList.add(new CityEntity(350900, "宁德", "福建", "nd", "Ningde", 192));
        //		cityList.add(new CityEntity(360000, "江西", "江西", "jx", "Jiangxi", 31));
        cityList.add(new CityEntity(360100, "南昌", "江西", "nc", "Nanchang", 163));
        cityList.add(new CityEntity(360200, "景德镇", "江西", "jdz", "Jingdezhen", 225));
        cityList.add(new CityEntity(360300, "萍乡", "江西", "px", "Pingxiang", 350));
        cityList.add(new CityEntity(360400, "九江", "江西", "jj", "Jiujiang", 349));
        cityList.add(new CityEntity(360500, "新余", "江西", "xy", "Xinyu", 164));
        cityList.add(new CityEntity(360600, "鹰潭", "江西", "yt", "Yingtan", 279));
        cityList.add(new CityEntity(360700, "赣州", "江西", "gz", "Ganzhou", 365));
        cityList.add(new CityEntity(360800, "吉安", "江西", "ja", "Ji'an", 318));
        cityList.add(new CityEntity(360900, "宜春", "江西", "yc", "Yichun", 278));
        cityList.add(new CityEntity(361000, "抚州", "江西", "fz", "Fuzhou", 226));
        cityList.add(new CityEntity(361100, "上饶", "江西", "sr", "Shangrao", 364));
        //		cityList.add(new CityEntity(370000, "山东", "山东", "sd", "Shandong", 8));
        cityList.add(new CityEntity(370100, "济南", "山东", "jn", "Jinan", 288));
        cityList.add(new CityEntity(370200, "青岛", "山东", "qd", "Qingdao", 236));
        cityList.add(new CityEntity(370300, "淄博", "山东", "zb", "Zibo", 354));
        cityList.add(new CityEntity(370400, "枣庄", "山东", "zz", "Zaozhuang", 172));
        cityList.add(new CityEntity(370500, "东营", "山东", "dy", "Dongying", 174));
        cityList.add(new CityEntity(370600, "烟台", "山东", "yt", "Yantai", 326));
        cityList.add(new CityEntity(370700, "潍坊", "山东", "wf", "Weifang", 287));
        cityList.add(new CityEntity(370800, "济宁", "山东", "jn", "Jining", 286));
        cityList.add(new CityEntity(370900, "泰安", "山东", "ta", "Tai'an", 325));
        cityList.add(new CityEntity(371000, "威海", "山东", "wh", "Weihai", 175));
        cityList.add(new CityEntity(371100, "日照", "山东", "rz", "Rizhao", 173));
        cityList.add(new CityEntity(371200, "莱芜", "山东", "lw", "Laiwu", 124));
        cityList.add(new CityEntity(371300, "临沂", "山东", "ly", "Linyi", 234));
        cityList.add(new CityEntity(371400, "德州", "山东", "dz", "Dezhou", 372));
        cityList.add(new CityEntity(371500, "聊城", "山东", "lc", "Liaocheng", 366));
        cityList.add(new CityEntity(371600, "滨州", "山东", "bz", "Binzhou", 235));
        cityList.add(new CityEntity(371700, "菏泽", "山东", "hz", "Heze", 353));
        //		cityList.add(new CityEntity(410000, "河南", "河南", "hn", "Henan", 30));
        cityList.add(new CityEntity(410100, "郑州", "河南", "zz", "Zhengzhou", 268));
        cityList.add(new CityEntity(410200, "开封", "河南", "kf", "Kaifeng", 210));
        cityList.add(new CityEntity(410300, "洛阳", "河南", "ly", "Luoyang", 153));
        cityList.add(new CityEntity(410400, "平顶山", "河南", "pds", "Pingdingshan", 213));
        cityList.add(new CityEntity(410500, "安阳", "河南", "ay", "Anyang", 267));
        cityList.add(new CityEntity(410600, "鹤壁", "河南", "hb", "Hebi", 215));
        cityList.add(new CityEntity(410700, "新乡", "河南", "xx", "Xinxiang", 152));
        cityList.add(new CityEntity(410800, "焦作", "河南", "jz", "Jiaozuo", 211));
        cityList.add(new CityEntity(410900, "濮阳", "河南", "py", "Puyang", 209));
        cityList.add(new CityEntity(411000, "许昌", "河南", "xc", "Xuchang", 155));
        cityList.add(new CityEntity(411100, "漯河", "河南", "lh", "Luohe", 344));
        cityList.add(new CityEntity(411200, "三门峡", "河南", "smx", "Sanmenxia", 212));
        cityList.add(new CityEntity(411300, "南阳", "河南", "ny", "Nanyang", 309));
        cityList.add(new CityEntity(411400, "商丘", "河南", "sq", "Shangqiu", 154));
        cityList.add(new CityEntity(411500, "信阳", "河南", "xy", "Xinyang", 214));
        cityList.add(new CityEntity(411600, "周口", "河南", "zk", "Zhoukou", 308));
        cityList.add(new CityEntity(411700, "驻马店", "河南", "zmd", "Zhumadian", 269));
        //		cityList.add(new CityEntity(420000, "湖北", "湖北", "hb", "Hubei", 15));
        cityList.add(new CityEntity(420100, "武汉", "湖北", "wh", "Wuhan", 218));
        cityList.add(new CityEntity(420200, "黄石", "湖北", "hs", "Huangshi", 311));
        cityList.add(new CityEntity(420300, "十堰", "湖北", "sy", "Shiyan", 216));
        cityList.add(new CityEntity(420500, "宜昌", "湖北", "yc", "Yichang", 270));
        cityList.add(new CityEntity(420600, "襄阳", "湖北", "xy", "Xiangyang", 156));
        cityList.add(new CityEntity(420700, "鄂州", "湖北", "ez", "Ezhou", 122));
        cityList.add(new CityEntity(420800, "荆门", "湖北", "jm", "Jingmen", 217));
        cityList.add(new CityEntity(420900, "孝感", "湖北", "xg", "Xiaogan", 310));
        cityList.add(new CityEntity(421000, "荆州", "湖北", "jz", "Jingzhou", 157));
        cityList.add(new CityEntity(421100, "黄冈", "湖北", "hg", "Huanggang", 271));
        cityList.add(new CityEntity(421200, "咸宁", "湖北", "xn", "Xianning", 362));
        cityList.add(new CityEntity(421300, "随州", "湖北", "sz", "Suizhou", 371));
        //		cityList.add(new CityEntity(430000, "湖南", "湖南", "hn", "Hunan", 26));
        cityList.add(new CityEntity(430100, "长沙", "湖南", "cs", "Changsha", 158));
        cityList.add(new CityEntity(430200, "株洲", "湖南", "zz", "Zhuzhou", 222));
        cityList.add(new CityEntity(430300, "湘潭", "湖南", "xt", "Xiangtan", 313));
        cityList.add(new CityEntity(430400, "衡阳", "湖南", "hy", "Hengyang", 159));
        cityList.add(new CityEntity(430500, "邵阳", "湖南", "sy", "Shaoyang", 273));
        cityList.add(new CityEntity(430600, "岳阳", "湖南", "yy", "Yueyang", 220));
        cityList.add(new CityEntity(430700, "常德", "湖南", "cd", "Changde", 219));
        cityList.add(new CityEntity(430800, "张家界", "湖南", "zjj", "Zhangjiajie", 312));
        cityList.add(new CityEntity(430900, "益阳", "湖南", "yy", "Yiyang", 272));
        cityList.add(new CityEntity(431000, "郴州", "湖南", "cz", "Chenzhou", 275));
        cityList.add(new CityEntity(431100, "永州", "湖南", "yz", "Yongzhou", 314));
        cityList.add(new CityEntity(431200, "怀化", "湖南", "hh", "Huaihua", 363));
        cityList.add(new CityEntity(431300, "娄底", "湖南", "ld", "Loudi", 221));
        //		cityList.add(new CityEntity(440000, "广东", "广东", "gd", "Guangdong", 7));
        cityList.add(new CityEntity(440100, "广州", "广东", "gz", "Guangzhou", 257));
        cityList.add(new CityEntity(440200, "韶关", "广东", "sg", "Shaoguan", 137));
        cityList.add(new CityEntity(440300, "深圳", "广东", "sz", "Shenzhen", 340));
        cityList.add(new CityEntity(440400, "珠海", "广东", "zh", "Zhuhai", 140));
        cityList.add(new CityEntity(440500, "汕头", "广东", "st", "Shantou", 303));
        cityList.add(new CityEntity(440600, "佛山", "广东", "fs", "Foshan", 138));
        cityList.add(new CityEntity(440700, "江门", "广东", "jm", "Jiangmen", 302));
        cityList.add(new CityEntity(440800, "湛江", "广东", "zj", "Zhanjiang", 198));
        cityList.add(new CityEntity(440900, "茂名", "广东", "mm", "Maoming", 139));
        cityList.add(new CityEntity(441200, "肇庆", "广东", "zq", "Zhaoqing", 338));
        cityList.add(new CityEntity(441300, "惠州", "广东", "hz", "Huizhou", 301));
        cityList.add(new CityEntity(441400, "梅州", "广东", "mz", "Meizhou", 141));
        cityList.add(new CityEntity(441500, "汕尾", "广东", "sw", "Shanwei", 339));
        cityList.add(new CityEntity(441600, "河源", "广东", "hy", "Heyuan", 200));
        cityList.add(new CityEntity(441700, "阳江", "广东", "yj", "Yangjiang", 199));
        cityList.add(new CityEntity(441800, "清远", "广东", "qy", "Qingyuan", 197));
        cityList.add(new CityEntity(441900, "东莞", "广东", "dg", "Dongguan", 119));
        cityList.add(new CityEntity(442000, "中山", "广东", "zs", "Zhongshan", 187));
        cityList.add(new CityEntity(445100, "潮州", "广东", "cz", "Chaozhou", 201));
        cityList.add(new CityEntity(445200, "揭阳", "广东", "jy", "Jieyang", 259));
        cityList.add(new CityEntity(445300, "云浮", "广东", "yf", "Yunfu", 258));
        //		cityList.add(new CityEntity(450000, "广西", "广西", "gx", "Guangxi", 17));
        cityList.add(new CityEntity(450100, "南宁", "广西", "nn", "Nanning", 261));
        cityList.add(new CityEntity(450200, "柳州", "广西", "lz", "Liuzhou", 305));
        cityList.add(new CityEntity(450300, "桂林", "广西", "gl", "Guilin", 142));
        cityList.add(new CityEntity(450400, "梧州", "广西", "wz", "Wuzhou", 304));
        cityList.add(new CityEntity(450500, "北海", "广西", "bh", "Beihai", 295));
        cityList.add(new CityEntity(450600, "防城港", "广西", "fcg", "Fangchenggang", 204));
        cityList.add(new CityEntity(450700, "钦州", "广西", "qz", "Qinzhou", 145));
        cityList.add(new CityEntity(450800, "贵港", "广西", "gg", "Guigang", 341));
        cityList.add(new CityEntity(450900, "玉林", "广西", "yl", "Yulin", 361));
        cityList.add(new CityEntity(451000, "百色", "广西", "bs", "Baise", 203));
        cityList.add(new CityEntity(451100, "贺州", "广西", "hz", "Hezhou", 260));
        cityList.add(new CityEntity(451200, "河池", "广西", "hc", "Hechi", 143));
        cityList.add(new CityEntity(451300, "来宾", "广西", "lb", "Laibin", 202));
        cityList.add(new CityEntity(451400, "崇左", "广西", "cz", "Chongzuo", 144));
        //		cityList.add(new CityEntity(460000, "海南", "海南", "hn", "Hainan", 21));
        cityList.add(new CityEntity(460100, "海口", "海南", "hk", "Haikou", 125));
        cityList.add(new CityEntity(460200, "三亚", "海南", "sy", "Sanya", 121));
        //		cityList.add(new CityEntity(500000, "重庆", "重庆", "cq", "Chongqing", 132));
        cityList.add(new CityEntity(500100, "重庆", "重庆", "cq", "Chongqing", 132));
        //		cityList.add(new CityEntity(510000, "四川", "四川", "sc", "Sichuan", 32));
        cityList.add(new CityEntity(510100, "成都", "四川", "cd", "Chengdu", 75));
        cityList.add(new CityEntity(510300, "自贡", "四川", "zg", "Zigong", 78));
        cityList.add(new CityEntity(510400, "攀枝花", "四川", "pzh", "Panzhihua", 81));
        cityList.add(new CityEntity(510500, "泸州", "四川", "lz", "Luzhou", 331));
        cityList.add(new CityEntity(510600, "德阳", "四川", "dy", "Deyang", 74));
        cityList.add(new CityEntity(510700, "绵阳", "四川", "my", "Mianyang", 240));
        cityList.add(new CityEntity(510800, "广元", "四川", "gy", "Guangyuan", 329));
        cityList.add(new CityEntity(510900, "遂宁", "四川", "sn", "Suining", 330));
        cityList.add(new CityEntity(511000, "内江", "四川", "nj", "Neijiang", 248));
        cityList.add(new CityEntity(511100, "乐山", "四川", "ls", "Leshan", 79));
        cityList.add(new CityEntity(511300, "南充", "四川", "nc", "Nanchong", 291));
        cityList.add(new CityEntity(511400, "眉山", "四川", "ms", "Meishan", 77));
        cityList.add(new CityEntity(511500, "宜宾", "四川", "yb", "Yibin", 186));
        cityList.add(new CityEntity(511600, "广安", "四川", "ga", "Guang'an", 241));
        cityList.add(new CityEntity(511700, "达州", "四川", "dz", "Dazhou", 369));
        cityList.add(new CityEntity(511800, "雅安", "四川", "ya", "Ya'an", 76));
        cityList.add(new CityEntity(511900, "巴中", "四川", "bz", "Bazhong", 239));
        cityList.add(new CityEntity(512000, "资阳", "四川", "zy", "Ziyang", 242));
        //		cityList.add(new CityEntity(520000, "贵州", "贵州", "gz", "Guizhou", 24));
        cityList.add(new CityEntity(520100, "贵阳", "贵州", "gy", "Guiyang", 146));
        cityList.add(new CityEntity(520200, "六盘水", "贵州", "lps", "Liupanshui", 147));
        cityList.add(new CityEntity(520300, "遵义", "贵州", "zy", "Zunyi", 262));
        cityList.add(new CityEntity(520400, "安顺", "贵州", "as", "Anshun", 263));
        //		cityList.add(new CityEntity(530000, "云南", "云南", "yn", "Yunnan", 28));
        cityList.add(new CityEntity(530100, "昆明", "云南", "km", "Kunming", 104));
        cityList.add(new CityEntity(530300, "曲靖", "云南", "qj", "Qujing", 249));
        cityList.add(new CityEntity(530400, "玉溪", "云南", "yx", "Yuxi", 106));
        cityList.add(new CityEntity(530500, "保山", "云南", "bs", "Baoshan", 112));
        cityList.add(new CityEntity(530600, "昭通", "云南", "zt", "Zhaotong", 336));
        cityList.add(new CityEntity(530700, "丽江", "云南", "lj", "Lijiang", 114));
        cityList.add(new CityEntity(530800, "普洱", "云南", "pe", "Puer", 108));
        cityList.add(new CityEntity(530900, "临沧", "云南", "lc", "Lincang", 110));
        //		cityList.add(new CityEntity(540000, "西藏", "西藏", "xz", "Tibet", 13));
        cityList.add(new CityEntity(540100, "拉萨", "西藏", "ls", "Lhasa", 100));
        cityList.add(new CityEntity(610000, "陕西", "陕西", "sx", "Shaanxi", 27));
        cityList.add(new CityEntity(610100, "西安", "陕西", "xa", "Xi'an", 233));
        cityList.add(new CityEntity(610200, "铜川", "陕西", "tc", "Tongchuan", 232));
        cityList.add(new CityEntity(610300, "宝鸡", "陕西", "bj", "Baoji", 171));
        cityList.add(new CityEntity(610400, "咸阳", "陕西", "xy", "Xianyang", 323));
        cityList.add(new CityEntity(610500, "渭南", "陕西", "wn", "Weinan", 170));
        cityList.add(new CityEntity(610600, "延安", "陕西", "ya", "Yan'an", 284));
        cityList.add(new CityEntity(610700, "汉中", "陕西", "hz", "Hanzhong", 352));
        cityList.add(new CityEntity(610800, "榆林", "陕西", "yl", "Yulin", 231));
        cityList.add(new CityEntity(610900, "安康", "陕西", "ak", "Ankang", 324));
        cityList.add(new CityEntity(611000, "商洛", "陕西", "sl", "Shangluo", 285));
        //		cityList.add(new CityEntity(620000, "甘肃", "甘肃", "gs", "Gansu", 6));
        cityList.add(new CityEntity(620100, "兰州", "甘肃", "lz", "Lanzhou", 36));
        cityList.add(new CityEntity(620200, "嘉峪关", "甘肃", "jyg", "Jiayuguan", 33));
        cityList.add(new CityEntity(620300, "金昌", "甘肃", "jc", "Jinchang", 34));
        cityList.add(new CityEntity(620400, "白银", "甘肃", "by", "Baiyin", 35));
        cityList.add(new CityEntity(620500, "天水", "甘肃", "ts", "Tianshui", 196));
        cityList.add(new CityEntity(620600, "武威", "甘肃", "ww", "Wuwei", 118));
        cityList.add(new CityEntity(620700, "张掖", "甘肃", "zy", "Zhangye", 117));
        cityList.add(new CityEntity(620800, "平凉", "甘肃", "pl", "Pingliang", 359));
        cityList.add(new CityEntity(620900, "酒泉", "甘肃", "jq", "Jiuquan", 37));
        cityList.add(new CityEntity(621000, "庆阳", "甘肃", "qy", "Qingyang", 135));
        cityList.add(new CityEntity(621100, "定西", "甘肃", "dx", "Dingxi", 136));
        cityList.add(new CityEntity(621200, "陇南", "甘肃", "ln", "Longnan", 256));
        //		cityList.add(new CityEntity(630000, "青海", "青海", "qh", "Qinghai", 11));
        cityList.add(new CityEntity(630100, "西宁", "青海", "xn", "Xining", 66));
        cityList.add(new CityEntity(632500, "海南", "青海", "hn", "Hainan", 21));
        //		cityList.add(new CityEntity(640000, "宁夏", "宁夏", "nx", "Ningxia", 20));
        cityList.add(new CityEntity(640100, "银川", "宁夏", "yc", "Yinchuan", 360));
        cityList.add(new CityEntity(640200, "石嘴山", "宁夏", "szs", "Shizuishan", 335));
        cityList.add(new CityEntity(640300, "吴忠", "宁夏", "wz", "Wuzhong", 322));
        cityList.add(new CityEntity(640400, "固原", "宁夏", "gy", "Guyuan", 246));
        cityList.add(new CityEntity(640500, "中卫", "宁夏", "zw", "Zhongwei", 181));
        //		cityList.add(new CityEntity(650000, "新疆", "新疆", "xj", "Xinjiang", 12));
        cityList.add(new CityEntity(650100, "乌鲁木齐", "新疆", "wlmq", "Wulumuqi", 92));
        cityList.add(new CityEntity(650200, "克拉玛依", "新疆", "klmy", "Kelamayi", 95));
        cityList.add(new CityEntity(810000, "香港", "香港", "xg", "Xianggang", 2912));

    }

    /**
     * 获取对应code
     *
     * @param cityCode
     * @return
     */
    public static String getCityCode(String cityCode) {
        int size = cityList.size();
        for (int i = 0; i < size; i++) {
            CityEntity cityEntity = cityList.get(i);
            if (String.valueOf(cityEntity.thirdCode).equals(cityCode)) {
                return String.valueOf(cityEntity.id);
            }

        }
        return "0";
    }

    public static ArrayList<CityEntity> getCityList() {
        return cityList;
    }
}