-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 01, 2021 at 12:47 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `createaccount`
--

DROP TABLE IF EXISTS `createaccount`;
CREATE TABLE IF NOT EXISTS `createaccount` (
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `address` varchar(40) NOT NULL,
  `mobile` int(10) DEFAULT NULL,
  `AccountNO` varchar(10) NOT NULL,
  `username` varchar(11) NOT NULL,
  `password` varchar(10) NOT NULL,
  `accounttype` varchar(20) NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`AccountNO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `createaccount`
--

INSERT INTO `createaccount` (`firstname`, `lastname`, `address`, `mobile`, `AccountNO`, `username`, `password`, `accounttype`, `amount`) VALUES
('nimal', 'perera', 'no74,ambemulla road', 784442312, '3226854', 'AX24144', 'I5200sisa', 'Account Type', 1000),
('sirimal', 'nayakara', 'no23,galahena road', 723456678, '4492502', 'AX85527', 'I52@ss', 'Serving Account', 10400),
('amal', 'perera', 'no23,ambawattha road', 782245672, '5490361', 'AX38864', 'I5200@aa', 'Account Type', 3100),
('harasha', 'sillava', 'no34,alahara road', 784449823, '5764652', 'AX85964', 'I5200ss$', 'Account Type', 1500),
('Ayesh', 'ishara', 'no45,kaduwela road', 783456789, '6839915', 'AX63761', 'I70@%wa', 'Account Type', 1900),
('madusha', 'snakalpa', 'no75,pliyandala', 712345781, '1005141', 'AX49585', 'I5200viva', 'Account Type', 1400),
('oshadi', 'tharuka', 'no43,pannipitiya', 773344231, '6752613', 'AX13046', 'I5222@q', 'Serving Account', 1200);

-- --------------------------------------------------------

--
-- Table structure for table `paybill`
--

DROP TABLE IF EXISTS `paybill`;
CREATE TABLE IF NOT EXISTS `paybill` (
  `AccountNO` varchar(11) NOT NULL,
  `Bill Type` varchar(20) NOT NULL,
  `Bill Amount No` varchar(11) NOT NULL,
  `Amount` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paybill`
--

INSERT INTO `paybill` (`AccountNO`, `Bill Type`, `Bill Amount No`, `Amount`) VALUES
('sd11114', 'Water Bill', 'w0001', 1090),
('sd11114', 'Water Bill', 'e001', 1090),
('sd11114', 'Electric Bill', 'e0001', 1090),
('sd11114', 'Electric Bill', 'e0001', 1090),
('sd11114', 'Electric Bill', 'eooo1', 10),
('sd11114', 'Electric Bill', 'eooo1', 10),
('sd11114', 'Electric Bill', 'e00001', 100),
('3226854', 'Electric Bill', 'e00001', 200),
('3226854', 'Electric Bill', 'E00001', 200);

-- --------------------------------------------------------

--
-- Table structure for table `transaction history`
--

DROP TABLE IF EXISTS `transaction history`;
CREATE TABLE IF NOT EXISTS `transaction history` (
  `AccountNO` varchar(20) NOT NULL,
  `TragetaccountNo` varchar(20) NOT NULL,
  `transferName` varchar(20) NOT NULL,
  `Amount` int(20) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction history`
--

INSERT INTO `transaction history` (`AccountNO`, `TragetaccountNo`, `transferName`, `Amount`, `date`) VALUES
('sd11113', 'sd11114', 'sdsdf', 100, '2021-04-24 15:15:38'),
('sd1112', 'sd11114', 'sdfdf', 100, '2021-04-24 15:17:53'),
('sd1114', 'sd11113', 'sd', 100, '2021-04-24 15:51:36'),
('sd1112', 'sd11113', 'zsd', 100, '2021-04-24 15:54:58'),
('sd1112', 'sd11114', 'sads', 100, '2021-04-24 15:56:28'),
('sd11114', 'sd11113', '', 100, '2021-04-28 07:45:23'),
('sd11114', 'sds', 'sd11113', 100, '2021-04-28 08:12:01'),
('sd11113', 'dxfd', 'sd11114', 100, '2021-04-28 16:42:17'),
('sd11113', 'sd', 'sd11114', 100, '2021-04-28 17:33:13'),
('sd11113', 'friend', 'sd11114', 100, '2021-04-29 05:02:01'),
('sd111114', 'sd11113', 'frirnd', 100, '2021-04-30 01:22:55'),
('sd11114', 'sd111113', 'rent', 100, '2021-04-30 07:46:35'),
('1005141', '6839915', 'rent', 100, '2021-04-30 14:28:39'),
('1005141', '6839915', 'lent', 100, '2021-04-30 14:29:22'),
('1005141', '6839915', 'fruit', 100, '2021-04-30 14:29:37'),
('1005141', '6839915', 'vegetable', 100, '2021-04-30 14:31:51'),
('1005141', '6839915', 'lunch food', 100, '2021-04-30 14:32:25'),
('3226854', '4492502', 'fruit', 100, '2021-04-30 16:40:51'),
('7118548', '3226854', 'fruit', 100, '2021-04-30 16:57:57'),
('3226854', '5490361', 'vegetable', 100, '2021-04-30 17:02:42');

-- --------------------------------------------------------

--
-- Table structure for table `withdaraw history`
--

DROP TABLE IF EXISTS `withdaraw history`;
CREATE TABLE IF NOT EXISTS `withdaraw history` (
  `AccountNO` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `amount` int(20) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdaraw history`
--

INSERT INTO `withdaraw history` (`AccountNO`, `username`, `amount`, `date`) VALUES
('1005141', 'AX49585', 100, '2021-04-30 14:22:40'),
('4492502', 'Ax85527', 100, '2021-04-30 15:37:10'),
('3226854', 'AX24144', 100, '2021-04-30 16:17:04'),
('7118548', 'AX55669', 100, '2021-04-30 16:57:02');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
