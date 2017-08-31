CREATE TABLE `admin` (
  `id` int(12) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(30) NOT NULL COMMENT '用户名，登录账号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `status` int(2) NOT NULL DEFAULT 1 COMMENT '0：删除 1：禁用 2：可用',
  `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '联系电话',
  `head_image_url` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='后台管理系统用户表';

insert into `admin`(username, password, status, phone, head_image_url, create_time, update_time)
    values('administrator', 'e10adc3949ba59abbe56e057f20f883e', 2, '18312415012', '', '2017-08-30 17:33:20', '2017-08-30 17:33:20');

CREATE TABLE `product` (
  `id` int(18) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '产品名称',
  `code` varchar(20) NOT NULL COMMENT '产品编码',
  `brand_id` int(12) unsigned NOT NULL COMMENT '品牌',
  `product_abstract` varchar(200) NOT NULL COMMENT '适应病症',
  `description` longtext NOT NULL COMMENT '产品描述',
  `status` tinyint(2) NOT NULL COMMENT '产品状态：0:删除 1：下架，2：下架',
  `icon` varchar(500) NOT NULL COMMENT '图片Icon的url',
  `evaluate_num` int(8) NOT NULL COMMENT '评论数',
  `price` decimal(12,2) NOT NULL COMMENT '价格',
  `market_price` decimal(12,2) DEFAULT -1 COMMENT '市场价格',
  `order_num` smallint(6) NOT NULL DEFAULT '999' COMMENT '排序字段',
  `manufacturer` varchar(50) NOT NULL COMMENT '生产厂商',
  `spec_template_id` int(12) unsigned DEFAULT NULL COMMENT '产品规格模板ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

CREATE TABLE `brand` (
  `id` int(12) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '品牌名称',
  `description` text NOT NULL COMMENT '品牌描述',
  `logo_url` varchar(200) NOT NULL COMMENT '品牌图片',
  `status` tinyint(4) NOT NULL COMMENT '状态，0：删除，1：禁用，2：可用',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

insert into brand(name, logo_url, status, description) values('科莱瑞迪', 'http://www.klarity-medical.com/templates/default/images/logo.png', 2, '广州科莱瑞迪医疗器材股份有限公司成立于2000年12月，是肿瘤放疗和骨科康复用低温热塑材料相关生物医学工程产品的设计、研发、制造、销售与技术服务为一体的国家高新技术企业。公司位于广州经济技术开发区广州科技园内，拥有7000多平米洁净生产厂房及完善的研发、生产、仓储物流、技术服务和销售团队。公司通过了ISO9001：2008和ISO13485:2003质量管理体系认证，获得SFDA、CE、FDA、日本厚生省等权威认证。拥有年产20万平米低温热塑材料、万余套碳纤维固定系统及2万多个人体真空固定袋的生产能力，是目前国内同类产品产量最大、品种最齐全的生产企业');