-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2023 at 10:32 PM
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
-- Database: `delapanbelasdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `availability`
--

CREATE TABLE `availability` (
  `product_name` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `availability`
--

INSERT INTO `availability` (`product_name`, `Date`) VALUES
('Wedding Silver', '12-12-2023'),
('Engagement Silver', '13-12-2023'),
('Prewedding Gold', '16-12-2024'),
('Prewedding Silver', '12-12-2035'),
('Wedding Gold', '15-12-2024'),
('Prewedding Silver', '12-23-2025'),
('Prewedding Silver', '12-22-2023'),
('Engagement Silver', '12-12-2024'),
('Wedding Gold', '12-23-2023'),
('Wedding Gold', '2023-12-01'),
('Engagement Gold', '18-12-2023'),
('Prewedding Silver', '23-12-2023'),
('Wedding Silver', '28-12-2023'),
('Engagement Gold', '12-12-2023'),
('Prewedding Silver', '02-09-2024'),
('Prewedding Silver', '11-12-2023'),
('Wedding Gold', '02-02-2024'),
('Wedding Gold', '02-01-2024');

-- --------------------------------------------------------

--
-- Table structure for table `order_detail`
--

CREATE TABLE `order_detail` (
  `orderID` int(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `product_name` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `total_price` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_detail`
--

INSERT INTO `order_detail` (`orderID`, `email`, `product_name`, `Date`, `total_price`) VALUES
(111, 'resti@gmail.com', 'Engagement Gold', '12-12-2023', 700000),
(112, 'resti@gmail.com', 'Prewedding Silver', '02-09-2024', 900000),
(113, 'kelas3E@gmail.com', 'Prewedding Silver', '11-12-2023', 900000),
(114, 'resti@gmail.com', 'Wedding Gold', '02-02-2024', 3000000),
(115, 'resti@gmail.com', 'Wedding Gold', '02-01-2024', 3000000);

--
-- Triggers `order_detail`
--
DELIMITER $$
CREATE TRIGGER `calculate_total_price` BEFORE INSERT ON `order_detail` FOR EACH ROW BEGIN
    DECLARE product_price_value INT;

    
    SELECT product_price INTO product_price_value
    FROM PRODUCT_LIST
    WHERE product_name = NEW.product_name;

    
    SET NEW.total_price = product_price_value;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_availability_date` BEFORE INSERT ON `order_detail` FOR EACH ROW BEGIN
    INSERT INTO availability (product_name, date)
    VALUES (NEW.product_name, NEW.Date)
    ON DUPLICATE KEY UPDATE date = NEW.Date;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `product_list`
--

CREATE TABLE `product_list` (
  `product_name` varchar(50) NOT NULL,
  `product_price` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_list`
--

INSERT INTO `product_list` (`product_name`, `product_price`) VALUES
('Engagement Gold', 700000),
('Engagement Silver', 500000),
('Prewedding Gold', 1500000),
('Prewedding Silver', 900000),
('Wedding Gold', 3000000),
('Wedding Silver', 2000000);

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `Review` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`Review`) VALUES
('baguss bangettt makasihhh dekkk '),
('gacorrrrr'),
('pelayanannya sangat baik'),
('pelayanan terbaikkk'),
('pelayanan terbaikkk'),
('pelayanan terbaikkk'),
('kerenn!!!');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `email` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `nama_lengkap` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`email`, `password`, `nama_lengkap`, `alamat`, `gender`) VALUES
('bububnocil@gmail.com', '11111111', 'azfar kost biru', 'bekasi', 'male'),
('danendra@gmail.com', '12345678', 'danendra ganijan sunarso', 'bekasi', 'male'),
('fahmi@gmail.com', '11111111', 'fahmi siregar', 'bekasi fc', 'female'),
('hannyaurora123@gmail.com', '11111111', 'hanny aurora athalie', 'tirtamulya', 'female'),
('kelas3E@gmail.com', '11111111', 'kelas 3 E', 'karawang', 'male'),
('mahamerualamsyah@gmail.com', '12345', 'mahameru alamsyah', 'jl pahlawan', 'male'),
('mutiara@gmail.com', '12345678', 'mutiara isya meiliana', 'bogor', 'female'),
('nadila@gmail.com', '12345678', 'nadila simatupang', 'banteng', 'female'),
('noge@gmail.com', '11111111', 'naufal ilham ', 'cikamril', 'male'),
('putri@gmail.com', '12345678', 'putri ayu dina', 'cikarang', 'male'),
('putridino@gmail.com', '11111111', 'putri dino', 'cikarang', 'female'),
('resti@gmail.com', '11111111', 'resti dwi artika', 'bekasi ', 'female'),
('rifalmuhamad12330@gmail.com', '12345678', 'muhammad rifal rifdiansyah', 'cikampek', 'female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD PRIMARY KEY (`orderID`),
  ADD KEY `email` (`email`),
  ADD KEY `product_code` (`product_name`) USING BTREE;

--
-- Indexes for table `product_list`
--
ALTER TABLE `product_list`
  ADD PRIMARY KEY (`product_name`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `order_detail`
--
ALTER TABLE `order_detail`
  MODIFY `orderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=116;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD CONSTRAINT `order_detail_ibfk_1` FOREIGN KEY (`email`) REFERENCES `users` (`email`),
  ADD CONSTRAINT `order_detail_ibfk_2` FOREIGN KEY (`product_name`) REFERENCES `product_list` (`product_name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
