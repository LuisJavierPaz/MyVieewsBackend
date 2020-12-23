# MyVieewsBackend
#Base de datos
Las bases de datos utilizadas para estre proyecto son mongoDb y postgresql, 
Los BD estan importadas, dentro del la carpeta dataBase

#MongoDD
Se requiere intalado MongoDB
Para importar la BD no relacional se debera ingresar dentro de la carpeta dataBase

Se debera ejecutar los comandos:
1. mongorestore
2. rm -r dump

Para exportar la BD no relacional se debera ingresar dentro de la carpeta dataBase y ejecutar
1. mongodump --db MDB_MyVieews --host localhost:27017

#Postgresql

Se requiere tener instalado Postgresql, y pgAdmin4
Para importar la BD se debera:
- Iniciar pgAdmin4
- Crear una DB con el nombre MyVieews
- Importar el archivo sql de la carpeta dataBase/Db_Postgresql

Para exportar la BD no relacional se debera ingresar dentro de la carpeta dataBase y ejecutar
1. Iniciar pgAdmin4
2. Click derecho sobre la BD y seleccionar Backup
3. Reemplazarlo por dataBase/Db_Postgresql
