-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        9.0.1 - MySQL Community Server - GPL
-- 서버 OS:                        Linux
-- HeidiSQL 버전:                  12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- solo_pj 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `solo_pj` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `solo_pj`;

-- 테이블 solo_pj.Music 구조 내보내기
CREATE TABLE IF NOT EXISTS `Music` (
  `index` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `singer` varchar(50) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `program` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 solo_pj.Music:~0 rows (대략적) 내보내기

-- 테이블 solo_pj.Music_Rating 구조 내보내기
CREATE TABLE IF NOT EXISTS `Music_Rating` (
  `U_id_MR` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `index_MR` int NOT NULL,
  `rating` double DEFAULT NULL,
  PRIMARY KEY (`U_id_MR`,`index_MR`) USING BTREE,
  KEY `index_MR` (`index_MR`,`U_id_MR`) USING BTREE,
  CONSTRAINT `index_MR` FOREIGN KEY (`index_MR`) REFERENCES `Music` (`index`),
  CONSTRAINT `U_id_MR` FOREIGN KEY (`U_id_MR`) REFERENCES `User` (`U_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 solo_pj.Music_Rating:~0 rows (대략적) 내보내기

-- 테이블 solo_pj.PlayList_Music 구조 내보내기
CREATE TABLE IF NOT EXISTS `PlayList_Music` (
  `PM_id` int NOT NULL AUTO_INCREMENT,
  `UP_id` int DEFAULT NULL,
  `index` int DEFAULT NULL,
  PRIMARY KEY (`PM_id`),
  KEY `UP_id` (`UP_id`),
  KEY `index` (`index`),
  CONSTRAINT `index` FOREIGN KEY (`index`) REFERENCES `Music` (`index`),
  CONSTRAINT `UP_id` FOREIGN KEY (`UP_id`) REFERENCES `User_PlayList` (`UP_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 solo_pj.PlayList_Music:~0 rows (대략적) 내보내기

-- 테이블 solo_pj.User 구조 내보내기
CREATE TABLE IF NOT EXISTS `User` (
  `U_id` varchar(50) NOT NULL,
  `U_name` varchar(50) NOT NULL,
  `U_age` int NOT NULL DEFAULT (0),
  `U_gender` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`U_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 solo_pj.User:~0 rows (대략적) 내보내기

-- 테이블 solo_pj.User_PlayList 구조 내보내기
CREATE TABLE IF NOT EXISTS `User_PlayList` (
  `UP_id` int NOT NULL AUTO_INCREMENT,
  `pli_name` varchar(50) NOT NULL DEFAULT '0',
  `U_id` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`UP_id`),
  KEY `U_id` (`U_id`),
  CONSTRAINT `U_id` FOREIGN KEY (`U_id`) REFERENCES `User` (`U_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 solo_pj.User_PlayList:~0 rows (대략적) 내보내기

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
