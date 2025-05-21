18-05-2025: Cree la mayoria de las clases del diagrama completo, aunque no las vayamos a usar a todas ahora.
Me faltan crear: PlanConstruccionES, TrabajoARealizar, TipoTrabajo, Suscripcion y Reparacion.
Cada clase tiene separados por comentarios: 
  -los atributos simples (atributos de la propia clase), 
  -atributos por referencia, 
  -getters y setters (Estos los genere con la herramienta automatica de Eclipse) 
Todavía no configuré ningún new()
Puede que las relaciones de agregación estén mal implementados
Hay algunos tipos de dato que me hacen ruido (ejemplo, el atributo "valor" de la clase "DetalleMuestraSismica"


20-05-2025:
Agregue los constructores sin parametros (sugerencia de ChatGPT para trabajar con frameworks, yo no tengo ni idea) y los constructores completos (con todos los parametros) a las clases que aparecen en nuestro Modelo de Analisis.
Hay algunas inconsistencias entre nuestro Modelo de Analis y el que nos proveyeron con el enunciado (Modelo de Dominio), habría que revisr si son aceptables o tenemos que regirnos especificamente por el diagrama que nos dieron. De todas formas estas inconsistencias son menores y fáciles de resolver. 
