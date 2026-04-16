CREATE DEFINER=`root`@`localhost` PROCEDURE `assing_dealer_table`(IN p_table VARCHAR(10), IN p_dealer VARCHAR(10))
BEGIN
	
    INSERT INTO HAVE (ID_TABLE, ID_DEALER)
    VALUES (p_table, p_dealer);
    
END