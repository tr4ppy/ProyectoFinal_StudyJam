Proyecto Final - Study Jam II 2016
===
<div align="center">
    <center>
        <img src="http://developerstudyjams.com/images/masthead.png" width="400px"/>
    </center>
</div>

Repositorio Proyecto Final del Study Jam Android Development for Beginners II 2016, llevado a cabo en la ciudad de La Paz, Bolivia a cargo del <a target="_blank" href="http://www.gdg.androidbolivia.com">GDG Android Bolivia</a> .

Nombre Aplicación.
---
El nombre de la aplicación es: NaviApp

Objetivo
---
* Proporcionar una lista de regalos para que la gente tenga más opciones para regalar y pueda conocer el precio de cada uno.
* Dar a conocer las canciones más populares con el tema de la Navidad para poder escucharlas en cualquier momento.

Caracteristicas
---
* Splashscreen compuesta por imágenes animadas.
* Varias canciones con las opciones de reproducir, pausar y detener.
* Una lista personalizada que contiene todos los regalos incluidos y la opción de ver en detalle cada uno.

Wireframes
---
Puedes visualizar los Wireframes de este proyecto.

https://www.ninjamock.com/s/HNSWH

Compatibilidad
---
Esta aplicación es compatible con versiones de Android 4.1 o superior.

Uso
---------
Para probar este ejemplo clona este repositorio de la siguiente forma:
>
>     $ git clone https://github.com/tr4ppy/ProyectoFinal_StudyJam.git

Luego de ello dentro de Android Studio:

* File --> New --> Import Project
* Seleccionas la ruta donde hiciste el `clone` del proyecto.
* Build --> Rebuild Project
* Run

Corrida previa
---
Aca te muestro cual es el funcionamiento de mi aplicación a grandes rasgos.
<div align="center">
    <center>
        <table border="0">
            <tr>
                <td><img src="/img/corrida1.gif" width="200" width="250"></td>
                <td><img src="/img/corrida2.gif" width="200" width="250"></td>
                <td><img src="/img/corrida3.gif" width="200" width="250"></td>
            </tr>
        </table>
    </center>
</div>
<br>

Descripción técnica
---
En este proyecto de utilizáron los siguientes componentes tanto en el `diseño` como en la `funcionalidad`:

**`Vista:`**
* LinearLayout (Horizontal y Vertical) para la alineación de las vistas principales.
* RelativeLayout, para el acomodamiento del MainActivity y el Splashscreen.
* ListView para mostrar los regalos de navidad y sus detalles.
* Buttons tanto para cambiar de activitys como para reproducir las canciones.
.
.
.

**`Funcionalidad:`**
* MediaPlayer, para reproducir las canciones de navidad.
* Animation, para que el Splashscreen se vea mejor y la aplicación tenga una buena presentación.
* Ciclo de vida de una Activity, para detectar cuando se coloca en Pausado asi pueda seguir ejecutandose una tarea.
.
.
.

Autor(a)
---
Andres Eduardo Rivero Miranda

Contactos
---
trappy19q@gmail.com

[Facebook](https://www.facebook.com/riveromiranda) <br>
[Twitter](https://twitter.com/tr4ppy_19)<br>
[Google Plus](https://plus.google.com/u/0/107485487838448828820)<br>
[Github](https://github.com/tr4ppy)<br>
