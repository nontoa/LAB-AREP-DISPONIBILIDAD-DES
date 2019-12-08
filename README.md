# LAB-AREP-DISPONIBILIDAD-DESEMPEÑO

## Empezando

>Para clonar el archivo 

git clone https://github.com/nontoa/LAB-AREP-DISPONIBILIDAD-DES
>
### Prerrequisitos
* Maven
* Java
* Git


## Construido con

* [Maven](https://maven.apache.org/) - Gestión de dependencias

## Descripción:

### Amazon Gateway:

Amazon API Gateway es un servicio completamente administrado que facilita a los desarrolladores la creación, la publicación, el mantenimiento, el monitoreo y la protección de API a cualquier escala. Con tan solo unos clics en la consola de administración de AWS, puede crear API REST y API WebSocket que actúen como "puerta delantera" para que las aplicaciones obtengan acceso a datos, lógica de negocio o funcionalidades desde sus servicios backend, tales como cargas de trabajo ejecutadas en Amazon Elastic Compute Cloud (Amazon EC2), código ejecutado en AWS Lambda, cualquier aplicación web o aplicaciones de comunicación en tiempo real.

### Aws Lambda:

AWS Lambda le permite ejecutar código sin aprovisionar ni administrar servidores. Solo pagará por el tiempo informático que consuma. No se cobra nada cuando el código no se está ejecutando.

Con Lambda, puede ejecutar código para casi cualquier tipo de aplicación o servicio back-end sin tener que realizar tareas de administración. Solo tiene que cargar el código y Lambda se encargará de todo lo necesario para ejecutar y escalar el código con alta disponibilidad. Puede configurar su código para que se active automáticamente desde otros servicios de AWS o puede llamarlo directamente desde cualquier aplicación web o móvil.

### Aws EC2:

Amazon Elastic Compute Cloud (Amazon EC2) es un servicio web que proporciona capacidad informática en la nube segura y de tamaño modificable. Está diseñado para simplificar el uso de la informática en la nube a escala web para los desarrolladores.

La sencilla interfaz de servicios web de Amazon EC2 permite obtener y configurar capacidad con una fricción mínima. Proporciona un control completo sobre los recursos informáticos y puede ejecutarse en el entorno informático acreditado de Amazon. Amazon EC2 reduce el tiempo necesario para obtener e iniciar nuevas instancias de servidor en cuestión de minutos, lo que permite escalar rápidamente la capacidad, ya sea aumentándola o reduciéndola, en función de sus necesidades. Amazon EC2 cambia el modelo económico de la informática al permitir pagar solo por la capacidad que utiliza realmente. Amazon EC2 les brinda a los desarrolladores las herramientas necesarias para crear aplicaciones resistentes a errores y para aislarlas de los casos de error comunes.


Para más información visitar la página oficial de AWS. ( https://aws.amazon.com/es/ )

### AMI

Una Imagen de Amazon Machine (AMI) proporciona la información necesaria para lanzar una instancia. Debe especificar una AMI al lanzar una instancia. Cuando necesite varias instancias con la misma configuración, puede lanzarlas desde una misma AMI. Cuando necesite instancias con distintas configuraciones, puede usar distintas AMI para lanzarlas.

Una AMI incluye lo siguiente:

Una o más instantáneas de EBS o para las AMI con respaldo en el almacenamiento de la instancia, una plantilla para el volumen raíz de la instancia (por ejemplo, un sistema operativo, un servidor de aplicaciones y aplicaciones).

Permisos de lanzamiento que controlan qué cuentas de AWS pueden utilizar la AMI para lanzar instancias.

Un mapeo de dispositivos de bloques que especifica los volúmenes que se van a adjuntar a la instancia cuando se lance.

## Autor


* **Juan Nicolas Nontoa Caballero**  LAB2-AREP - [nontoa] (https://github.com/nontoa)

## Licencia

Este proyecto está licenciado bajo la Licencia GNU - vea el archivo [LICENSE](LICENSE) para más detalles.
