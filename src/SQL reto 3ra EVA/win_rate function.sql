CREATE DEFINER=`root`@`localhost` FUNCTION `win_rate`(user_dni VARCHAR(10)) RETURNS decimal(10,0)
    DETERMINISTIC
BEGIN
    DECLARE wins INT;
    DECLARE total INT;

    SELECT COUNT(*) INTO wins
    FROM PLAYED
    WHERE DNI = user_dni AND RESULT = 'WIN';

    SELECT COUNT(*) INTO total
    FROM PLAYED
    WHERE DNI = user_dni;

    IF total = 0 THEN
        RETURN 0;
    END IF;

    RETURN (wins / total) * 100;
END