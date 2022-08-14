--REto 3
-- 1Punto
SELECT ID_MaterialConstruccion AS ID,
       Nombre_Material AS NOMBRE,
       Precio_Unidad PRECIO
  FROM MaterialConstruccion
  WHERE Importado = 'Si'
 ORDER BY Nombre_Material;
 
 -- ----2punto

SELECT p.ID_Proyecto AS ID,
       p.Constructora,
       p.Ciudad,
       p.Clasificacion,
       t.Estrato,
       p.Fecha_Inicio,
       l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido AS LIDER
  FROM Proyecto p
       JOIN Tipo t ON (p.ID_Tipo = t.ID_Tipo)-- join
       JOIN Lider l ON (p.ID_Lider = l.ID_Lider)
 WHERE Banco_Vinculado = "Conavi"-- limit 10
 ORDER BY Fecha_Inicio DESC,
          Ciudad,
          Constructora;

SELECT *
  FROM Tipo;
  
-- -3punto reto-3

SELECT Ciudad,
       Clasificacion,
       count( * ) AS TOTAL,
       min(Fecha_Inicio) AS VIEJO,
       max(Fecha_Inicio) AS RECIENTE
  FROM Proyecto
 WHERE Clasificacion NOT IN('Casa Campestre', 'Condominio')
 GROUP BY Ciudad,
          Clasificacion
 ORDER BY Ciudad,
          Clasificacion;


---4Punto
SELECT p.ID_Proyecto, SUM(c.Cantidad* mc.Precio_Unidad) AS VALOR
FROM Proyecto p
JOIN Compra c ON(p.ID_Proyecto = c.ID_Proyecto)
JOIN MaterialConstruccion mc ON(c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion)
WHERE c.Pagado = 'No'
GROUP BY p.ID_Proyecto
HAVING SUM(c.Cantidad * mc.Precio_Unidad)>50000
ORDER BY VALOR DESC; 

--5Punto

SELECT l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido AS LIDER,
SUM(c.Cantidad*mc.Precio_Unidad) AS VALOR
FROM Lider l
JOIN Proyecto p ON (p.ID_Lider=l.ID_Lider)
JOIN Compra c ON(p.ID_Proyecto=c.ID_Proyecto) 
JOIN MaterialConstruccion mc ON(c.ID_MaterialConstruccion= mc.ID_MaterialConstruccion)
GROUP BY l.Nombre || ' ' || l.Primer_Apellido || ' ' || l.Segundo_Apellido
ORDER BY VALOR DESC
LIMIT 10;
 
