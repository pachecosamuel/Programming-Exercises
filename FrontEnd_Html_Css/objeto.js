var pessoa = 
{
    nome: "Samuel",
    sobrenome: "Pacheco",
    idade: 31,
    endereco:{
        rua: "Rua mosela",
        numero: 120,
        cidade: "Petrópolis"
    },
    gritar: function(){
        console.log("SHOUT!")
    }
}

console.log(pessoa.nome);
console.log(pessoa.endereco.cidade);
pessoa.gritar();

var a = pessoa.gritar;

a();
