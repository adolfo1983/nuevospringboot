/*Borra la función si es que existe*/
DROP FUNCTION IF EXISTS funcion;

/*Delimitador de la funcion*/
DELIMITER //

/*Crear la función*/
create function funcion(booleano boolean) RETURNS int
begin

	/*Declaracion de variables*/
	DECLARE fila varchar(50);
    
    /*Declaracion del cursor e introduccion de los datos*/
	DECLARE array CURSOR FOR SELECT * FROM piezas;
    
    /*Abre el cursor*/
    OPEN array;
    
    /*Principio del bucle para recorrer el cursor*/
    get_array: LOOP
    	FETCH array INTO fila;
        
        /*Impresion de cada fila por pantalla*/
        SELECT fila;
        
    /*Fin del bucle*/    
    END LOOP get_array;
    
    /*Cierre del cursor*/
    CLOSE array;
    
    RETURN 0;
END;
//