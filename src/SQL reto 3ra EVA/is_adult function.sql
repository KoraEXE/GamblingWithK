CREATE DEFINER=`root`@`localhost` FUNCTION `is_adult`(user_dni VARCHAR(10)) RETURNS tinyint(1)
    DETERMINISTIC
BEGIN
    DECLARE age INT;

    SELECT TIMESTAMPDIFF(YEAR, DATE_OF_BIRTH, CURDATE())
    INTO age
    FROM USERS
    WHERE DNI = user_dni;

    RETURN age >= 18;
END