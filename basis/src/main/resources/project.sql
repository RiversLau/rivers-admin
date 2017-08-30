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