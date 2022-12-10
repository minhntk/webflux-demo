CREATE TABLE IF NOT EXISTS `user`
(
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `user_name` VARCHAR(50)  NOT NULL UNIQUE,
    `status` VARCHAR(50) NOT NULL,
    `full_name` VARCHAR(150),
    `created_date` DATETIME NOT NULL,
    `updated_date` DATETIME DEFAULT NULL,
    INDEX idx__user_id (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
