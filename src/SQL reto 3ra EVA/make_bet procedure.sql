CREATE DEFINER=`root`@`localhost` PROCEDURE `make_bet`(IN user_dni VARCHAR(10), IN amount DECIMAL)
BEGIN
    DECLARE current_balance DECIMAL;

    SELECT BALANCE INTO current_balance
    FROM USERS
    WHERE DNI = user_dni;

    IF current_balance IS NULL THEN
        SELECT 'User dont exist' AS MESSAGE;

    ELSEIF current_balance >= amount THEN
        UPDATE USERS
        SET BALANCE = BALANCE - amount
        WHERE DNI = user_dni;

    ELSE
        SELECT 'insuficcient balance' AS MESSAGE;
    END IF;

END