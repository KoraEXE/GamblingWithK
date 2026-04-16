CREATE DEFINER=`root`@`localhost` PROCEDURE `register_game`(IN p_dni VARCHAR(10), IN p_table VARCHAR(10), IN p_date TIMESTAMP, IN p_bet INT, IN p_result VARCHAR(10) )
BEGIN

	INSERT INTO PLAYED (DNI, ID_TABLE,GAME_DATE, BET, RESULT)
    VALUES(p_dni, p_table, p_date, p_bet, p_result);
	
	UPDATE USERS
    SET TIMES_PLAYED = TIMES_PLAYED + 1
    WHERE DNI = p_dni;

	IF p_result = "WIN" THEN 
		UPDATE USERS
        SET BALANCE = BALANCE + p_bet
        WHERE DNI = p_dni;
	END IF;
END