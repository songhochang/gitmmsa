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


-- SKLL_Library 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `SKLL_Library` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `SKLL_Library`;

-- 테이블 SKLL_Library.Book 구조 내보내기
CREATE TABLE IF NOT EXISTS `Book` (
  `b_id` int NOT NULL AUTO_INCREMENT,
  `b_name` varchar(50) NOT NULL DEFAULT '0',
  `b_type` varchar(50) NOT NULL DEFAULT '0',
  `publisher` varchar(50) NOT NULL DEFAULT '0',
  `country` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 SKLL_Library.Book:~62 rows (대략적) 내보내기
INSERT INTO `Book` (`b_id`, `b_name`, `b_type`, `publisher`, `country`) VALUES
	(1, '나를 위한 하루 선물', '자기계발', '함께북스', '국내도서'),
	(2, '자전거 메인터넌스', '건강/취미', '함께북스', '국내도서'),
	(3, '우물 밖 개구리', '에세이', '함께북스', '국내도서'),
	(4, '위대한 개츠비', '소설', '함께북스', '해외도서'),
	(5, '당신의 음악 취향은', '예술/음악', '에포크', '국내도서'),
	(6, '지휘의 발견', '예술/음악', '에포크', '국내도서'),
	(7, '드래곤 라자(1)', '소설(판타지)', '황금가지', '국내도서'),
	(8, '얼음나무 숲', '소설(예술)', '황금가지', '국내도서'),
	(9, '붉은 집 살인사건', '소설(추리/미스터리)', '황금가지', '국내도서'),
	(10, '피를 마시는 새(1)', '소설(판타지)', '황금가지', '국내도서'),
	(11, '쥐', '만화(역사/시대물)', '아름드리미디어', '해외도서'),
	(12, '맨발의 겐', '만화(역사/드라마)', '아름드리미디어', '해외도서'),
	(13, '톨스토이(단편선)', '소설/희곡/종교', '인디북', '해외도서'),
	(14, '윤성우의 열혈 JAVA', 'IT/프로그래밍/언어', '오렌지미디어', '국내도서'),
	(15, '난 정말 JAVA를 공부한적이 없다구요', 'IT/프로그래밍/언어', '오렌지미디어', '국내도서'),
	(16, '이게 되네? 챗GPT 미친 활용법 51제', 'IT/프로그래밍/언어', '골든래빗', '국내도서'),
	(17, '혼자 공부하는 컴퓨터 구조+운영체제', 'IT/프로그래밍/언어', '한빛미디어', '국내도서'),
	(18, '난 정말 JAVA를 공부한적이 있다구요!', '수필/희극/드라마/IT', '동현미디어', '국내도서'),
	(19, '혼자서 배우는 인생철학 1만선', '드라마/희극', '동현미디어', '국내도서'),
	(20, '인기 프로그래머로 돈버는 비결', 'IT/드라마', '동현미디어', '국내도서'),
	(21, '칵테일, 러브, 좀비', '소설', '안전가옥', '국내도서'),
	(22, '비하인드 도어', '소설', '모모', '해외도서'),
	(23, '죽여 마땅한 사람들', '소설', '푸른숲', '해외도서'),
	(24, '그녀는 증인의 얼굴을 하고 있었다', '소설', '푸른숲', '해외도서'),
	(25, '어떻게 휘둘리지 않는 개인이 되는가', '인문', '푸른숲', '국내도서'),
	(26, '프로젝트 헤일메리', '소설', '알에이치코리아', '해외도서'),
	(27, '완전 (망)한 여행', '에세이', '상상출판', '국내도서'),
	(28, '우리 대화는 밤새도록 끝이 없지', '에세이', '상상출판', '국내도서'),
	(29, '불안의 서', '에세이', '봄날의 책', '해외도서'),
	(30, '바다는 잘 있습니다', '시', '문학과지성사', '국내도서'),
	(31, '누구도 기억하지 않는 역에서', '시', '문학과지성사', '국내도서'),
	(32, '밝은밤', '소설', '문학동네', '국내도서'),
	(33, '귀신나방', '소설', '엘릭시르', '국내도서'),
	(34, '홍학의 자리', '소설', '엘릭시르', '국내도서'),
	(35, '소크라테스 익스프레스', '인문', '어크로스', '해외도서'),
	(36, '구의 증명', '소설', '은행나무', '국내도서'),
	(37, '13.67', '소설', '한스미디어', '해외도서'),
	(38, '해리 오거스트의 열다섯 번째 삶', '소설', '미래인', '해외도서'),
	(39, '모순', '소설', '쓰다', '국내도서'),
	(40, '제노사이드', '소설', '황금가지', '해외도서'),
	(41, '언젠가 우리가 같은 별을 바라본다면', '소설', '해결책', '국내도서'),
	(42, '이중 하나는 거짓말', '소설', '문학동네', '국내도서'),
	(43, '영원한 천국', '소설', '은행나무', '국내도서'),
	(44, '과학 시대에도 신앙은 필요한가', '소설', '생활성서', '국내도서'),
	(45, '주술회전 27 : 바보서바이버!!(트리플 특장판)', '만화', '서울미디어코믹스', '해외도서'),
	(46, '빛이 이끄는 곳으로', '소설', '북로망스', '국내도서'),
	(47, '불변의 법칙', '경제/경영', '서삼독', '해외도서'),
	(48, '당신이 누군가를 죽였다', '소설', '북다', '해외도서'),
	(49, '괴수 8호 13(트리플 특장판)', '만화', '서울미디어코믹스', '해외도서'),
	(50, '불안 세대', '소설', '웅진지식하우스', '해외도서'),
	(51, '돈의 심리학', '소설', '인풀루엔셜', '해외도서'),
	(52, '포스 윙', '소설(판타지)', '북폴리스', '해외도서'),
	(53, '해리포터와 마법사의 돌(1)', '굿스포츠', '황금가지', '해외도서'),
	(54, '묵향(1)', '소설(무협)', '스카이북', '국내도서'),
	(55, '삼국지(이문열)', '소설', '더스토리', '국내도서'),
	(56, '달러쿠트 꿈 백화점(1)', '소설', '팩토리나인', '국내도서'),
	(57, '우리가 빛의 속도로 갈 수 없다면', '소설', '허블', '국내도서'),
	(58, '인어 사냥', '소설(판타지)', '해결책', '국내도서'),
	(59, '잠(1)', '소설(과학)', '열린책들', '해외도서'),
	(60, '동현일기2', '일상물', '황금나무?', '국내도서'),
	(61, '삼국지', '역사소설', '동현미디어', '국내도서'),
	(62, '동현일기', '일상', '황금나무', '국내도서');

-- 테이블 SKLL_Library.Customer 구조 내보내기
CREATE TABLE IF NOT EXISTS `Customer` (
  `c_id` int NOT NULL AUTO_INCREMENT,
  `c_name` varchar(50) NOT NULL DEFAULT '',
  `c_phone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `c_state` varchar(50) NOT NULL DEFAULT '',
  `join_date` date NOT NULL,
  `withdraw_date` date DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 SKLL_Library.Customer:~19 rows (대략적) 내보내기
INSERT INTO `Customer` (`c_id`, `c_name`, `c_phone`, `c_state`, `join_date`, `withdraw_date`) VALUES
	(1, '김태영', '01012345678', '2', '2023-11-29', '2024-05-12'),
	(2, '노은효', '01098765432', '2', '2020-01-15', '2022-10-02'),
	(3, '정세엽', '01001010202', '1', '2023-05-11', NULL),
	(4, '탁태호', '01025861472', '2', '2021-10-21', '2023-11-22'),
	(5, '이상진', '01085209630', '1', '2020-01-05', NULL),
	(6, '이승용', '01002581475', '2', '2020-01-05', '2022-08-31'),
	(7, '김채언', '01004360476', '1', '2023-03-13', NULL),
	(8, '이주현', '01055456656', '1', '2023-02-01', NULL),
	(9, '김재형', '01002356548', '1', '2023-08-16', NULL),
	(10, '정해인', '01054789654', '1', '2023-05-13', NULL),
	(11, '함영선', '01044552212', '1', '2023-03-07', NULL),
	(12, '장우혁', '01010520900', '1', '2022-08-22', NULL),
	(13, '송호창', '01010564921', '2', '2021-11-07', '2023-10-04'),
	(14, '정채미', '01011613322', '1', '2022-08-27', NULL),
	(15, '강도현', '01011961427', '2', '2022-11-14', '2023-07-10'),
	(16, '박혜민', '01012223434', '1', '2021-12-06', NULL),
	(17, '이동현', '01013213068', '2', '2024-08-17', '2024-08-19'),
	(18, '박명회', '01013605330', '1', '2021-09-15', NULL),
	(19, '우효림', '01010829930', '2', '2020-12-02', '2024-09-01');

-- 테이블 SKLL_Library.entry 구조 내보내기
CREATE TABLE IF NOT EXISTS `entry` (
  `e_id` int NOT NULL AUTO_INCREMENT,
  `insertdate` date NOT NULL,
  `updatedate` date DEFAULT NULL,
  `deletedate` date DEFAULT NULL,
  `etc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `s_id` int NOT NULL DEFAULT '0',
  `b_id` int NOT NULL DEFAULT '0',
  `state` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`e_id`),
  KEY `FK__staff` (`s_id`),
  KEY `FK__Book` (`b_id`),
  CONSTRAINT `FK__Book` FOREIGN KEY (`b_id`) REFERENCES `Book` (`b_id`),
  CONSTRAINT `FK__staff` FOREIGN KEY (`s_id`) REFERENCES `staff` (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 SKLL_Library.entry:~62 rows (대략적) 내보내기
INSERT INTO `entry` (`e_id`, `insertdate`, `updatedate`, `deletedate`, `etc`, `s_id`, `b_id`, `state`) VALUES
	(1, '2020-11-15', NULL, NULL, NULL, 2, 1, '0'),
	(2, '2020-12-01', NULL, NULL, NULL, 2, 2, '0'),
	(3, '2021-05-05', NULL, NULL, NULL, 2, 3, '0'),
	(4, '2021-05-05', NULL, NULL, NULL, 2, 4, '0'),
	(5, '2021-05-05', NULL, NULL, NULL, 2, 5, '0'),
	(6, '2021-05-05', NULL, NULL, NULL, 2, 6, '0'),
	(7, '2021-05-05', NULL, NULL, NULL, 2, 7, '0'),
	(8, '2021-05-05', NULL, NULL, NULL, 2, 8, '0'),
	(9, '2021-05-05', NULL, NULL, NULL, 2, 9, '0'),
	(10, '2021-05-05', NULL, NULL, NULL, 2, 10, '0'),
	(11, '2021-05-05', NULL, NULL, NULL, 2, 11, '0'),
	(12, '2021-05-05', NULL, NULL, NULL, 2, 12, '0'),
	(13, '2021-05-05', NULL, NULL, NULL, 2, 13, '0'),
	(14, '2021-05-05', NULL, NULL, NULL, 2, 14, '0'),
	(15, '2021-05-05', NULL, NULL, NULL, 2, 15, '0'),
	(16, '2021-05-05', NULL, NULL, NULL, 2, 16, '0'),
	(17, '2021-05-05', NULL, NULL, NULL, 2, 17, '0'),
	(18, '2021-05-05', NULL, NULL, NULL, 2, 18, '0'),
	(19, '2021-05-05', NULL, NULL, NULL, 2, 19, '0'),
	(20, '2021-05-05', NULL, NULL, NULL, 2, 20, '0'),
	(21, '2021-05-05', NULL, NULL, NULL, 3, 21, '0'),
	(22, '2021-05-05', NULL, NULL, NULL, 3, 22, '0'),
	(23, '2021-05-05', NULL, NULL, NULL, 3, 23, '0'),
	(24, '2021-05-05', NULL, NULL, NULL, 3, 24, '0'),
	(25, '2021-05-05', NULL, NULL, NULL, 3, 25, '0'),
	(26, '2021-05-05', NULL, NULL, NULL, 3, 26, '0'),
	(27, '2021-05-05', NULL, NULL, NULL, 3, 27, '0'),
	(28, '2021-05-05', NULL, NULL, NULL, 3, 28, '0'),
	(29, '2021-05-05', NULL, NULL, NULL, 3, 29, '0'),
	(30, '2021-05-05', NULL, NULL, NULL, 3, 30, '0'),
	(31, '2021-05-05', NULL, NULL, NULL, 3, 31, '0'),
	(32, '2021-05-05', NULL, NULL, NULL, 3, 32, '0'),
	(33, '2021-05-05', NULL, NULL, NULL, 3, 33, '0'),
	(34, '2021-05-05', NULL, NULL, NULL, 3, 34, '0'),
	(35, '2021-05-05', NULL, '2024-09-09', NULL, 3, 35, '0'),
	(36, '2021-05-05', NULL, NULL, NULL, 3, 36, '0'),
	(37, '2021-05-05', NULL, NULL, NULL, 3, 37, '0'),
	(38, '2021-05-05', NULL, NULL, NULL, 3, 38, '0'),
	(39, '2021-05-05', NULL, NULL, NULL, 3, 39, '0'),
	(40, '2021-05-05', NULL, NULL, NULL, 3, 40, '0'),
	(41, '2023-11-05', NULL, NULL, NULL, 4, 41, '0'),
	(42, '2023-11-05', NULL, NULL, NULL, 4, 42, '0'),
	(43, '2023-11-05', NULL, NULL, NULL, 4, 43, '0'),
	(44, '2023-11-05', NULL, NULL, NULL, 4, 44, '0'),
	(45, '2023-11-05', NULL, NULL, NULL, 4, 45, '0'),
	(46, '2023-11-05', NULL, NULL, NULL, 4, 46, '0'),
	(47, '2023-11-05', NULL, NULL, NULL, 4, 47, '0'),
	(48, '2023-11-05', NULL, NULL, NULL, 4, 48, '0'),
	(49, '2023-11-05', NULL, NULL, NULL, 4, 49, '0'),
	(50, '2023-11-05', NULL, NULL, NULL, 4, 50, '0'),
	(51, '2023-11-05', NULL, NULL, NULL, 4, 51, '0'),
	(52, '2023-11-05', NULL, NULL, NULL, 4, 52, '0'),
	(53, '2023-11-05', NULL, NULL, NULL, 4, 53, '0'),
	(54, '2023-11-05', NULL, NULL, NULL, 4, 54, '0'),
	(55, '2023-11-05', NULL, NULL, NULL, 4, 55, '0'),
	(56, '2023-11-05', NULL, NULL, NULL, 4, 56, '0'),
	(57, '2023-11-05', NULL, NULL, NULL, 4, 57, '0'),
	(58, '2023-11-05', NULL, NULL, NULL, 4, 58, '0'),
	(59, '2023-11-05', NULL, NULL, NULL, 4, 59, '0'),
	(60, '2024-09-06', '2024-09-09', NULL, '확인', 1, 19, '22');

-- 테이블 SKLL_Library.Order 구조 내보내기
CREATE TABLE IF NOT EXISTS `Order` (
  `o_id` int NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  `c_id` int NOT NULL,
  `b_id` int NOT NULL,
  `extension_date` int DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 SKLL_Library.Order:~0 rows (대략적) 내보내기

-- 테이블 SKLL_Library.staff 구조 내보내기
CREATE TABLE IF NOT EXISTS `staff` (
  `s_id` int NOT NULL AUTO_INCREMENT,
  `s_name` varchar(50) NOT NULL DEFAULT '0',
  `s_rank` varchar(50) NOT NULL DEFAULT '0',
  `s_startdate` date NOT NULL,
  `s_enddate` date DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 테이블 데이터 SKLL_Library.staff:~9 rows (대략적) 내보내기
INSERT INTO `staff` (`s_id`, `s_name`, `s_rank`, `s_startdate`, `s_enddate`) VALUES
	(1, '이동현', '원장', '2010-05-18', NULL),
	(2, '추정현', '행정', '2020-11-05', NULL),
	(3, '손승용', '행정', '2021-11-05', '2024-07-26'),
	(4, '노태민', '행정', '2023-10-19', NULL),
	(5, '장정태', '사서', '2021-07-31', NULL),
	(6, '전윤아', '사서', '2020-07-27', '2022-09-10'),
	(7, '송종석', '사서', '2021-10-25', NULL),
	(8, '탁만옥', '사서', '2024-08-20', NULL),
	(10, '호창호창', '대표이사', '2023-08-30', '2024-09-08');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
