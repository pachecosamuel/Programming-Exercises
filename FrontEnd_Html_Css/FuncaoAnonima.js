// function olaMundo(){
//     return "Hellow World";
// }

// var texto = olaMundo();
// console.log(texto());


var texto = function(){
    return "Olá mundo";
}


function exibirTexto(func)
{
    console.log(func());
}

exibirTexto(texto);