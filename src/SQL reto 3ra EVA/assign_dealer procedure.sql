CREATE DEFINER=`root`@`localhost` PROCEDURE `assign_dealer`(
    IN table_id VARCHAR(10),
    IN dealer_id VARCHAR(10)
)
BEGIN
    DECLARE count_dealer INT;

    SELECT COUNT(*) INTO count_dealer
    FROM HAVE
    WHERE ID_TABLE = table_id;

    IF count_dealer = 0 THEN
        INSERT INTO HAVE VALUES (table_id, dealer_id);
    ELSE
        SELECT 'La mesa ya tiene dealer' AS MESSAGE;
    END IF;
END