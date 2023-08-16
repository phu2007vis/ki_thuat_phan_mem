create database if not exists phuoc;

CREATE TABLE if not exists member (
	 id INT PRIMARY KEY,
     userName VARCHAR(45) NOT NULL unique, 
     passWord VARCHAR(45) NOT NULL, 
     name VARCHAR(45) NOT NULL, 
     phoneNumber VARCHAR(45) NOT NULL, 
     privilege_Id INT NOT NULL
);
CREATE TABLE if not exists transaction (
	transactionid INT PRIMARY KEY,
    money INT NOT NULL, 
    timeDisplay date NOT NULL,
    content VARCHAR(45) NOT NULL,
    Member_Id INT NOT NULL
);

ALTER TABLE `phuoc`.`transaction`
ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`Member_Id`)
REFERENCES `member` (`id`) ON DELETE CASCADE;

alter table member
add column gioi_han int ;

WITH AllMonths AS (
    SELECT 1 AS Month
    UNION ALL SELECT 2
    UNION ALL SELECT 3
    UNION ALL SELECT 4
    UNION ALL SELECT 5
    UNION ALL SELECT 6
    UNION ALL SELECT 7
    UNION ALL SELECT 8
    UNION ALL SELECT 9
    UNION ALL SELECT 10
    UNION ALL SELECT 11
    UNION ALL SELECT 12
)

SELECT YEAR(timeDisplay) AS Year, m.Month, COALESCE(SUM(money), 0) AS TotalMoney
FROM AllMonths m
LEFT JOIN transaction t
    ON m.Month = MONTH(t.timeDisplay)
    AND YEAR(t.timeDisplay) = 2023
GROUP BY YEAR(timeDisplay), m.Month
ORDER BY YEAR(timeDisplay), m.Month;

