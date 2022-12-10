CREATE TABLE IF NOT EXISTS `inventory`
(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL,
    `address` VARCHAR(150) NOT NULL,
    `created_date` DATETIME NOT NULL,
    `updated_date` DATETIME DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `inventory` (id, name, address, created_date, updated_date)
VALUES (1, 'Inventory_NewYork', 'New York', '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
(2, 'Inventory_Phila', 'Philadenphia', '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
(3, 'Inventory_Atlanta', 'Atlanta', '2022-12-10 00:00:00', '2022-12-10 00:00:00');

CREATE TABLE IF NOT EXISTS `inventory_item`
(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `inventory_id` BIGINT NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `quantity` BIGINT NOT NULL,
    `created_date` DATETIME NOT NULL,
    `updated_date` DATETIME DEFAULT NULL,
    FOREIGN KEY (`inventory_id`) REFERENCES `inventory`(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `inventory_item` (id, inventory_id, name, quantity, created_date, updated_date)
VALUES  (1, 1, 'Book Computer', 1000, '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
        (2, 1, 'Book History', 1000, '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
        (3, 2, 'Book Literature', 1000, '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
        (4, 2, 'Book Social', 1000, '2022-12-10 00:00:00', '2022-12-10 00:00:00'),
        (5, 3, 'Book Philosophy', 1000, '2022-12-10 00:00:00', '2022-12-10 00:00:00');