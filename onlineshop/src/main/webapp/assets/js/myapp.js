$(function(){
switch(menu){
    case 'about':
    $('#About').addClass('active');
    break;
    case 'contact':
    $('#Contact').addClass('active');
    break;
    case 'all Products':
    	 $('#listProducts').addClass('active');
    break;
    case 'home':
   	 $('#Home').addClass('active');
   break;
    default:
    
    $('#a_'+menu).addClass('active');
    break;


}


//code for jquery data table


 var $table = $('#productListTable');
 
 //execute the below code only where we have this table 
 if($table.length){
	/// console.log('Inside the table !');
	 
	  var jsonUrl = '';
	  if (window.categoryId == '') {
		  
		  jsonUrl = window.contextroot + '/json/data/all/products' ;  
	
	} else {
		  jsonUrl = window.contextroot + '/json/data/category/'+window.categoryId+'/products' ;
		 
	}
	 
	 
	 
	 
	 
	 
	 
	$table.dataTable({
		lengthMenu: [[3,5,10,-1],['3 Records','5 Records','10Records','All Records']],
		pageLength:5,
		 ajax:{
			 url : jsonUrl,
			 dataSrc : ''
		 },
		 columns: [  
			       
			      {
			    	data:'code',
			    	mRender: function (data,type,row) {
			    		return '<img src ="'+window.contextroot+'/assets/images/'+ data +'.png" class="dataTableImg"/>'
						
					}
			    	  
			      }   
			      ,
			      {
			    	  data:'name',
			    	  
			      }
			      ,
			      {
			    	  data:'brand',
			    	  
			      }
			      ,
			      {
			    	  data:'uintPrice',
			    	  mRender: function (data, type,row) {
			    		  return 'SDG '+ data;
					}
			    	  
			      }
			      ,
			      {
			    	  data:'quntity',
			    	  mRender: function (data, type,row) {
			    		  if(data<1){
			    			  return '<span style="color:red">Out of Stock</span>';
			    			  
			    		  }
			    		  return data;
			    	  }
			    	  
			      }
			      ,
			      {
			    	  data: 'id',
			    	  bSortable: false,
			      mRender: function(data,type,row) {
			    	  
			    	  var str = '' ;
			    	    str += '<a href="'+window.contextroot+'/show/'+data+'/product" class= "btn btn-primary" > View </a>&#160;';
			    	    if(row.quntity< 1){
			    	     str += '<a href="javascript:void(0)" class= "btn btn-success disabled"> Add to Cart </a>';
			    	    	
			    	    }else{
			    	    	 str += '<a href=" ' +window.contextroot+'/cart/add/'+data+'/product" class= "btn btn-success"> Add to Cart </a>';
			    	    }
			    	    	
			     	   
			    	  
					return str ;
				}
			    	  
			      }
			 
		            ]
	});
 }

});

