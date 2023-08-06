GzCompose - Aplicación de Mensajería con Compose Este documento proporciona una descripción general
del código en los archivos MainActivity.kt y SampleData.kt de la aplicación Myapplication2687386. La
aplicación
es una interfaz de mensajería implementada utilizando la biblioteca de UI moderna de Jetpack
Compose. Permite a los usuarios visualizar conversaciones con mensajes y expandir los mensajes para
ver su contenido completo.

-Estructura del Código- Paquete y Clases Principales El código está organizado en el paquete
co.edu.sena.gzcompose. Las clases principales son las siguientes:

-MainActivity- MainActivity hereda de ComponentActivity. En el método onCreate, se configura el
contenido de la actividad utilizando el tema Myapplication2687386Theme en la cual ponemos solo los
metodos para ejecutarlos ya depsues de esyte medoto craremos todos lo metodos necesario para este
y asi que funcione y cree la propia interfaza, ademas de tener sus vistas previas antes de
actualizarlo y correlo ya sea desde una maquina virtual o desde el propio telefono, estas ayudan
al porpio desarrollo de esta misma simulacion de mensajeria cullo tutorial esta en la siguiente
pagina (https://developer.android.com/jetpack/compose/tutorial?hl=es-419).

-SampleData- SampleData es un objeto que proporciona datos de muestra para la conversación en la
aplicación. Contiene una lista de mensajes simulados que se utilizan para demostrar la funcionalidad
de la interfaz.

-Modelo de Datos- El modelo de datos incluye una clase Message que representa un mensaje en la
conversación. Cada mensaje tiene un autor y un cuerpo.

-Composables Principales- MessageCard: Este composable muestra un mensaje individual en forma de
tarjeta. Contiene la imagen del autor, el nombre del autor, el cuerpo del mensaje y la posibilidad
de expandir el mensaje para ver su contenido completo por medio de animaciones tambien representadas
en este mismo.

Conversation: Este composable utiliza un LazyColumn para mostrar una lista de mensajes. Utiliza el
composable MessageCard para representar cada mensaje en la conversación.

-Uso de Datos de Muestra- La clase SampleData proporciona una lista llamada conversationSample que
contiene varios objetos Message. Estos mensajes de muestra se utilizan para previsualizar cómo se
verían los mensajes en la conversación.

-Ejemplo: pues tenemos en el ejemplo o en la conversacion a tres personas las cuales son:
Duvan,Camilo
y Cordoba. Estan discutiendo sobre a donde iran de manera bastante logica y con sus problemas. pero
l
o interesante,es que aqui estamos simulandos un chat el cual fue basado en el chat de discord donde
mas de tres personas pueden interacturar entre si. Aunque le falten algunas cosas sirve para una
pequeña
simulacion cons us cambios para no hacer un copia y pega de la propia aplicacion.