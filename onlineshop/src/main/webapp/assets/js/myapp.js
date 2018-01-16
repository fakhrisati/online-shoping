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

});