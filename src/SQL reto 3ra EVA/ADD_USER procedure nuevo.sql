CREATE DEFINER=`root`@`localhost` PROCEDURE `add_users`(IN p_dni VARCHAR(10), IN p_username VARCHAR(20), IN p_password VARCHAR(10), IN p_birth DATE,IN p_times_played INT, IN p_maxcombo INT, IN p_balance DECIMAL(10,2))
BEGIN

    INSERT INTO USERS (
        DNI, USERNAME, PASWORD, DATE_OF_BIRTH, TIMES_PLAYED, MAX_COMBO, BALANCE
    )
    VALUES (
        p_dni, p_username, p_password, p_birth, p_times_played, p_maxcombo, p_balance
    );

END