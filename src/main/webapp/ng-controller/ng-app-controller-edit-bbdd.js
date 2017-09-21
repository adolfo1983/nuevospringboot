app.controller('ng-app-controller-edit-bbdd', ['$scope', '$http', '$timeout', 'utilFactory',
    function ($scope, $http, $timeout, utilFactory)
    {
        
	
	(function(){
        console.log("Hola");
        $scope.test = function(){
             
        $http.post('/getItem',{})
                .thenfunction (response)
      {
        var data= response.data;
        $scope.lista=data;
        console.log("Adios");
      };
    };
	})();
        
    
//    function scopeEdit(data){
//    	var properties= [];
//		var prp= 'propiedad';
//		var n = 0;
//		var count = 0;
//		
//		(function ()
//				{
//				//Creación de un modelo con todas las propiedades de los objetos a enviar
//				var obj={}; //Creación de un objeto vacío donde meter el modelo
//				for(var i=0, maxi=data.length; i<maxi; i++){ //Bucle para recorrer los datos recibidos
//					for (attr in data[i])	//Seleccionamos cada propiedad del objeto de la lista de datos recibidos
//						{
//						//console.log(attr);
//						//var bool=0;
//						obj[attr]=null; //Inyectamos las propiedades que vamos encontrando en el objeto vacío y le asignamos null
//						
//							} 
//						}
//				console.log(JSON.stringify(obj));
//				
//				var lista=[]; //Creación de una lista para meter los objetos
//				for (var i=0, max=data.length; i<max; i++) //Bucle para recorrer la lista que queremos enviar
//					{
//					var obj2={}; //Creación de un objeto vacío donde introducir mi modelo relleno
//					
//						for(propiedad in obj)	//Bucle para acceder a las propiedades del modelo
//							{
//							var bool=false; //Creación de una variable booleana para comprobaciones
//								for(var objData in data[i]) //Bucle para recorrer las propiedades del objeto en el índice correspondiente de la lista
//									{
//										if(objData === propiedad) //Si las propiedades que va encontrando son iguales, pone el booleano a true
//											{
//											bool=true;
//											}
//									}
//								if (bool) //Si es verdadero, asigna en la propiedad del objeto creado, el valor que tiene en la lista
//									{
//									obj2[propiedad] =data[i][propiedad];
//									} else{ 		//Y si no, le asigna en esa propiedad el valor null
//										obj2[propiedad]=null;
//									}
//							}
//						lista.push(obj2); 	//Añade el objeto que hemos rellenado a la lista que vamos a enviar
//					}
//				return lista;		//Impresión de la lista
//				})();
    }]);