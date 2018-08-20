-- Not used by code. For references purposes only at this point
-- See db jdbc:h2:file:~/sftraxdb console hosted via /h2

CREATE TABLE AFFIRMATION(ID INT PRIMARY KEY, TEXT VARCHAR(2000));
CREATE TABLE DISTRACTION(ID INT PRIMARY KEY, DESCRIPTION VARCHAR(2000), LINK VARCHAR(200));