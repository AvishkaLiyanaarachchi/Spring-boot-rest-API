-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Dec 12, 2020 at 04:07 AM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffee_shop_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bakery_types`
--

DROP TABLE IF EXISTS `tbl_bakery_types`;
CREATE TABLE IF NOT EXISTS `tbl_bakery_types` (
  `bakery_ID` int(11) NOT NULL AUTO_INCREMENT,
  `bakery_types` varchar(45) NOT NULL,
  `tbl_order_order_id` int(11) NOT NULL,
  `tbl_order_tbl_customer_customer_id` int(11) NOT NULL,
  `tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  PRIMARY KEY (`bakery_ID`),
  KEY `fk_tbl_bakery_types_tbl_order1` (`tbl_order_order_id`),
  KEY `fk_tbl_bakery_types_tbl_order` (`tbl_order_tbl_customer_customer_id`),
  KEY `fk_tbl_bakery_types_tbl_or` (`tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_bakery_types`
--

INSERT INTO `tbl_bakery_types` (`bakery_ID`, `bakery_types`, `tbl_order_order_id`, `tbl_order_tbl_customer_customer_id`, `tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID`) VALUES
(1, 'Role', 2, 2, 2),
(3, 'Chocalate biscut', 3, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bill`
--

DROP TABLE IF EXISTS `tbl_bill`;
CREATE TABLE IF NOT EXISTS `tbl_bill` (
  `bill_ID` int(11) NOT NULL AUTO_INCREMENT,
  `amount` float NOT NULL,
  `date` date NOT NULL,
  `description` varchar(45) NOT NULL,
  `tbl_customer_customer_id` int(11) NOT NULL,
  `tbl_customer_tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  PRIMARY KEY (`bill_ID`),
  KEY `fk_tbl_bill_tbl_customer1` (`tbl_customer_customer_id`),
  KEY `fk_tbl_bill_tbl_customer` (`tbl_customer_tbl_coffee_shop_coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_bill`
--

INSERT INTO `tbl_bill` (`bill_ID`, `amount`, `date`, `description`, `tbl_customer_customer_id`, `tbl_customer_tbl_coffee_shop_coffee_shop_ID`) VALUES
(1, 500, '2020-12-12', 'Pay for coffee', 1, 1),
(3, 1050, '2020-12-11', 'pay for the milk and shoties', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_coffee_items`
--

DROP TABLE IF EXISTS `tbl_coffee_items`;
CREATE TABLE IF NOT EXISTS `tbl_coffee_items` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `quantity` int(11) NOT NULL,
  `tbl_coffee_types_coffee_types_id` int(11) NOT NULL,
  `tbl_coffee_types_tbl_order_order_id` int(11) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `fk_tbl_coffee_items_tbl_coffee_types1` (`tbl_coffee_types_coffee_types_id`),
  KEY `fk_tbl_coffee_items_tbl_coffee_types` (`tbl_coffee_types_tbl_order_order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_coffee_items`
--

INSERT INTO `tbl_coffee_items` (`item_id`, `item_name`, `quantity`, `tbl_coffee_types_coffee_types_id`, `tbl_coffee_types_tbl_order_order_id`) VALUES
(1, 'Sugar', 50, 1, 1),
(2, 'Ginger', 2, 1, 1),
(5, 'tea leaves', 15, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_coffee_shop`
--

DROP TABLE IF EXISTS `tbl_coffee_shop`;
CREATE TABLE IF NOT EXISTS `tbl_coffee_shop` (
  `coffee_shop_ID` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  PRIMARY KEY (`coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_coffee_shop`
--

INSERT INTO `tbl_coffee_shop` (`coffee_shop_ID`, `shop_name`, `Address`, `phone_number`) VALUES
(1, 'Daddy\'s coffee_shop_1', 'Colombo 06', '027727722'),
(2, 'Daddy\'s coffee_shop_2', 'Colombo 04', '02726663');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_coffee_types`
--

DROP TABLE IF EXISTS `tbl_coffee_types`;
CREATE TABLE IF NOT EXISTS `tbl_coffee_types` (
  `coffee_types_id` int(11) NOT NULL AUTO_INCREMENT,
  `coffee_types_name` varchar(45) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `cost` double NOT NULL,
  `tbl_order_order_id` int(11) NOT NULL,
  PRIMARY KEY (`coffee_types_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_coffee_types`
--

INSERT INTO `tbl_coffee_types` (`coffee_types_id`, `coffee_types_name`, `quantity`, `cost`, `tbl_order_order_id`) VALUES
(1, 'Milk', '2', 150, 1),
(3, 'Ice cream', '100g', 200.5, 3),
(4, 'Coffee', '12', 500.5, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

DROP TABLE IF EXISTS `tbl_customer`;
CREATE TABLE IF NOT EXISTS `tbl_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) NOT NULL,
  `email_address` varchar(45) NOT NULL,
  `conatact_num` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `fk_tbl_customer_tbl_coffee_shop1` (`tbl_coffee_shop_coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`customer_id`, `customer_name`, `email_address`, `conatact_num`, `address`, `tbl_coffee_shop_coffee_shop_ID`) VALUES
(1, 'MR.Peter', 'peter@gmail.com', '02727288', 'Moratuwa,Colombo', 1),
(2, 'Mrs.rose', 'rose@gmail.com', '077838838', 'Wallawatta,colombo', 2),
(3, 'Mr.Perera rochel', 'rochel@gmail.com', '077262262', 'Dematagoda,colombo', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_employee`
--

DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE IF NOT EXISTS `tbl_employee` (
  `employee_ID` int(11) NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(45) NOT NULL,
  `email_address` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `address` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  PRIMARY KEY (`employee_ID`),
  KEY `fk_tbl_employee_tbl_coffee_shop` (`tbl_coffee_shop_coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_employee`
--

INSERT INTO `tbl_employee` (`employee_ID`, `employee_name`, `email_address`, `phone_number`, `address`, `tbl_coffee_shop_coffee_shop_ID`) VALUES
(1, 'Mr.sunil', 'sunil@gmail.com', '0779887737', 'Gampaha,Colombo', 1),
(3, 'Mr.chatu', 'chatu@gmail.com', '22282882', 'kaluthara, colombo', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_order`
--

DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE IF NOT EXISTS `tbl_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(45) NOT NULL,
  `item_name` varchar(45) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `tbl_customer_customer_id` int(11) NOT NULL,
  `tbl_customer_tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fk_tbl_order_tbl_customer1` (`tbl_customer_customer_id`),
  KEY `fk_tbl_order_tbl_customer` (`tbl_customer_tbl_coffee_shop_coffee_shop_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_order`
--

INSERT INTO `tbl_order` (`order_id`, `order_name`, `item_name`, `quantity`, `tbl_customer_customer_id`, `tbl_customer_tbl_coffee_shop_coffee_shop_ID`) VALUES
(1, 'Milk Tea', 'milk', '2', 1, 1),
(2, 'Coffee', 'Coffee', '1', 2, 2),
(3, 'Ice tea', 'Ice cream', '2', 1, 1),
(4, 'Hot milo', 'milo', '6', 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_order_has_tbl_coffee_types`
--

DROP TABLE IF EXISTS `tbl_order_has_tbl_coffee_types`;
CREATE TABLE IF NOT EXISTS `tbl_order_has_tbl_coffee_types` (
  `tbl_order_order_id` int(11) NOT NULL,
  `tbl_order_tbl_customer_customer_id` int(11) NOT NULL,
  `tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID` int(11) NOT NULL,
  `tbl_coffee_types_coffee_types_id` int(11) NOT NULL,
  `tbl_coffee_types_tbl_order_order_id` int(11) NOT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`),
  KEY `fk_tbl_order_has_tbl_coffee_types_tbl_order1` (`tbl_order_order_id`),
  KEY `fk_tbl_order_has_tbl_coffee_types_tbl_order` (`tbl_order_tbl_customer_customer_id`),
  KEY `fk_tbl_order_has_tbl_coffee_types_tbl_or` (`tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID`),
  KEY `fk_tbl_order_has_tbl_coffee_types_tbl_coffee_types1` (`tbl_coffee_types_coffee_types_id`),
  KEY `fk_tbl_order_has_tbl_coffee_types_tbl_coffee_types` (`tbl_coffee_types_tbl_order_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_bakery_types`
--
ALTER TABLE `tbl_bakery_types`
  ADD CONSTRAINT `fk_tbl_bakery_types_tbl_or` FOREIGN KEY (`tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_order` (`order_id`),
  ADD CONSTRAINT `fk_tbl_bakery_types_tbl_order` FOREIGN KEY (`tbl_order_tbl_customer_customer_id`) REFERENCES `tbl_order` (`order_id`),
  ADD CONSTRAINT `fk_tbl_bakery_types_tbl_order1` FOREIGN KEY (`tbl_order_order_id`) REFERENCES `tbl_order` (`order_id`);

--
-- Constraints for table `tbl_bill`
--
ALTER TABLE `tbl_bill`
  ADD CONSTRAINT `fk_tbl_bill_tbl_customer` FOREIGN KEY (`tbl_customer_tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_customer` (`customer_id`),
  ADD CONSTRAINT `fk_tbl_bill_tbl_customer1` FOREIGN KEY (`tbl_customer_customer_id`) REFERENCES `tbl_customer` (`customer_id`);

--
-- Constraints for table `tbl_coffee_items`
--
ALTER TABLE `tbl_coffee_items`
  ADD CONSTRAINT `fk_tbl_coffee_items_tbl_coffee_types` FOREIGN KEY (`tbl_coffee_types_tbl_order_order_id`) REFERENCES `tbl_coffee_types` (`coffee_types_id`),
  ADD CONSTRAINT `fk_tbl_coffee_items_tbl_coffee_types1` FOREIGN KEY (`tbl_coffee_types_coffee_types_id`) REFERENCES `tbl_coffee_types` (`coffee_types_id`);

--
-- Constraints for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD CONSTRAINT `fk_tbl_customer_tbl_coffee_shop1` FOREIGN KEY (`tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_coffee_shop` (`coffee_shop_ID`);

--
-- Constraints for table `tbl_employee`
--
ALTER TABLE `tbl_employee`
  ADD CONSTRAINT `fk_tbl_employee_tbl_coffee_shop` FOREIGN KEY (`tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_coffee_shop` (`coffee_shop_ID`);

--
-- Constraints for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD CONSTRAINT `fk_tbl_order_tbl_customer` FOREIGN KEY (`tbl_customer_tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_customer` (`customer_id`),
  ADD CONSTRAINT `fk_tbl_order_tbl_customer1` FOREIGN KEY (`tbl_customer_customer_id`) REFERENCES `tbl_customer` (`customer_id`);

--
-- Constraints for table `tbl_order_has_tbl_coffee_types`
--
ALTER TABLE `tbl_order_has_tbl_coffee_types`
  ADD CONSTRAINT `fk_tbl_order_has_tbl_coffee_types_tbl_coffee_types` FOREIGN KEY (`tbl_coffee_types_tbl_order_order_id`) REFERENCES `tbl_coffee_types` (`coffee_types_id`),
  ADD CONSTRAINT `fk_tbl_order_has_tbl_coffee_types_tbl_coffee_types1` FOREIGN KEY (`tbl_coffee_types_coffee_types_id`) REFERENCES `tbl_coffee_types` (`coffee_types_id`),
  ADD CONSTRAINT `fk_tbl_order_has_tbl_coffee_types_tbl_or` FOREIGN KEY (`tbl_order_tbl_customer_tbl_coffee_shop_coffee_shop_ID`) REFERENCES `tbl_order` (`order_id`),
  ADD CONSTRAINT `fk_tbl_order_has_tbl_coffee_types_tbl_order` FOREIGN KEY (`tbl_order_tbl_customer_customer_id`) REFERENCES `tbl_order` (`order_id`),
  ADD CONSTRAINT `fk_tbl_order_has_tbl_coffee_types_tbl_order1` FOREIGN KEY (`tbl_order_order_id`) REFERENCES `tbl_order` (`order_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
