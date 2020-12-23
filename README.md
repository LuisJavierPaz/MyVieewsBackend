MyVieewsBackend

#Base de datos
Las bases de datos utilizadas para estre proyecto son mongoDb y postgresql, Los BD estan importadas, dentro del la carpeta dataBase


#MongoDD
Se requiere intalado MongoDB Para importar la BD no relacional se debera ingresar dentro de la carpeta dataBase

Se debera ejecutar los comandos:

  -  mongorestore
  -   rm -r dump
Para exportar la BD no relacional se debera ingresar dentro de la carpeta dataBase y ejecutar

mongodump --db MDB_MyVieews --host localhost:27017

#Postgresql

Se requiere tener instalado Postgresql, y pgAdmin4 Para importar la BD se debera:

- Iniciar pgAdmin4
- Crear una DB con el nombre MyVieews
- Importar el archivo sql de la carpeta dataBase/Db_Postgresql
Para exportar la BD no relacional se debera ingresar dentro de la carpeta dataBase y ejecutar

Iniciar pgAdmin4
Click derecho sobre la BD y seleccionar Backup
- Reemplazarlo por dataBase/Db_Postgresql
