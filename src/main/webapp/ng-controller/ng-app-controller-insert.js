app.controller('ng-app-controller-insert',
        ['$scope', '$http', '$timeout', 'utilFactory', function ($scope, $http, $timeout, utilFactory)
            {
        	
        	$scope.updateTable= function(){        
                $http.post('/update',{
        			table : send
                })
                        .then(function (response)
              {
                        	
            var send=[];
        	var forms = document.forms;
        	console.log(forms);
        	for(var i=0, max=forms.length; i<max; i++)
        		{
        			for(obj in forms[i])
        				{
        					if(obj.check.checked)
        						{
        							send.push(obj);
        						}
        				}
        		}
        		console.log(send);
                var data3= response.data;
                $scope.actual=data3;
                console.log(data3);
              });
            
        	};
        	 
        	 		}]);