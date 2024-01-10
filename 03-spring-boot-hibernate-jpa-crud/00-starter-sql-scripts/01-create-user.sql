-- Drop user first if they exist
DROP USER if exists 'springstudent'@'%' ;

-- Now create user with prop privileges
CREATE USER 'springstudent'@'%' IDENTIFIED BY 'springstudent';	-- IDENTIFIED BY (seguido por el password)

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'%';

-- userid + password = springstudent

-- Al ejecutar este query abrir el panel de Administration y ver que se creó el usuario de springstudent