CREATE DEFINER=`root`@`localhost` PROCEDURE `add_dealers`(IN p_id_dealer VARCHAR(10), IN p_dealer_name VARCHAR(20), IN p_balance DECIMAL)
BEGIN

    INSERT INTO DEALER (
        ID_DEALER, DEALER_NAME, BALANCE
    )
    VALUES (
        p_id, p_name, p_balance
    );

END