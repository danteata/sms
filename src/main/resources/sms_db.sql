-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 13, 2011 at 06:57 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sms_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `accountant`
--

CREATE TABLE IF NOT EXISTS `accountant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `accountant`
--


-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE IF NOT EXISTS `administrator` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `staff_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8BEF2AD8B5AEB49` (`staff_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`id`, `password`, `userName`, `staff_id`) VALUES
(1, '1234', 'admin', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `admission`
--

CREATE TABLE IF NOT EXISTS `admission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date_enrolled` date DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK791437E9CFB9CFA8` (`person_id`),
  KEY `FK791437E97B4E198B` (`school_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `admission`
--


-- --------------------------------------------------------

--
-- Table structure for table `classenrollment`
--

CREATE TABLE IF NOT EXISTS `classenrollment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enrollmentDate` date DEFAULT NULL,
  `classRoom_id` bigint(20) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2EA2A7C18BE642C` (`classRoom_id`),
  KEY `FK2EA2A7CCFB9CFA8` (`person_id`),
  KEY `FK2EA2A7C79796709` (`classRoom_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `classenrollment`
--


-- --------------------------------------------------------

--
-- Table structure for table `classlevel`
--

CREATE TABLE IF NOT EXISTS `classlevel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `levelName` varchar(255) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6472090CA9EFE748` (`school_id`),
  KEY `FK6472090C7B4E198B` (`school_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `classlevel`
--


-- --------------------------------------------------------

--
-- Table structure for table `classroom`
--

CREATE TABLE IF NOT EXISTS `classroom` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `capacity` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `classLevel_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK76DD425389F6B928` (`classLevel_id`),
  KEY `FK76DD4253409C11EB` (`classLevel_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `classroom`
--


-- --------------------------------------------------------

--
-- Table structure for table `classsubject`
--

CREATE TABLE IF NOT EXISTS `classsubject` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classLevel_id` bigint(20) DEFAULT NULL,
  `subject_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9C9580B495F0F9EC` (`subject_id`),
  KEY `FK9C9580B489F6B928` (`classLevel_id`),
  KEY `FK9C9580B4F0591009` (`subject_id`),
  KEY `FK9C9580B4409C11EB` (`classLevel_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `classsubject`
--


-- --------------------------------------------------------

--
-- Table structure for table `employment`
--

CREATE TABLE IF NOT EXISTS `employment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dateEmployed` date DEFAULT NULL,
  `staff_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK80D9800C8B5AEB49` (`staff_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `employment`
--


-- --------------------------------------------------------

--
-- Table structure for table `guardian`
--

CREATE TABLE IF NOT EXISTS `guardian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKA8A81DB1CFB9CFA8` (`person_id`),
  KEY `FKA8A81DB1A11801EB` (`person_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `guardian`
--


-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dOB` date DEFAULT NULL,
  `fName` varchar(25) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `lName` varchar(25) DEFAULT NULL,
  `mName` varchar(25) DEFAULT NULL,
  `religion` varchar(25) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  `picture` longblob,
  PRIMARY KEY (`id`),
  KEY `FK8E488775A9EFE748` (`school_id`),
  KEY `FK8E4887757B4E198B` (`school_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `person`
--


-- --------------------------------------------------------

--
-- Table structure for table `phone_details`
--

CREATE TABLE IF NOT EXISTS `phone_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contactNo` varchar(10) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKFB765031CFB9CFA8` (`person_id`),
  KEY `FKFB765031A11801EB` (`person_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `phone_details`
--


-- --------------------------------------------------------

--
-- Table structure for table `school`
--

CREATE TABLE IF NOT EXISTS `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(45) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `motto` varchar(255) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `observers` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `school`
--

INSERT INTO `school` (`id`, `address`, `email`, `location`, `motto`, `name`, `observers`) VALUES
(1, NULL, 'youngscho@yahoo.com', 'Takoradi', 'Train Up A Child', 'Young Christian School', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `person_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `employment_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4C7D2C0CFB9CFA8` (`person_id`),
  KEY `FK4C7D2C0CD2F160B` (`employment_id`),
  KEY `FK4C7D2C0A11801EB` (`person_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `staff`
--


-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `observers` tinyblob,
  `admission_id` bigint(20) DEFAULT NULL,
  `classRoom_id` bigint(20) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  `enrollment_id` bigint(20) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKF3371A1B18BE642C` (`classRoom_id`),
  KEY `FKF3371A1B37DB0C4C` (`admission_id`),
  KEY `FKF3371A1BCFB9CFA8` (`person_id`),
  KEY `FKF3371A1B14B8F1A1` (`enrollment_id`),
  KEY `FKF3371A1B79796709` (`classRoom_id`),
  KEY `FKF3371A1B98960F29` (`admission_id`),
  KEY `FKF3371A1BA11801EB` (`person_id`),
  KEY `FKF3371A1B7B4E198B` (`school_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `student`
--


-- --------------------------------------------------------

--
-- Table structure for table `student_guardian`
--

CREATE TABLE IF NOT EXISTS `student_guardian` (
  `students_id` bigint(20) NOT NULL,
  `parents_id` bigint(20) NOT NULL,
  `guardians_id` bigint(20) DEFAULT NULL,
  KEY `FKA1F263555DC36430` (`parents_id`),
  KEY `FKA1F2635543D8CF0F` (`students_id`),
  KEY `FKA1F263559E40E52C` (`students_id`),
  KEY `FKA1F26355C5FF71A` (`guardians_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_guardian`
--


-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `School_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKF3E2ED0CA9EFE748` (`School_id`),
  KEY `FKF3E2ED0C7B4E198B` (`School_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `subject`
--


-- --------------------------------------------------------

--
-- Table structure for table `subject_classlevel`
--

CREATE TABLE IF NOT EXISTS `subject_classlevel` (
  `subjects_id` bigint(20) NOT NULL,
  `classLevels_id` bigint(20) NOT NULL,
  KEY `FKA29B121FEEA3AA8E` (`subjects_id`),
  KEY `FKA29B121FA114D830` (`classLevels_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject_classlevel`
--


-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `admission_id` bigint(20) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  `staff_id` bigint(20) DEFAULT NULL,
  `school_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKD6A63C237DB0C4C` (`admission_id`),
  KEY `FKD6A63C2CFB9CFA8` (`person_id`),
  KEY `FKD6A63C28499F1EC` (`staff_id`),
  KEY `FKD6A63C298960F29` (`admission_id`),
  KEY `FKD6A63C2A11801EB` (`person_id`),
  KEY `FKD6A63C28B5AEB49` (`staff_id`),
  KEY `FKD6A63C27B4E198B` (`school_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `teacher`
--


-- --------------------------------------------------------

--
-- Table structure for table `teacherclassassignment`
--

CREATE TABLE IF NOT EXISTS `teacherclassassignment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classRoom_id` bigint(20) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKC3D7AE4318BE642C` (`classRoom_id`),
  KEY `FKC3D7AE438A87F62C` (`teacher_id`),
  KEY `FKC3D7AE4379796709` (`classRoom_id`),
  KEY `FKC3D7AE43E4F00C49` (`teacher_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `teacherclassassignment`
--


-- --------------------------------------------------------

--
-- Table structure for table `teachersubjectassignment`
--

CREATE TABLE IF NOT EXISTS `teachersubjectassignment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `classRoom_id` bigint(20) DEFAULT NULL,
  `classSubject_id` bigint(20) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  `subject_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKFE69C977452AB4A8` (`classSubject_id`),
  KEY `FKFE69C97718BE642C` (`classRoom_id`),
  KEY `FKFE69C9778A87F62C` (`teacher_id`),
  KEY `FKFE69C977F0591009` (`subject_id`),
  KEY `FKFE69C977E4F00C49` (`teacher_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `teachersubjectassignment`
--


-- --------------------------------------------------------

--
-- Table structure for table `teacher_classroom`
--

CREATE TABLE IF NOT EXISTS `teacher_classroom` (
  `teachers_id` bigint(20) NOT NULL,
  `classRooms_id` bigint(20) NOT NULL,
  KEY `FK357856168F0C4CFA` (`teachers_id`),
  KEY `FK35785616BC0CADBC` (`classRooms_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_classroom`
--


-- --------------------------------------------------------

--
-- Table structure for table `teacher_subject`
--

CREATE TABLE IF NOT EXISTS `teacher_subject` (
  `Teacher_id` bigint(20) NOT NULL,
  `preferredSubjects_id` bigint(20) NOT NULL,
  `teachers_id` bigint(20) DEFAULT NULL,
  `subjects_id` bigint(20) DEFAULT NULL,
  UNIQUE KEY `preferredSubjects_id` (`preferredSubjects_id`),
  KEY `FK56A6158FE4415D50` (`preferredSubjects_id`),
  KEY `FK56A6158F8A87F62C` (`Teacher_id`),
  KEY `FK56A6158F8F0C4CFA` (`teachers_id`),
  KEY `FK56A6158FEEA3AA8E` (`subjects_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_subject`
--

