CREATE DEFINER=`root`@`localhost` PROCEDURE `play_game`(IN user_dni VARCHAR(10),IN table_id VARCHAR(10),IN result_game VARCHAR(10),IN bet DECIMAL)
BEGIN
    DECLARE user_exists INT;
    -- Comprueba si existe el usuari
    SELECT COUNT(*) INTO user_exists
    FROM USERS
    WHERE DNI = user_dni;

    IF user_exists = 0 THEN
        SELECT 'User dont exist' AS MESSAGE;

    ELSE
        -- Insertar partida
        INSERT INTO PLAYED (DNI, ID_TABLE, GAME_DATE, RESULT)
        VALUES (user_dni, table_id, CURDATE(), result_game);

        -- Si gana, se le paga
        IF result_game = 'WIN' THEN
            UPDATE USERS
            SET BALANCE = BALANCE + bet * 2
            WHERE DNI = user_dni;
        END IF;
        
    END IF;
    
END