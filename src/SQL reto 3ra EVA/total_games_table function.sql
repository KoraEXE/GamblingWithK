CREATE DEFINER=`root`@`localhost` FUNCTION `total_games_table`(table_id VARCHAR(10)) RETURNS int
    DETERMINISTIC
BEGIN
    DECLARE total INT;

    SELECT COUNT(*) INTO total
    FROM PLAYED
    WHERE ID_TABLE = table_id;

    RETURN total;
END