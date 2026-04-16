CREATE DEFINER=`root`@`localhost` FUNCTION `total_user_balance`() RETURNS decimal(10,0)
    DETERMINISTIC
BEGIN
    DECLARE total DECIMAL;

    SELECT SUM(BALANCE) INTO total
    FROM USERS;

    RETURN total;
END