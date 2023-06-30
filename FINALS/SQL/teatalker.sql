-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2023 at 06:18 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teatalker`
--

-- --------------------------------------------------------

--
-- Table structure for table `meowlktea`
--

CREATE TABLE `meowlktea` (
  `milk_no` int(11) NOT NULL,
  `milk_ord` varchar(35) NOT NULL,
  `sinker` varchar(15) NOT NULL,
  `sugar_lv` char(3) NOT NULL,
  `price` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `meowlktea`
--

INSERT INTO `meowlktea` (`milk_no`, `milk_ord`, `sinker`, `sugar_lv`, `price`) VALUES
(1, '[M] Cookies and Cream Milktea', '[T] Pudding', '100', '70'),
(2, '[E] Strawberry Cheesecake Milktea', '[T] Pudding', '75', '75'),
(3, '[O] Mocha Magnifico Milktea', '[C] Pearl', '75', '85'),
(4, '[W] Caramel Macchiato Milktea', '[T] Pudding', '100', '90');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `meowlktea`
--
ALTER TABLE `meowlktea`
  ADD PRIMARY KEY (`milk_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `meowlktea`
--
ALTER TABLE `meowlktea`
  MODIFY `milk_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
