CREATE DEFINER=`root`@`localhost` PROCEDURE `withdraw_money`(
    IN user_dni VARCHAR(10),
    IN amount DECIMAL
)
BEGIN
    DECLARE current_balance DECIMAL;

    SELECT BALANCE INTO current_balance
    FROM USERS
    WHERE DNI = user_dni;

    IF current_balance >= amount THEN
        UPDATE USERS
        SET BALANCE = BALANCE - amount
        WHERE DNI = user_dni;
    ELSE
        SELECT 'No puedes retirar tanto dinero' AS ERROR;
    END IF;
END