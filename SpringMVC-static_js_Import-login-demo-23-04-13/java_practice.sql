/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : java_practice

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 13/04/2023 12:49:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_brand
-- ----------------------------
DROP TABLE IF EXISTS `tb_brand`;
CREATE TABLE `tb_brand`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `company_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ordered` int(0) NULL DEFAULT NULL,
  `descripion` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_brand
-- ----------------------------
INSERT INTO `tb_brand` VALUES (1, '三只松鼠', '三只松鼠股份有限公司', 5, '好吃不上火', 0);
INSERT INTO `tb_brand` VALUES (2, '华为', '华为技术有限公司', 100, '华为致力于把数字世界带入每个人,每个家庭,每个组织,构建万物互联智能世界', 1);
INSERT INTO `tb_brand` VALUES (3, '小米', '小米科技有限公司', 50, 'are you ok', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NULL DEFAULT NULL,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  `gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `emall` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (NULL, 'admin3', '123456', 23, '男', '12345@qq.com');
INSERT INTO `user` VALUES (NULL, 'admin2', '123456', 23, '男', '12345@qq.com');
INSERT INTO `user` VALUES (NULL, 'admin4', '123456', 23, '男', '12345@qq.com');
INSERT INTO `user` VALUES (NULL, 'admin', '123456', 23, '男', '12345@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
