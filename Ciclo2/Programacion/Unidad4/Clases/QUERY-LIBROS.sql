-- Creando la tabla libro 
CREATE TABLE libro (
    ISBN             INTEGER PRIMARY KEY
                             NOT NULL,
    titulo           TEXT    NOT NULL,
    date_publicacion DATE    NOT NULL
);

CREATE TABLE  inventario(
ISBN INTEGER NOT NULL,
cantidad INTEGER NOT NULL,
FOREIGN KEY(ISBN)
REFERENCES libro (ISBN) ON DELETE CASCADE ON UPDATE CASCADE);


CREATE TABLE venta(
ISBN INTEGER NOT NULL,
fecha DATE NOT NULL, 
hora TIME,
unidades_vendidas INTEGER,
FOREIGN KEY(ISBN)
REFERENCES libro(ISBN) ON DELETE CASCADE ON UPDATE CASCADE);
