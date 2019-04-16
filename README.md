Que es Maven? 
Un administrandor de bibliotecas que nos ayuda a  agregar, actualizar, eliminar y distribuir las dependencias de nuestro proyecto.

POM que significa y para que nos sirve? 
Modelo de Objetos de Proyecto (POM). A traves de un archivo pom.xml podemos ver toda la informacion relevante sobre el proyecto, como por ejemplo
las distintas configuraciones de los plugins que necesitamos para el build del mismo.

 
Diferencia entre Archetype y ArtifactId.

Un Archetype es un template o plantilla de un proyecto Maven. Definido como un patron o modelo original a partir del cual todas las cosas del mismo estilo
son creadas.

Para crear un proyecto java con maven, debemos de indicarle el tipo de acción que queremos ejecutar (goal), identificar nuestro proyecto unívocamente 
(groupId y artifacId), así como seleccionar la plantilla inicial que queremos que nuestro proyecto tenga (archetypeArtifacId). 

Explique los siguientes goals de maven: clean, package, install, compile. 

Un goal representa un plugin de maven que puede ser añadido a una fase para poder especificar o extender el comportamiento de dicha fase 
y una fase específica que será ejecutada en la construcción de nuestro proyecto.

clean 
limpia todas las clases compiladas del proyecto.

install 
Compila, realiza la fase de pruebas, empaqueta e instala en nuestro repositorio local de maven el proyecto.

package 
Compila, ejecuta la fase de pruebas y posteriormente empaqueta el proyecto en un archivo .jar.

compile 
Compila nuestro proyecto y crea un nuevo directorio llamado target en donde almacena nuestras clases compiladas.


Explique los siguientes Scopes :complie, provided, runtime, test, system.

El scope sirve para indicar el alcance de nuestras dependencias. Por ejemplo indicar que la dependencia ABC no forme parte del empaquetado 
final de nuestro proyecto pero que sí esté presente durante la fase de la ejecución de pruebas unitarias.

compile: Es la que tenemos por defecto si no especificamos scope. Indica que la dependencia es necesaria para compilar.

provided: Es como la anterior, pero se espera que el contenedor ya tenga esa libreria. Por ejemplo cuando desplegamos en un servidor de 

aplicaciones, que por defecto, tienebastantes librerías que utilizaremos en el proyecto, así que no necesitamos desplegar la dependencia.

runtime: La dependencia es necesaria en tiempo de ejecución pero no es necesaria para compilar.

test: La dependencia es solo para testing que es una de las fases de compilación con maven. (por ejemplo Junit)

system: Es como provided pero hay que incluir la dependencia explicitamente. Maven no busca este articaft en el repositorio local. 
Hay que especificar la ruta de la dependencia mediante la etiqueta <systemPath>.


